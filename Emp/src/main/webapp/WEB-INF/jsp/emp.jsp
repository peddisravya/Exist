<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<form:form method="post" commandName="emp">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="empName">Description</form:label>
			<form:input path="empName" type="text" class="form-control"
				required="required" />
			<form:errors path="empName" cssClass="text-warning" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="joinDate">Joined Date</form:label>
			<form:input path="joinDate" type="text" class="form-control"
				required="required" />
			<form:errors path="joinDate" cssClass="text-warning" />
		</fieldset>

		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>