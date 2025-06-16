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


        padding:60px 0;
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
            <h2 class="text-center mb-5">Death Certificate Application Form</h2>
            <form class="row g-4 needs-validation" action="death" method="post">
                <div class="col-md-6">
                    <label for="nameID" class="form-label">Full Name of Deceased</label>
                    <input type="text" class="form-control" id="nameID" name="fullName" required>
                </div>

                <div class="col-md-6">
                    <label for="genderID" class="form-label">Gender</label>
                    <select class="form-select" id="genderID" name="gender" required>
                        <option value="" selected disabled>Select Gender</option>
                        <option>Male</option>
                        <option>Female</option>
                        <option>Other</option>
                    </select>
                </div>

                <div class="col-md-6">
                    <label for="ageID" class="form-label">Age at Death</label>
                    <input type="number" class="form-control" id="ageID" name="age" required>
                </div>

                <div class="col-md-6">
                    <label for="dateID" class="form-label">Date of Death</label>
                    <input type="date" class="form-control" id="dateID" name="dateOfDeath" required>
                </div>

                <div class="col-md-6">
                    <label for="timeID" class="form-label">Time of Death</label>
                    <input type="time" class="form-control" id="timeID" name="timeOfDeath" required>
                </div>

                <div class="col-md-6">
                    <label for="causeID" class="form-label">Cause of Death</label>
                    <input type="text" class="form-control" id="causeID" name="causeOfDeath" required>
                </div>

                <div class="col-md-6">
                    <label for="mannerID" class="form-label">Manner of Death</label>
                    <select class="form-select" id="mannerID" name="mannerOfDeath" required>
                        <option value="" selected disabled>Select Manner</option>
                        <option>Natural</option>
                        <option>Accidental</option>
                        <option>Homicide</option>
                        <option>Suicide</option>
                        <option>Undetermined</option>
                    </select>
                </div>

                <div class="col-md-6">
                    <label for="certifiedByID" class="form-label">Certified By</label>
                    <input type="text" class="form-control" id="certifiedByID" name="certifiedBy" required>
                </div>

                <div class="col-md-6">
                    <label for="hospitalID" class="form-label">Hospital Name</label>
                    <select class="form-select" id="hospitalID" name="hospitalName" required>
                        <option value="" selected disabled>Select Hospital</option>
                        <option>A.M. Hospital</option>
                        <option>Rainbow Children's Hospital</option>
                        <option>Fortis Hospital</option>
                        <option>Manipal Hospital</option>
                    </select>
                </div>

                <div class="col-md-6">
                    <label for="marksID" class="form-label">Identification Marks</label>
                    <input type="text" class="form-control" id="marksID" name="identificationMarks">
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