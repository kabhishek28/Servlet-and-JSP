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
        <div class="container shadow-lg  rounded mt-5">
            <h2 class="text-center mb-5">Job Application Form</h2>
            <form class="row g-4 needs-validation" action="job" method="POST"  >

                <!-- Name -->
                <div class="col-md-6">
                    <label for="name" class="form-label">Full Name</label>
                    <input type="text" class="form-control" id="name" name="fullName" required>
                    <div class="invalid-feedback">Please enter your name.</div>
                </div>

                <!-- Email -->
                <div class="col-md-6">
                    <label for="email" class="form-label">Email Address</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                    <div class="invalid-feedback">Please enter a valid email.</div>
                </div>

                <!-- Education -->
                <div class="col-md-6">
                    <label for="education" class="form-label">Education</label>
                    <select class="form-select" id="education" name="education" required>
                        <option value="" selected disabled>Select</option>
                        <option>BCA</option>
                        <option>MCA</option>
                        <option>BE</option>
                        <option>ME</option>
                    </select>
                    <div class="invalid-feedback">Please select your education level.</div>
                </div>

                <!-- Skills -->
                <div class="col-md-6">
                    <label for="skills" class="form-label">Skills</label>
                    <input type="text" class="form-control" id="skills" name="skill" placeholder="e.g. Java, HTML, SQL" required>
                    <div class="invalid-feedback">Please list your skills.</div>
                </div>

                <!-- Expected Salary -->
                <div class="col-md-6">
                    <label for="salary" class="form-label">Expected Salary</label>
                    <input type="text" class="form-control" id="salary" name="expectedSalary" placeholder="e.g. 40000/month" required>
                    <div class="invalid-feedback">Please enter expected salary.</div>
                </div>

                <!-- Experience -->
                <div class="col-md-6">
                    <label  class="form-label" for="experience">Experience</label>
                    <select  class="form-select"   name="experience" id="experience">
                        <option value="" selected disabled>Select</option>
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    </select>
                    <div class="invalid-feedback">Please select your experience level.</div>
                </div>

                <!-- Submit -->
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