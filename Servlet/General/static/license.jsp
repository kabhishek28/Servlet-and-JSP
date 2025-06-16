<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FormZone</title>
    <link rel="icon" href="images/logo.png" type="image/png">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<style>
    body {
        background: linear-gradient(to right, #e0eafc, #cfdef3);
        font-family: 'Segoe UI', sans-serif;
    }

    .form-section {
            padding: 60px 0;
        }

    footer {
        text-align: center;
        padding: 10px ;
        background-color: #f8f9fa;
        font-size: 0.9rem;
    }
</style>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary ">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">FormZone</a>
            <!--            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">-->
            <!--                <span class="navbar-toggler-icon"></span>-->
            <!--            </button>-->
            <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link active" href="form.jsp">Forms</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link active" href="about.jsp">About</a>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link active" href="contact.jsp">Contact</a>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</header>

<main>
    <section class="form-section">
        <div class="container shadow-lg rounded p-4">
            <h2 class="text-center mb-5">Driving License Application Form</h2>
            <form class="row g-4 needs-validation" action="drivingLicense" method="post">
                <div class="col-md-6">
                    <label for="nameID" class="form-label">Full Name</label>
                    <input type="text" class="form-control" id="nameID" name="fullName" required>
                </div>

                <div class="col-md-6">
                    <label for="mobileID" class="form-label">Mobile Number</label>
                    <input type="tel" class="form-control" id="mobileID" name="mobile" pattern="[0-9]{10}" required>
                </div>

                <div class="col-md-12">
                    <label for="addressID" class="form-label">Residential Address</label>
                    <textarea class="form-control" id="addressID" name="address" rows="3" required></textarea>
                </div>

                <div class="col-md-6">
                    <label for="appliedDateID" class="form-label">Applied Date</label>
                    <input type="date" class="form-control" id="appliedDateID" name="appliedDate" required>
                </div>

                <div class="col-md-6">
                    <label for="vehicleTypeID" class="form-label">Vehicle Type</label>
                    <select class="form-select" id="vehicleTypeID" name="vehicleType" required>
                        <option value="" selected disabled>Select Vehicle Type</option>
                        <option>Motorcycle (Two Wheeler)</option>
                        <option>Light Motor Vehicle (Car)</option>
                        <option>Heavy Motor Vehicle (Truck/Bus)</option>
                        <option>Commercial Vehicle</option>
                    </select>
                </div>

                <div class="col-12 text-center mt-3 mb-3">
                    <button class="btn btn-primary px-4" type="submit">Submit Application</button>
                </div>
            </form>
        </div>
    </section>
</main>


<footer class="mt-auto">
    <div class="container">
        &copy; 2025 FormZone. All rights reserved.
    </div>
</footer>

</body>
</html>