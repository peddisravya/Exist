<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
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
* {
	box-sizing: border-box
}

body {
	font-family: "Lato", sans-serif;
}

body {
	background-image: url('Assets/Images/layout.JPG' ');
	background-color: #cccccc;
}

.vertical-offset-100 {
	padding-top: 100px;
}
</style>
</head>



<body ng-app="mymodal" background="Assets/Images/layout.JPG"
	onload='document.loginForm.username.focus();'>
	<br>
	<br>
	<br>

	<div ng-controller="MainCtrl" class="container" align="right">

		<h1>
			Employee Catalogue<br>Management<br>System
		</h1>

		<div align="right">
			<button class="btn btn-basic btn-md">SignUp</button>
			<button ng-click="toggleModal()" class="btn btn-info btn-md">Login</button>
		</div>

		<modal align="center" visible="showModal">
		<div class="container-fluid">
			<div class="row vertical-offset-100">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Please sign in</h3>
						</div>
						<div class="panel-body">

	<form action="<%=request.getContextPath()%>/"  role="form" align="left" class="form-horizontal"name='loginForm' method="post">
	<fieldset>
		<div class="form-group" align="left">
			<label for="email">SAPID</label> 
			<input type="text"	class="form-control" id="UserID" placeholder="Enter UserID"	name="app_username" required="" />
		</div>
		<div class="form-group" align="left">
			<label for="password">Password</label>
			 <input type="password"	class="form-control" id="password" placeholder="Password"	name="app_password" required="" />
		</div>
		<div align="center">
			<div>
			<a href="/" class="btn btn-success" role="button">Submit</a>
			</div>
			<a href="welcomeBack.html" class="btn btn-danger"	role="button">Cancel</a>
			 <input class="btn btn-primary"	type="reset" value="Reset">
		</div>
	</fieldset>
	</form>
	</div>
</div>
</div>
</div>
</div>
</modal>
</div>




	<script>
		var mymodal = angular.module('mymodal', []);

		mymodal.controller('MainCtrl', function($scope) {
			$scope.showModal = false;
			$scope.toggleModal = function() {
				$scope.showModal = !$scope.showModal;
			};
		});

		mymodal
				.directive(
						'modal',
						function() {
							return {
								template : '<div class="modal fade">'
										+ '<div class="modal-dialog">'
										+ '<div class="modal-content">'
										+ '<div class="modal-header">'
										+ '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>'
										+ '<h4 class="modal-title">{{ title }}</h4>'
										+ '</div>'
										+ '<div class="modal-body" ng-transclude></div>'
										+ '</div>' + '</div>' + '</div>',
								restrict : 'E',
								transclude : true,
								replace : true,
								scope : true,
								link : function postLink(scope, element, attrs) {
									scope.title = attrs.title;

									scope.$watch(attrs.visible,
											function(value) {
												if (value == true)
													$(element).modal('show');
												else
													$(element).modal('hide');
											});

									$(element)
											.on(
													'shown.bs.modal',
													function() {
														scope
																.$apply(function() {
																	scope.$parent[attrs.visible] = true;
																});
													});

									$(element)
											.on(
													'hidden.bs.modal',
													function() {
														scope
																.$apply(function() {
																	scope.$parent[attrs.visible] = false;
																});
													});
								}
							};
						});
	</script>
	</center>
</body>
</div>
</html>
