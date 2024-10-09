import { Link, Outlet } from "react-router-dom";
import logoimg2 from "./logoimg2.png";
import "./Layout.css"; 

function Layout() {
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
        <div className="container-fluid">
          <a className="navbar-brand" href="/">
            <img src={logoimg2} width="50" alt="Logo" className="me-2" />
            Employee Management
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav ms-auto">
              <li className="nav-item">
                <Link to="/" className="nav-link active">
                  <i className="fas fa-home me-1"></i>Home
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/employees" className="nav-link">
                  <i className="fas fa-users me-1"></i>Employees
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/searchEmployee" className="nav-link">
                  <i className="fas fa-search me-1"></i>Search
                </Link>
              </li>
              <li className="nav-item">
                <Link to="/addEmployee" className="nav-link">
                  <i className="fas fa-user-plus me-1"></i>Add
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <div className="container mt-5">
        <h1 className="text-center">Welcome to the Employee Management System</h1>
        <p className="text-muted text-center">
          Manage your employee data efficiently and seamlessly.
        </p>

        <Outlet />
      </div>
    </>
  );
}

export default Layout;
