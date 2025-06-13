<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact</title>
</head>
<body>
<h1>Contact</h1>
<div>
    <form action="contact" method="post">
        <div>
            <label for="nameID">Name</label>
            <span>*</span>
            <span>:</span>
            <input type="text" name="Name" id="nameID" required>
        </div>

        <div>
            <label for="emailID">email</label>
            <span>*</span>
            <span>:</span>
            <input type="email" name="email" id="emailID" required>
        </div>

        <div>
            <label for="numID">Phone</label>
            <span>*</span>
            <span>:</span>
            <input type="number" name="number" id="numID" required>
        </div>

        <div>
            <label for="commentsID">Comments</label>
            <span>*</span>
            <span>:</span>
            <input type="text" name="comments" id="commentsID" required>
        </div>

    <button type="submit" >contact</button>

    </form>
</div>
</body>
</html>