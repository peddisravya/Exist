<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="/assets/css/index.css"></script>
<style>
body {
	background-image: url('/Images/layout.JPG' ');
	background-color: #cccccc;
}
</style>
</head>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="jumbotron">
	<div class="container">
		<body style="background-image: url("/WEB-INF/images/layout.JPG")">
			<table>
				<tr>
					<td>
						<h2>Welcome ${name}!!</h2>
					</td>
					<br>
					<br>
					<div>
						<h3>
							<tr>
								<td><a href="/list-emps">Click here</a></td>
								<td>Click to view details of employees.</td>
							</tr>
							<br>
							<tr>
								<td></td>
							</tr>
							<tr>
								<td><a href="/emplist">Click here</a></td>
								<td>Click to View Employees<br></td>
							</tr>
							<tr>
								<td>&nbsp</td>
							</tr>
							<tr>
								<td><a href="/upload">Upload</a></td>
								<td>Upload</td>
							</tr>
							<tr>
								<td><a href="/up">UploadNew</a></td>
								<td>Upload</td>
							</tr>
							<tr>
								<td><a href="/employees">View Emps</a>
						</h3>
			</table>
			<br>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</p>
	</div>
	<div class="container"></div>
</div>
<div class="row">
	<div class="col-xs-6 col-md-3">
		<a href="#" class="thumbnail"> <img src=""src/main/webapp/WEB-INF/images/images.jfif" alt="...">
		</a>
	</div>
	<div class="col-xs-6 col-md-3">
		<a href="#" class="thumbnail"> <img src="..." alt="...">
		</a>
	</div>
	<div class="col-xs-6 col-md-3">
		<a href="#" class="thumbnail"> <img src="..." alt="...">
		</a>
	</div>
	<div class="col-xs-6 col-md-3">
		<a href="#" class="thumbnail"> <img src="..." alt="...">
		</a>
	</div>
</div>

<div class="container">
	<h3>Fixed Navbar</h3>
	<div class="row">
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
	</div>
</div>

<h1>Scroll this page to see the effect</h1>



<div class="container">
	<h3>Fixed Navbar</h3>
	<div class="row">
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
		<div class="col-md-4">
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
			<p>A fixed navigation bar stays visible in a fixed position (top
				or bottom) independent of the page scroll.</p>
		</div>
	</div>
</div>

<h1>Scroll this page to see the effect</h1>
</div>
<%@ include file="common/footer.jspf"%>
</body>


