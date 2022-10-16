<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login - Bloggings</title>
<%@ include file="resources/jsp/includes.jsp"%>
</head>
<body>
	<!-- Navigation bar -->
	<%@ include file="resources/jsp/header.jsp"%>

	<main class="container-fluid banner-background">
		<div class="wrapper">
			<h1>Login</h1>
			<form action="login" method = "POST">
				<div class="form-floating rows">
					<input type="email" class="form-control col" name="email" placeholder="Email"> 
					<label>Email address</label>
				</div>
				<div class="form-floating rows">
					<input type="password" class="form-control col" name="password" placeholder="Password"> 
					<label>Password</label>
				</div>
				<a href="register.jsp" class="comment">Don't have an account? Register here</a>
				<button type="submit" class="btn btn-outline-light btn-lg">Login</button>
			</form>
			<div class="clear">.</div>
		</div>
	</main>
</body>
</html>