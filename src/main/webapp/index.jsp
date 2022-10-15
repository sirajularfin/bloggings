<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bloggings - Got an idea? Write it down here.</title>
<%@ include file="resources/jsp/includes.jsp"%>
</head>

<body>
	<!-- Navigation bar -->
	<%@ include file="resources/jsp/header.jsp"%>

	<!-- Jumbotron -->
	<main class="container-fluid banner-background">
		<div class="jumbotron">
			<h1>Welcome to Bloggings</h1>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
				Pellentesque ac ipsum et ligula lacinia pulvinar et at nunc.
				Curabitur pellentesque suscipit gravida. Phasellus non ornare nibh,
				non imperdiet est.</p>
			<p>Mauris nec nisi lacus. Ut vitae orci lorem. Maecenas aliquet
				auctor magna, vitae commodo diam auctor sed. Pellentesque habitant
				morbi tristique senectus et netus et malesuada fames ac turpis
				egestas. Donec ullamcorper aliquam massa id iaculis. Quisque.</p>
			<button class="btn btn-light btn-lg">Explore</button>
			<div class="clear">.</div>
		</div>
	</main>

	<!-- List of Blog Posts -->
	<section class="blog-post">
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Lorem ipsum</h5>
				<p class="card-text">Nullam sed purus tellus. Aenean tempor eros
					in ligula accumsan, non rhoncus erat tincidunt. Vivamus vel libero
					eget massa varius.</p>
				<a href="#" class="btn">Read more</a>
			</div>
		</div>
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Lorem ipsum</h5>
				<p class="card-text">Nullam sed purus tellus. Aenean tempor eros
					in ligula accumsan, non rhoncus erat tincidunt. Vivamus vel libero
					eget massa varius.</p>
				<a href="#" class="btn">Read more</a>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<%@ include file="resources/jsp/footer.jsp"%>
</body>

</html>