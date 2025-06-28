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
    <div>
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
            </ul>
        </nav>
    </section>
    </div>

</header>
<main>
   <section>
       <div>

               <div class=" shadow rounded p-4"  >
                   <form class="row g-3" action="registerdata" method="post">
                       <div class="col-md-6">


                           <label for="nameID" class="form-label"> Name</label >
                           <input type="text" class="form-control" id="nameID" name="nameName" placeholder="Enter  person's name" value=" ${dto.name}">
                           <span>
                               ${returnmessage}
                           </span>
                       </div>



                       <div class="col-md-6">
                           <label for="mailID" class="form-label"> Email </label>
                           <input type="email" class="form-control" id="mailID" name="emailName" placeholder="Enter email" value=" ${dto.email}">
                       </div>



                       <div class="col-md-6">

                           <div>
                               <label for="mobileID" class="form-label"> Mobile No</label>
                               <input type="tel" class="form-control" id="mobileID" name="mobileName" placeholder="10-digit mobile number" value=" ${dto.phoneNo}">
                           </div>
                           <span>${returnmessagee}</span>
                       </div>

                       <div class="col-md-6">
                           <label for="genderID" class="form-label"> Person Gender</label>
                           <select class="form-select" id="genderID" name="genderName">
                               <option selected disabled>Choose...</option>
                               <option>Male</option>
                               <option>Female</option>
                               <option>Other</option>
                           </select>
                       </div>


                       <div class="col-12">
                           <label for="addressID" class="form-label"> Address</label>
                           <input type="text" class="form-control" id="addressID" name="addressName" placeholder="Full address of complaintee" value=" ${dto.address}">
                       </div>





                       <div class="col-12">
                           <button type="submit" class="btn btn-primary">Submit Report</button>
                       </div>
                   </form>

               </div>

       </div>
   </section>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>