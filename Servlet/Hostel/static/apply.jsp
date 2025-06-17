<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hostel</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<style>
    .title{
    padding-left:10px;
    }

    img{
    height:500px;
    }
    body{
        background-color: azure;
        }

    .form-section {
            background-color: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 12px rgba(0,0,0,0.05);
        }
        .form-heading {
            font-weight: bold;
            margin-bottom: 20px;
            color: #198754;
        }

</style>
<body>
<header>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

    <nav class="navbar navbar-expand-lg   " style="background-color: #e3f2fd;" data-bs-theme="light">
        <div class="container-fluid">
            <!--            <img src="image/images.jpg" alt="Bootstrap" width="50" height="44" >-->

            <a class="navbar-brand title" href="index.jsp">Hostel</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="Facilities.jsp">Facilities</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="Contact.jsp">Contact</a>
                    </li>
                    <!--                    <li class="nav-item">-->
                    <!--                        <a class="nav-link  icon-link " href="#">Contact</a>-->
                    <!--                    </li>-->
                    <li class="nav-item">
                        <a class="nav-link  icon-link " href="aboutus.jsp">About Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-light text-success ms-2" href="apply.jsp">Apply Now</a>
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
        <div class="container py-5">
            <div class="row justify-content-center">
                <div class="col-md-8 form-section">
                    <h2 class="form-heading text-center">Hostel Admission Form</h2>
                    <form action="hostel" method="post">

                        <!-- 1. Student Name (String) -->
                        <div class="mb-3">
                            <label for="studentName" class="form-label">Full Name</label>
                            <input type="text" class="form-control" id="studentName" name="nameName" placeholder="Enter full name" required>
                        </div>

                        <!-- 2. Email (String) -->
                        <div class="mb-3">
                            <label for="email" class="form-label">Email ID</label>
                            <input type="email" class="form-control" id="email" name="emailName" placeholder="example@domain.com" required>
                        </div>

                        <!-- 3. Phone Number (String) -->
                        <div class="mb-3">
                            <label for="phone" class="form-label">Phone Number</label>
                            <input type="text" class="form-control" id="phone" name="phoneName" placeholder="10-digit mobile number" required>
                        </div>

                        <!-- 4. Address (String) -->
                        <div class="mb-3">
                            <label for="address" class="form-label">Residential Address</label>
                            <input type="text" class="form-control" id="address" name="addressName" placeholder="Full address" required>
                        </div>

                        <!-- 5. College/Institute (String) -->
                        <div class="mb-3">
                            <label for="college" class="form-label">College/Institute</label>
                            <input type="text" class="form-control" id="college" name="collegeName" placeholder="College name" required>
                        </div>

                        <!-- 6. Gender (String - dropdown) -->
                        <div class="mb-3">
                            <label for="gender" class="form-label">Gender</label>
                            <select class="form-select" id="gender" name="genderName" required>
                                <option selected disabled value="">Choose...</option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                <option value="Other">Other</option>
                            </select>
                        </div>

                        <!-- 7. Age (Number) -->
                        <div class="mb-3">
                            <label for="age" class="form-label">Age</label>
                            <input type="number" class="form-control" id="age" name="ageName" min="16" max="60" placeholder="Enter age" required>
                        </div>

                        <!-- 8. Terms Agreement (Boolean) -->
                        <div class="form-check mb-3">
                            <input class="form-check-input" type="checkbox" id="terms" name="checkName" required value="true">
                            <label class="form-check-label" for="terms">
                                I agree to the terms and conditions of hostel accommodation.
                            </label>
                        </div>

                        <!-- Submit Button -->
                        <button type="submit" class="btn btn-success w-100">Submit Application</button>

                    </form>
                </div>
            </div>
        </div>

    </section>




</main>

</body>
</html>