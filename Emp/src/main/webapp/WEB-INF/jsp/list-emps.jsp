<head>
<meta charset="utf-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<body ng-app="expandCollapseApp">

	<div class="container">
		<table class="table table-striped">
			<caption>Employees are</caption>
			<thead>
				<tr>
					<th>Employee Name</th>
					<th>Join Date</th>
					<th>Is it Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>

			<tbody>


				<c:forEach items="${Emps}" var="emp">
					<tr>
						<td>${emp.empName}</td>

						<td><fmt:formatDate value="${emp.joinDate}"
								pattern="dd/MM/yyyy" /></td>
						<td>${emp.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-emp?id=${emp.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-emp?id=${emp.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-emp">Add a emp</a>
		</div>
	</div>

	<!-- 	<div class="container-fluid"> -->
	<!-- 		<button type="button" class="btn btn-info" data-toggle="collapse" -->
	<!-- 			data-target="#demo">Simple collapsible</button> -->
	<!-- 		<div id="demo" class="collapse"> -->
	<!-- 		Ut enim ad minim veniam, quis nostrud -->
	<!-- 			exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. -->
	<!-- 		</div> -->
	</div>

	<%@ include file="common/footer.jspf"%>
</body>