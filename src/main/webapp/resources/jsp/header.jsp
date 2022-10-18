<%@page import="com.blog.files.entities.User"%>
<%@page errorPage="error.jsp" %>
<% 
	User user = (User)session.getAttribute("activeUser");
%>

<nav class="navbar navbar-expand-lg navbar-dark">
	<div class="container-fluid">
		<span class="navbar-brand"> Bloggings </span>
		<button class="navbar-toggler" 
			type="button" 
			data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Contact Us</a>
				</li>
		
			</ul>
			<ul class="navbar-nav">
				<% if (user == null) { %>
					<li class="nav-item">
						<a class="nav-link" href="login.jsp">Login</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="register.jsp">Register</a>
					</li>
				<% } else { %>
					<li class="nav-item">
						<a class="nav-link d-flex" href="#!" data-bs-toggle="modal" data-bs-target="#profile-modal">
							<span class="material-icons pe-1">account_circle</span> 
							<%= user.getFirstName() %> <%=user.getLastName() %></a>
					</li>
					<li class="nav-item">
						<a class="nav-link d-flex" href="logout?activeUserId=<%=user.getId()%>">
						<span class="material-icons pe-1">logout</span>
						Logout</a>
					</li>
				<% } %>
			</ul>
		</div>
	</div>
</nav>