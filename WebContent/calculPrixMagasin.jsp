<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcul du prix d'un magasin</title>
<link rel="stylesheet"	href="css/bootstrap.css"/>
</head>
<body>
	<div class="container">
		<form action="CalculPrixMagasin">   <!-- fichier java (Servlet) de destination donc "ServletPersonne" -->
<!--   			<div class="form-group"> -->
<!--     			<label for="montantinit">Montant en euros</label> -->
<%--     			<input type="text" class="form-control" id="montantinit" name="montantinit" value="${montantinit }"required>		<!-- request.getParameter("prenom") --> --%>
<!--   			</div>  	 -->
  			
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
  			<div class="form-group">
    			La valeur totale du magasin (prix du local et articles compris) est de : <c:out value="${prixMagasin}" /> € 
  			</div> 	
			<div>
				<input type="submit" name="Calculer le Prix" value="Calculer le Prix">
			</div>	
		</form>
	</div>		
</body>
</html>