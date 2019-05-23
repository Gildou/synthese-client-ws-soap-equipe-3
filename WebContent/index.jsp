<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
 		<thead>
 			<tr>
 				<th>ID</th>
 				<th>NOM</th>
 				<th>PRENOM</th>
 				<th>AGE</th>
 			</tr>
 		</thead>
 		<tbody>
 		<c:forEach items="${personnes}" var="pers">
 			<tr>
 				<td>${pers.id}</td>
 				<td>${pers.nom}</td>
 				<td>${pers.prenom}</td>
 				<td>${pers.age}</td>
 			</tr>
 		</c:forEach>
 		</tbody>
 	</table>

</body>
</html>