import { useNavigate } from "react-router-dom";
import introimg1 from "./introimg1.png";
import image1 from "./image1.png";
import image3 from "./image3.png";

function Home() {
  const navigate = useNavigate();

  return (
    <div>
      {/* Hero Section */}
      <div className="hero-section text-center text-white d-flex align-items-center justify-content-center">
        <div>
          
          <p className="lead">Your Ultimate Solution for Workforce Management</p>
          <button
            className="btn btn-primary btn-lg mt-3"
            onClick={() => {
              navigate("/employees");
            }}
          >
            Get Started
          </button>
        </div>
      </div>

      {/* Features Section */}
      <div className="container my-5">
        <h2 className="text-center mb-4">Why Choose Our Platform?</h2>
        <div className="row text-center">
          <div className="col-md-4">
            <div className="card shadow-sm h-100">
              <img src={introimg1} className="card-img-top" alt="Feature 1" />
              <div className="card-body">
                <h5 className="card-title">Easy Employee Management</h5>
                <p className="card-text">
                  Effortlessly manage employee data, including names, ages, and
                  unique employee IDs.
                </p>
              </div>
            </div>
          </div>
          <div className="col-md-4">
            <div className="card shadow-sm h-100">
              <img src={image1} className="card-img-top" alt="Feature 2" />
              <div className="card-body">
                <h5 className="card-title">Efficient Payroll</h5>
                <p className="card-text">
                  Ensure accurate payroll processing with salary management
                  integration.
                </p>
              </div>
            </div>
          </div>
          <div className="col-md-4">
            <div className="card shadow-sm h-100">
              <img src={image3} className="card-img-top" alt="Feature 3" />
              <div className="card-body">
                <h5 className="card-title">Department Organization</h5>
                <p className="card-text">
                  Categorize employees by department and position for better
                  organizational clarity.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Home;
