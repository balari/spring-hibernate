<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
		
		.error{color:red}  
	</style>
	
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>



<script>
  $(function() {
    $( ".date" ).datepicker(); // give your date field an id or a date css class
  });
</script>
</head>
<body style="background-color:olive;">
<h1>
	Add User
</h1>

<c:url var="addAction" value="/save" ></c:url>

<form:form action="${addAction}"  commandName="users">
<table>
	<tr>
		<td>
			<%-- <form:label path="id">
				<spring:message text="ID"/>
			</form:label> --%>
		</td>
		<td>
			<form:input type="hidden" path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="username">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="username" />
			<form:errors path="username" cssClass="error"/>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Password"/>
			</form:label>
		</td>
		<td>
			<form:password path="password" />
			<form:errors path="password" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="confirmpassword">
				<spring:message text="ConfirmPassword"/>
			</form:label>
		</td>
		<td>
			<form:input path="confirmpassword" />
			<form:errors path="confirmpassword" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="email" />
			<form:errors path="email" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="confirmemail">
				<spring:message text="ConfirmEmail"/>
			</form:label>
		</td>
		<td>
			<form:input path="confirmemail" />
			<form:errors path="confirmemail" cssClass="error"/>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="dob">
				<spring:message text="Date of birth"/>
			</form:label>
		</td>
		<td>
			<form:input type="date" path="dob"/>
			<form:errors path="dob" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
				<input type="submit"
					value="<spring:message text="Add User"/>" />
		</td>
	</tr>
</table>	
</form:form>
<br>
</body>
</html>
