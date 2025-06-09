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
    <section>
        <div class=" shadow rounded p-4"  >
            <form class="row g-3" action="theft" method="post">
                <div class="col-md-6">
                    <label for="inputName" class="form-label">Name</label>
                    <input type="text" class="form-control" id="inputName" name="nameName" placeholder="Enter full name">
                </div>
                <div class="col-md-6">
                    <label for="inputMobile" class="form-label">Mobile</label>
                    <input type="tel" class="form-control" id="inputMobile" name="mobile" placeholder="10-digit mobile number">
                </div>

                <div class="col-md-6">
                    <label for="inputAge" class="form-label">Age</label>
                    <input type="number" class="form-control" id="inputAge" name="age" placeholder="Enter age">
                </div>
                <div class="col-md-6">
                    <label for="inputLocation" class="form-label">Location</label>
                    <input type="text" class="form-control" id="inputLocation" name="location" placeholder="Place where item/person was lost">
                </div>

                <div class="col-12">
                    <label for="inputAddress" class="form-label">Address</label>
                    <input type="text" class="form-control" id="inputAddress" name="address" placeholder="Full address">
                </div>

                <div class="col-md-6">
                    <label for="inputItem" class="form-label">Item</label>
                    <input type="text" class="form-control" id="inputItem" name="item" placeholder="Lost item description">
                </div>
                <div class="col-md-6">
                    <label for="inputLostOn" class="form-label">Lost On</label>
                    <input type="date" class="form-control" name="date" id="inputLostOn">
                </div>

                <div class="col-12">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="confirmationCheck">
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