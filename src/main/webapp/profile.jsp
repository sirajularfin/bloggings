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

	<h1>Profile Page</h1>
</body>
</html>