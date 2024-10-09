import { useState, useEffect } from 'react';
import { useParams, useNavigate } from 'react-router-dom';

function DetailEmployee() {
  const [detail, setDetail] = useState({});
  const { id } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    fetch("http://localhost:3001/employees/" + id)
      .then((res) => res.json())
      .then((res) => setDetail(res));
  }, [id]);

  return (
    <div className="container mt-5">
      <div className="card shadow-lg p-4">
        <h2 className="text-center mb-4">Employee Details</h2>
        <div className="card-body">
          {/* Employee ID */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-person-badge-fill"></i> Employee ID
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.empId || ''}
                readOnly
              />
            </div>
          </div>

          {/* Name */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-person-fill"></i> Name
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.name || ''}
                readOnly
              />
            </div>
          </div>

          {/* Age */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-calendar"></i> Age
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.age || ''}
                readOnly
              />
            </div>
          </div>

          {/* Department */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-building"></i> Department
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.department || ''}
                readOnly
              />
            </div>
          </div>

          {/* Position */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-briefcase-fill"></i> Position
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.position || ''}
                readOnly
              />
            </div>
          </div>

          {/* Salary */}
          <div className="row mb-3">
            <label className="col-sm-3 col-form-label">
              <i className="bi bi-cash"></i> Salary
            </label>
            <div className="col-sm-9">
              <input
                type="text"
                className="form-control"
                value={detail.salary || ''}
                readOnly
              />
            </div>
          </div>

          {/* Action Buttons */}
          <div className="text-center mt-4">
            <button
              className="btn btn-secondary mx-2"
              onClick={() => navigate('/employees')}
            >
              <i className="bi bi-arrow-left"></i> Back to List
            </button>

            <button
              className="btn btn-primary mx-2"
              onClick={() => navigate("/editEmployee/" + id)}
            >
              <i className="bi bi-pencil-square"></i> Edit
            </button>

            <button
              className="btn btn-danger mx-2"
              onClick={() => {
                fetch("http://localhost:3001/employees/" + id, { method: "delete" })
                  .then(() => navigate("/employees"));
              }}
            >
              <i className="bi bi-trash"></i> Delete
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}

export default DetailEmployee;
