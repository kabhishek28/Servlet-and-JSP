<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report Crime</title>
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
    <div>
        <h1>MISSING FIR</h1>
    </div>
    <section>
        <div class=" shadow rounded p-4"  >
            <form class="row g-3" action="missing" method="post">
                <div class="col-md-6">
                    <label for="missingPersonName" class="form-label">Missing Person Name</label>
                    <input type="text" class="form-control" id="missingPersonName" name="missingPersonName" placeholder="Enter missing person's name">
                </div>

                <div class="col-md-6">
                    <label for="complainteeMobile" class="form-label">Complaintee Mobile</label>
                    <input type="tel" class="form-control" id="complainteeMobile" name="complainteeMobile" placeholder="10-digit mobile number">
                </div>

                <div class="col-md-6">
                    <label for="missingPersonAge" class="form-label">Missing Person Age</label>
                    <input type="number" class="form-control" id="missingPersonAge" name="missingPersonAge" placeholder="Enter age">
                </div>

                <div class="col-md-6">
                    <label for="missingPersonGender" class="form-label">Missing Person Gender</label>
                    <select class="form-select" id="missingPersonGender" name="missingPersonGender">
                        <option selected disabled>Choose...</option>
                        <option>Male</option>
                        <option>Female</option>
                        <option>Other</option>
                    </select>
                </div>

                <div class="col-md-6">
                    <label for="languageKnown" class="form-label">Languages Known</label>
                    <input type="text" class="form-control" id="languageKnown" name="languageKnown" placeholder="E.g., English, Hindi, Kannada">
                </div>

                <div class="col-md-6">
                    <label for="identifyingMarks" class="form-label">Identifying Marks</label>
                    <input type="text" class="form-control" id="identifyingMarks" name="identifyingMarks" placeholder="Any visible marks/scars">
                </div>

                <div class="col-12">
                    <label for="address" class="form-label">Complaintee Address</label>
                    <input type="text" class="form-control" id="address" name="address" placeholder="Full address of complaintee">
                </div>

                <div class="col-12">
                    <label for="location" class="form-label">Last Seen Location</label>
                    <input type="text" class="form-control" id="location" name="location" placeholder="Place where person was last seen">
                </div>

                <div class="col-12">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="confirmationCheck" required>
                        <label class="form-check-label" for="confirmationCheck">
                            I confirm that the above information is correct.
                        </label>
                    </div>
                </div>

                <div class="col-12">
                    <button type="submit" class="btn btn-primary">Submit Report</button>
                </div>
            </form>

        </div>
    </section>
</main>

</body>
</html>