<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supprimer un magasin</title>
<link rel="stylesheet"	href="css/bootstrap.css"/>
</head>
<body>
	<div class="container">
		<form action="SupprimerMagasin">   <!-- fichier java (Servlet) de destination donc "ServletPersonne" -->	
  			<div>
  				Magasins : <select name="idMagasin">
					<optgroup>
						<option value="0">---</option>
						<c:if test="${not empty magasins }">
  						<c:forEach items="${magasins }" var="a">
  						<option value="${a.idMagasin }"><c:out value="${a.nomMagasin }"/></option>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->				
  						</c:forEach>
  						</c:if>
					</optgroup></br>
				</select>
  			</div>	
			<div>
				<input type="submit" name="Supprimer" value="Supprimer">
			</div>	
		</form>
	</div>		
</body>
</html>