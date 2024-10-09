import { useNavigate, Outlet } from "react-router-dom";
import { useState } from "react";
import "./Search.css";

function SearchEmployee() {
  const [detail, setDetail] = useState({});
  const navigate = useNavigate();

  return (
    <div className="container mt-5">
      {/* Search Card */}
      <div className="card shadow-lg p-4">
        <h2 className="text-center mb-4">Search for an Employee</h2>

        <div className="input-group mb-3 w-75 mx-auto">
          <input
            type="number"
            className="form-control"
            placeholder="Enter Employee ID"
            onChange={(e) => {
              setDetail({ ...detail, empId: parseInt(e.target.value) });
            }}
          />
          <button
            className="btn btn-primary"
            type="button"
            onClick={() => {
              navigate("/employees/" + detail.empId);
            }}
          >
            <i className="bi bi-search"></i> Search
          </button>
        </div>

        <p className="text-center text-muted">
          Enter the Employee ID to view details.
        </p>
      </div>

     
      <Outlet />
    </div>
  );
}

export default SearchEmployee;
