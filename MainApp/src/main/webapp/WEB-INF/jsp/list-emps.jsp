<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
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
						<td><fmt:formatDate value="${emp.joinDate}" pattern="dd/MM/yyyy"/></td>
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
<%@ include file="common/footer.jspf" %>