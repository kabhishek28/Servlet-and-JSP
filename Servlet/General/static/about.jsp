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

        .about-section {
            padding: 80px 0;
        }
    .hero-section {
        height: 80vh;
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
    <section class="about-section">
        <div class="container">
            <h2 class="text-center mb-4">About FormZone</h2>
            <p class="lead text-center">FormZone is your reliable platform for submitting official and general-purpose forms in a fast, secure, and user-friendly manner.</p>
            <hr class="my-5">

            <div class="row g-4">
                <div class="col-md-6">
                    <h5> Our Mission</h5>
                    <p>We aim to simplify the way individuals and organizations handle official documents, reducing time and improving accuracy.</p>
                </div>
                <div class="col-md-6">
                    <h5> Why Choose Us?</h5>
                    <ul>
                        <li>Responsive design for all devices</li>
                        <li>Secure data handling</li>
                        <li>Multiple government-related services</li>
                        <li>Easy-to-use forms and quick submissions</li>
                    </ul>
                </div>
            </div>

            <hr class="my-5">

            <h4 class="mb-3 text-center"> Services We Provide</h4>
            <div class="row row-cols-1 row-cols-md-2 g-4">
                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">1. Job Application</h5>
                            <p class="card-text">Apply for jobs by filling in your Name, Email, Education, Skills, Expected Salary, and Experience.</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">2. Birth Certificate</h5>
                            <p class="card-text">Request a birth certificate with hospital details, parent's names, date, time, doctor and nurse info.</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">3. Passport</h5>
                            <p class="card-text">Submit passport applications using Aadhar, PAN, personal address, and payment references.</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">4. Death Certificate</h5>
                            <p class="card-text">Generate death certificates with cause, time, age, certifying authority, and hospital info.</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">5. Driving License</h5>
                            <p class="card-text">Apply for a license by providing name, address, contact, application date, and vehicle type.</p>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">6. Marriage Certificate</h5>
                            <p class="card-text"> Get marriage certificates by entering names, date, and location.
                                Also include religion and details of witnesses.             </p>
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