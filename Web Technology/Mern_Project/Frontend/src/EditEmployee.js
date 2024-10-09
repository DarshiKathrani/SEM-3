import { useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import "./EditEmployee.css"

function EditEmployee() {
  const [val, setVal] = useState({});
  const { id } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    fetch("http://localhost:3001/employees/" + id, { method: "get" })
      .then((res) => res.json())
      .then((res) => setVal(res));
  }, [id]);

  return (
    <div className="container mt-5">
      <div className="card shadow-lg p-4">
        <h2 className="text-center mb-4">Edit Employee Details</h2>
        <form className="w-75 mx-auto">
          {/* Employee ID */}
          <div className="mb-3">
            <label className="form-label">Employee ID</label>
            <input
              type="number"
              className="form-control"
              value={val.empId || ""}
              onChange={(e) => setVal({ ...val, empId: parseInt(e.target.value) })}
              readOnly
            />
          </div>

          {/* Name */}
          <div className="mb-3">
            <label className="form-label">Employee Name</label>
            <input
              type="text"
              className="form-control"
              value={val.name || ""}
              onChange={(e) => setVal({ ...val, name: e.target.value })}
              placeholder="Enter employee name"
            />
          </div>

          {/* Age */}
          <div className="mb-3">
            <label className="form-label">Age</label>
            <input
              type="text"
              className="form-control"
              value={val.age || ""}
              onChange={(e) => setVal({ ...val, age: e.target.value })}
              placeholder="Enter employee age"
            />
          </div>

          {/* Department */}
          <div className="mb-3">
            <label className="form-label">Department</label>
            <input
              type="text"
              className="form-control"
              value={val.department || ""}
              onChange={(e) => setVal({ ...val, department: e.target.value })}
              placeholder="Enter department name"
            />
          </div>

          {/* Position */}
          <div className="mb-3">
            <label className="form-label">Position</label>
            <input
              type="text"
              className="form-control"
              value={val.position || ""}
              onChange={(e) => setVal({ ...val, position: e.target.value })}
              placeholder="Enter position title"
            />
          </div>

          {/* Salary */}
          <div className="mb-3">
            <label className="form-label">Salary</label>
            <input
              type="text"
              className="form-control"
              value={val.salary || ""}
              onChange={(e) => setVal({ ...val, salary: e.target.value })}
              placeholder="Enter employee salary"
            />
          </div>

          {/* Submit Button */}
          <div className="text-center mt-4">
            <button
              type="button"
              className="btn btn-primary"
              onClick={() => {
                fetch("http://localhost:3001/employees/" + val.empId, {
                  method: "put",
                  body: JSON.stringify(val),
                  headers: { "Content-Type": "application/json" },
                }).then(() => navigate("/employees/" + val.empId));
              }}
            >
              <i className="bi bi-check-circle"></i> Submit
            </button>

            <button
              type="button"
              className="btn btn-secondary mx-2"
              onClick={() => navigate("/employees/" + val.empId)}
            >
              <i className="bi bi-arrow-left"></i> Cancel
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default EditEmployee;
