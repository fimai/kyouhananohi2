
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Today's todo.</h1>

	<P>It is ${serverTime}.</P>




	<form:form model="command">

		<table>
			<tr>
				<td>Year:</td>
				<td><form:input path="hiduke1" /></td>
				<td>Month:</td>
				<td><form:input path="hiduke2" /></td>
				<td>Day:</td>
				<td><form:input path="hiduke3" /></td>
			</tr>

			<tr>
				<td>Todo:</td>
				<td><form:input path="todo" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Click" /></td>
			</tr>

		</table>

	</form:form>

</body>
</html>
