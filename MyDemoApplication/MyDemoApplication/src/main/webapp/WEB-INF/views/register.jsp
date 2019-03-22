<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="styles/styles.css"/>

</head>
<body>
 <body class="text-center">
    <form:form modelAttribute="user" action="registerUser" method="POST" class="form-signin">
  <img class="mb-4" src="images/KNLogo.png" alt="" width="125" height="125">
  <h1 class="h3 mb-3 font-weight-normal">Please Register Here</h1>
  <label for="inputName" class="sr-only">Name</label>
  <form:input path="name" type="text" id="inputName" class="form-control" placeholder="Name"></form:input>
  <label for="inputEmail" class="sr-only">Email address</label>
  <form:input path="email" type="email" id="inputEmail" class="form-control" placeholder="Email address"></form:input>
  <label for="inputPassword" class="sr-only">Password</label>
  <form:input path="password" type="password" id="inputPassword" class="form-control" placeholder="Password"></form:input>
  <div class="checkbox mb-3">

  </div>
  <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
  <br>
  <br>
  <br>
  <p>Already have an account? Click <a href="/signin">here</a> to Sign in.</p>
  <p>Click <a href="/">here</a> to return to the index.</p>
</form:form>
</body>
</body>
</html>
