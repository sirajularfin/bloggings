<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="resources/jsp/includes.jsp"%>
<title>Register an Account - Bloggings</title>
</head>
<body>
	<!-- Navigation bar -->
	<%@ include file="resources/jsp/header.jsp"%>

	<main class="container-fluid banner-background">
		<div class="wrapper">
			<h1>Register an Account</h1>
			<form action="register" method="POST">
				<div class="rows">
					<div class="form-floating">
						<input type="text" class="form-control" name="firstName" placeholder="First Name" required> 
						<label>First Name</label>
					</div>
					<div class="form-floating">
						<input type="text" class="form-control" name="lastName" placeholder="Last Name" required> 
						<label>Last Name</label>
					</div>
				</div>
				<div class="form-floating rows">
					<input type="date" class="form-control col" name="dob" placeholder="Date of Birth" required> 
					<label>Date of Birth</label>
				</div>
				<div class="form-floating rows">
					<input type="email" class="form-control col" name="email" placeholder="Email" required> 
					<label>Email address</label>
				</div>
				<div class="rows">
					<div class="form-floating">
						<input type="password" class="form-control" name="password" placeholder="Password" required>
						<label>Password</label>
					</div>
					<div class="form-floating">
						<input type="password" class="form-control" name="retypePassword" placeholder="Confirm Password" required>
						<label>Confirm Password</label>
					</div>
				</div>
				<a href="login.jsp" class="comment">Already have an account?
					Login here</a>
				<button type="submit" class="btn btn-outline-light btn-lg">Register</button>
			</form>
			<div class="clear">.</div>
		</div>
	</main>
</body>
</html>