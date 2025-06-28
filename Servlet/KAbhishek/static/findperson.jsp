<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>KAbhishek Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<header>
    <section>
        <nav class=" navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="findperson.jsp">find person</a>
                </li>
            </ul>
        </nav>
    </section>

    <main>
        <section>
            <h1>Find Register person Information</h1>
            <div class=" shadow rounded p-4"  >
                <form class="row g-3" action="registerdata" method="get">
                    <div class="col-md-6">


                        <label for="registerID" class="form-label"> Register ID</label >
                        <input type="text" class="form-control" id="registerID" name="registerName" plarceholder="Enter  Register ID " >

                    </div>

                    <div class="col-12">
                        <button type="submit" class="btn btn-primary">Submit ID</button>
                    </div>
                </form>
            </div>

        </section>
    </main>

</header>
<main>





    <!--    <div class="card" style="width:300px; height:200px;"  >-->
    <!--        <h5 class="card-header" >Login</h5>-->
    <!--        <div class="card-body">-->
    <!--            <h5 class="card-title">Special title treatment</h5>-->
    <!--            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>-->
    <!--            <a   href="registerpage" href="login.jsp" class="btn btn-primary">Go </a>-->
    <!--        </div>-->
    <!--    </div>-->
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>