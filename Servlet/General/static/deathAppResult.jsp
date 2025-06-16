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
    .resultTable{

    margin:100px 10px 10px 0px;

    text-align: center;



    }
</style>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary ">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">FormZone</a>

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


    <div class="card text-center m-5 shadow p-3 mb-5 bg-body-tertiary rounded">
        <div class="card-header">
            <h4>Death Application</h4>
        </div>
        <div>
            <table class="table table-bordered    table-light table-striped ">

                <tbody>
                <tr>
                    <th scope="row">Full Name of Deceased</th>
                    <td>${death.fullName}</td>

                </tr>
                <tr>
                    <th scope="row">Gender</th>
                    <td>${death.gender}</td>

                </tr>
                <tr>
                    <th scope="row">Age at Death</th>
                    <td>${death.age}</td>

                </tr>
                <tr>
                    <th scope="row">Date of Death</th>
                    <td>${death.dateOfDeath}</td>

                </tr>
                <tr>
                    <th scope="row">Time of Death</th>
                    <td>${death.timeOfDeath}</td>

                </tr>
                <tr>
                    <th scope="row">Cause of Death</th>
                    <td>${death.causeOfDeath}</td>

                </tr>
                <tr>
                    <th scope="row">Manner of Death</th>
                    <td>${death.mannerOfDeath}</td>

                </tr>
                <tr>
                    <th scope="row">Certified By</th>
                    <td>${death.certifiedBy}</td>

                </tr>
                <tr>
                    <th scope="row">Hospital Name</th>
                    <td>${death.hospitalName}</td>

                </tr>
                <tr>
                    <th scope="row">Identification Marks</th>
                    <td>${death.identificationMarks}</td>

                </tr>
                <tr>
                    <th scope="row">Certified By</th>
                    <td>${death.certifiedBy}</td>

                </tr>
                </tbody>
            </table>
        </div>


    </div>



</main>

<footer class="mt-auto">
    <div class="container">
        &copy; 2025 FormZone. All rights reserved.
    </div>
</footer>

</body>
</html>