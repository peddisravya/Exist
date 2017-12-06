<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Employees are</caption>
			<thead>
				<tr>
					<th>Employee Name</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Emps}" var="emp">
					<tr>
						<td>${emp.empName}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-emp">Add a emp</a>
		</div>
	</div>
<%@ include file="common/footer.jspf" %>