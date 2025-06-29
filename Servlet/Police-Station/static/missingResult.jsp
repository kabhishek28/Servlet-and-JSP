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

        body {
            background-color: #f8f9fa;
        }
        .card {
            animation: fadeInUp 0.6s ease-in-out;
        }
        @keyframes fadeInUp {
            from {
                transform: translateY(20px);
                opacity: 0;
            }
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }
        th {
            width: 30%;
            background-color: #f1f1f1;
        }
        td {
            font-weight: 500;
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
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card shadow rounded border-primary">
                    <div class="card-header bg-primary text-white text-center">
                        <h4 class="mb-0">Missing Person Report Summary</h4>
                    </div>
                    <div class="card-body bg-white">
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <th>Missing Person Name</th>
                                <td>${missingPersonName}</td>
                            </tr>
                            <tr>
                                <th>Complaintee Mobile</th>
                                <td>${complainteeMobile}</td>
                            </tr>
                            <tr>
                                <th>Age</th>
                                <td>${missingPersonAge}</td>
                            </tr>
                            <tr>
                                <th>Gender</th>
                                <td>${missingPersonGender}</td>
                            </tr>
                            <tr>
                                <th>Languages Known</th>
                                <td>${languageKnown}</td>
                            </tr>
                            <tr>
                                <th>Identifying Marks</th>
                                <td>${identifyingMarks}</td>
                            </tr>
                            <tr>
                                <th>Address</th>
                                <td>${address}</td>
                            </tr>
                            <tr>
                                <th>Last Seen Location</th>
                                <td>${location}</td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="text-center mt-4">
                            <a href="index.jsp" class="btn btn-secondary px-4">Back to Home</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>

</body>
</html>