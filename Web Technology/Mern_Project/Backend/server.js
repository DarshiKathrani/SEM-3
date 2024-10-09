const express = require("express");
const cors = require("cors");
const mongoose = require("mongoose");
const bodyParser = require("body-parser");
const Employee = require("./models/Employee");

mongoose
  .connect(
    "mongodb+srv://darshi90837:darshi90837@cluster0.agqw8.mongodb.net/crudproject"
  )
  .then(() => {
    const app = express();
    app.use(express.json());
    app.use(cors({
      origin: 'http://localhost:3000' 
  })); 
    app.use(bodyParser.urlencoded({ extended: false }));

    //Get ALL employees
    app.get("/employees", async (req, res) => {
      const empData = await Employee.find();
      res.json(empData);
    });

    //Get single employee

    app.get("/employees/:id", async (req, res) => {
      const empData = await Employee.findOne({ empId: req.params.id });
      res.json(empData);
    });

    //Create new employee

    app.post("/employees", async (req, res) => {
      const emp = new Employee({
        empId: req.body.empId,
        name: req.body.name,
        age: req.body.age,
        department: req.body.department,
        position: req.body.position,
        salary: req.body.salary,
      });
      await emp.save();
      console.log(emp);
      res.json(emp);
    });

    //delete employee

    app.delete("/employees/:id", async (req, res) => {
      const emp = await Employee.findOne({ empId: req.params.id });
      await emp.deleteOne();
      if (!emp) {
        return res.status(404).send("Employee not found");
      }
      res.json(emp);
    });

    //update employee

    app.put("/employees/:id", async (req, res) => {
      console.log(req.body);
      const data = await Employee.findOne({ empId: req.params.id });
      data.empId = req.body.empId;
      data.name = req.body.name;
      data.age = req.body.age;
      data.department = req.body.department;
      data.position = req.body.position;
      data.salary = req.body.salary;
      await data.save();
      res.json(data);
    });

    app.listen(3001, () => console.log("listening on port 3001"));
  });
