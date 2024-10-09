import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import "./Employees.css"

function Employees() {
  const [data, setData] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    fetch('http://localhost:3001/employees')
      .then((res) => res.json())
      .then((res) => setData(res));
  }, []);

  return (
    <div className="container mt-5">
      <h2 className="text-center mb-4">All Employees</h2>
      <div className="row">
        {data.map((emp) => (
          <div className="col-md-4 mb-4" key={emp.empId}>
            <div className="card shadow-sm h-100">
              <div className="card-body">
                <h5 className="card-title">{emp.name}</h5>
                <p className="card-text">
                  <strong>ID:</strong> {emp.empId} <br />
                  <strong>Age:</strong> {emp.age} <br />
                  <strong>Department:</strong> {emp.department} <br />
                  <strong>Position:</strong> {emp.position} <br />
                  <strong>Salary:</strong> ${emp.salary}
                </p>
                <button
                  className="btn btn-primary"
                  onClick={() => navigate("/employees/" + emp.empId)}
                >
                  View Details
                </button>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Employees;
