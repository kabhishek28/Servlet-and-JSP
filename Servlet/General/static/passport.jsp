<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FormZone</title>
    <link rel="icon" href="images/logo.png" type="image/png/jpg">

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
        <div class="container shadow-lg  rounded p-4">
            <h2 class="text-center mt-1 mb-4 ">Passport Application Form</h2>
            <form class="row g-4 needs-validation mt-3" action="passport" method="POST"  >

                <!-- Name -->
                <div class="col-md-6">
                    <label for="nameID" class="form-label">Applicant Name</label>
                    <input type="text" class="form-control" id="nameID" name="applicantName" required>
                    <div class="invalid-feedback">Please enter your name.</div>
                </div>

                <!-- Email -->
                <div class="col-md-6">
                    <label for="adharID" class="form-label">Adhar Number</label>
                    <input type="text" class="form-control" id="adharID" name="adharName" required>
                    <div class="invalid-feedback">Please enter a valid email.</div>
                </div>

                <div class="col-md-6">
                    <label for="panID" class="form-label">Pan Number</label>
                    <input type="text" class="form-control" id="panID" name="panName" required>
                    <div class="invalid-feedback">Please enter a valid email.</div>
                </div>


                <div class="col-md-6">
                    <label  class="form-label" for="passporttypeID">Passport Type</label>
                    <select  class="form-select"   name="passporttypeName" id="passporttypeID">
                        <option value="" selected disabled>Select</option>
                        <option>Ordinary Passport (Blue Cover)</option>
                        <option>Official Passport (White Cover)</option>
                        <option>Diplomatic Passport (Maroon/Burgundy Cover)</option>
                        <option>Emergency Certificate / Temporary Passport</option>
                        <option>E-passport / Biometric Passport</option>
                        <option>5</option>
                    </select>
                    <div class="invalid-feedback">Please select your experience level.</div>
                </div>


                <div class="col-md-6">
                    <label for="addressID" class="form-label">Address</label>
                    <input type="text" class="form-control" id="addressID" name="addressName"  required>
                    <div class="invalid-feedback">Please list your skills.</div>
                </div>

                <!-- Expected Salary -->
                <div class="col-md-6">
                    <label for="countryID" class="form-label">Country </label>
                    <input type="text" class="form-control" id="countryID" name="countryName"  required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
                </div>

                <div class="col-md-6">
                    <label for="stateID" class="form-label">State </label>
                    <input type="text" class="form-control" id="stateID" name="stateName"  required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
                </div>


                <div class="col-md-6">
                    <label for="cityID" class="form-label">City </label>
                    <input type="text" class="form-control" id="cityID" name="cityName"  required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
                </div>


                <div class="col-md-6">
                    <label for="pinID" class="form-label">Pin Code </label>
                    <input type="text" class="form-control" id="pinID" name="pinName"  required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
                </div>

                <div class="col-md-6">
                    <label for="paymentID" class="form-label">Payment Reference No</label>
                    <input type="text" class="form-control" id="paymentID" name="paymentName"  required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
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