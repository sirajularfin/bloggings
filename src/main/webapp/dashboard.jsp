<%@ include file="resources/jsp/alert.jsp" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dashboard - Bloggings</title>
<%@ include file="resources/jsp/includes.jsp"%>

</head>
<body>

	<!-- Navigation bar -->
	<%@ include file="resources/jsp/header.jsp"%>

	<%
	if (user == null) {
	    response.sendRedirect("index.jsp");
	}
	%>

	<!-- Profile Modal -->
	
	<div class="modal fade" id="profile-modal" tabindex="-1" aria-labelledby="profileModal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="profileModalLabel">
						Profile Details
					</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<img src="resources/asset/<%=user.getProfile()%>"> 
					<form action="update-profile" method="POST" enctype="multipart/form-data">
						<div class="rows">
							<div class="form-floating">
								<input 
									type="text" 
									class="form-control" 
									name="firstName" 
									placeholder="First Name" 
									value="<%=user.getFirstName() %>" disabled> 
								<label>First Name</label>
							</div>
							<div class="form-floating">
								<input 
									type="text" 
									class="form-control" 
									name="lastName"	
									placeholder="Last Name" 
									value="<%=user.getLastName()%>" disabled>
								<label>Last	Name</label>
							</div>
						</div>
						<div class="form-floating">
							<input 
								type="email" 
								class="form-control"
								name="email"
								placeholder="Email" 
								value="<%=user.getEmail()%>" disabled> 
							<label>Email address</label>
						</div>
						<div class="form-floating">
							<input 
								type="password" 
								class="form-control"
								name="password"	
								placeholder="Password" 
								value="<%=user.getPassword()%>" disabled> 
							<label>Password</label>
						</div>
						<div class="form-floating">
							<input 
								type="date" 
								class="form-control"
								name="dob"
								placeholder="Date of Birth" 
								value="<%=user.getDob()%>" disabled> 
							<label>Date of Birth</label>
						</div>
						<div class="form-floating">
							<input 
								type="date" 
								class="form-control"	
								placeholder="Member since" 
								value="<%=user.getCreationTime()%>" disabled> 
							<label>Member since</label>
						</div>
						<div class="my-3">
							<label class="form-label">Choose a new user image</label> 
							<input 
								type="file" 
								class="form-control"
								name="userImage" disabled>
						</div>
						<button type="submit" class="btn btn-dark" id="profile-update-btn" disabled>Update</button>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"	data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" id="profile-edit-btn">Edit</button>
				</div>
			</div>
		</div>
	</div>

	
	
	<!-- External JavaScript -->
	<script type="text/javascript" src="resources/javascript/script.js"></script>
</body>
</html>