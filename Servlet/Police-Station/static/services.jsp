<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Police Services</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<style>
    .title{
    padding-left:10px;
    }

</style>
<body>
<header>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

    <nav class="navbar navbar-expand-lg bg-dark  " data-bs-theme="dark">
        <div class="container-fluid">
            <img src="image/images.jpg" alt="Bootstrap" width="50" height="44" >

            <a class="navbar-brand title" href="index.jsp">Police</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="services.jsp">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="report.jsp">Report Crime</a>
                    </li>
                    <!--                    <li class="nav-item">-->
                    <!--                        <a class="nav-link  icon-link " href="#">Contact</a>-->
                    <!--                    </li>-->
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="aboutus.jsp">About Us</a>
                    </li>

                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>

<main>
    <section>
        <div class="container mt-5">
            <h2 class="mb-4">Our Services</h2>

            <div class="row">
                <div class="col-md-6 mb-4">
                    <h4>FIR Registration</h4>
                    <p>Register First Information Reports for crimes. This can be done online or by visiting your nearest police station.</p>
                </div>
                <div class="col-md-6 mb-4">
                    <h4>Missing Person Complaint</h4>
                    <p>Report and track cases of missing persons. Our team actively works on locating missing individuals.</p>
                </div>
                <div class="col-md-6 mb-4">
                    <h4>No Objection Certificate (NOC)</h4>
                    <p>Apply for NOCs required for passport verification, events, or other legal matters.</p>
                </div>
                <div class="col-md-6 mb-4">
                    <h4>Traffic Services</h4>
                    <p>Information about traffic rules, challans, and road safety services provided by the department.</p>
                </div>
                <div class="col-md-6 mb-4">
                    <h4>Women's Safety Helpline</h4>
                    <p>Dedicated services and support lines for women's safety and harassment complaints.</p>
                </div>
                <div class="col-md-6 mb-4">
                    <h4>Cyber Crime Support</h4>
                    <p>Report cyber crimes like online fraud, harassment, and digital identity theft. Specialized cyber cells are available.</p>
                </div>
            </div>
        </div>
    </section>
</main>

</body>
</html>