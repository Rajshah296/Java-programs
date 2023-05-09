<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>

<body>
    <div class="container border border-5 border-black" style="width: 30%; padding: 1rem; margin-top: 2rem;">
        <p class="h3 text-center mt-2 mb-4">Login</p>
        <form class="p-1"action="welcome.jsp" method="post">
            <label class="form-label pe-3" for="fname">Enter First Name:</label>
            <input class="form-control w-50 mb-4 d-inline" type="text" name="fname" id="fname"><br>
            <label class="form-label pe-3" for="pass">Enter Password:</label>
            <input class="form-control w-50 mb-4 d-inline" type="password" name="pass" id="pass"><br>
            <input class="btn btn-success" type="submit" value="Login">
            <input class="btn btn-danger" type="reset">
        </form>
    </div>
</body>

</html>