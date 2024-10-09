import { useState } from "react";
import { useNavigate } from "react-router-dom";


function AddEmployee() {
  const [data, setData] = useState({});
  const navigate = useNavigate();

  const handleSubmit = () => {
    fetch("http://localhost:3001/employees/", {
      method: "post",
      body: JSON.stringify(data),
      headers: { "Content-Type": "application/json" },
    })
      .then((res) => res.json())
      .then(() => navigate("/employees"));
  };

  return (
    <div className="container mt-5">
      <div className="card shadow p-4">
        <h2 className="text-center mb-4">Add New Employee</h2>
        <form className="w-75 mx-auto">
          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Employee ID</label>
            <div className="col-sm-8">
              <input
                type="number"
                className="form-control"
                onChange={(e) => setData({ ...data, empId: parseInt(e.target.value) })}
              />
            </div>
          </div>

          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Employee Name</label>
            <div className="col-sm-8">
              <input
                type="text"
                className="form-control"
                onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div>
          </div>

          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Employee Age</label>
            <div className="col-sm-8">
              <input
                type="number"
                className="form-control"
                onChange={(e) => setData({ ...data, age: e.target.value })}
              />
            </div>
          </div>

          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Department</label>
            <div className="col-sm-8">
              <input
                type="text"
                className="form-control"
                onChange={(e) => setData({ ...data, department: e.target.value })}
              />
            </div>
          </div>

          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Position</label>
            <div className="col-sm-8">
              <input
                type="text"
                className="form-control"
                onChange={(e) => setData({ ...data, position: e.target.value })}
              />
            </div>
          </div>

          <div className="form-group row mb-3">
            <label className="col-sm-4 col-form-label">Salary</label>
            <div className="col-sm-8">
              <input
                type="number"
                className="form-control"
                onChange={(e) => setData({ ...data, salary: e.target.value })}
              />
            </div>
          </div>

          <div className="text-center">
            <button
              type="button"
              className="btn btn-primary w-50"
              onClick={handleSubmit}
            >
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default AddEmployee;
