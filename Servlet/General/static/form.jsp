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

    .hero-section {
        height: 80vh;
    }


    .services-section {
            padding: 60px 0;
        }

        .card:hover {
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            transition: 0.3s ease;
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
    <section class="services-section">
        <div class="container">
            <h2 class="text-center mb-5">Choose a Service</h2>
            <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4">


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Job Application</h5>
                            <p class="card-text">Submit your job profile with education, skills, salary, and experience.</p>
                            <a href="job.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Birth Certificate</h5>
                            <p class="card-text">Get birth certificates using parent info, hospital, time, and doctor details.</p>
                            <a href="birth.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Passport</h5>
                            <p class="card-text">Apply using Aadhar, PAN, address, country, and payment info.</p>
                            <a href="passport.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Death Certificate</h5>
                            <p class="card-text">Fill in details like name, cause, time, hospital, and certifier.</p>
                            <a href="death.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Driving License</h5>
                            <p class="card-text">Provide address, vehicle type, and application date to apply.</p>
                            <a href="license.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>


                <div class="col">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Marriage Certificate</h5>
                            <p class="card-text">Enter names, date, location, religion, and witness information.</p>
                            <a href="marriage.jsp" class="btn btn-primary">Apply Now</a>
                        </div>
                    </div>
                </div>

            </div>
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