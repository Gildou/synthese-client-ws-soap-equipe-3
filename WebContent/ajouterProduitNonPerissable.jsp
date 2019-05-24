<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter un produit à un magasin</title>
<link rel="stylesheet"	href="css/bootstrap.css"/>
</head>
<body>
	<div class="container">
		<form action="AjouterProduit">   <!-- fichier java (Servlet) de destination donc "ServletPersonne" -->
  			<div class="form-group">
  				<input type="hidden" name="idProduit" value="${idProduit }"/>											<!-- champ caché -->
    			<label for="nom"></label>
    			<input type="text" class="form-control" id="nom" name="nom" value="${nom }"required>              <!-- request.getParameter("nom") -->
    		</div>
  			<div class="form-group">
    			<label for="prenom">Prenom</label>
    			<input type="text" class="form-control" id="prenom" name="prenom" value="${prenom }"required>		<!-- request.getParameter("prenom") -->
  			</div>  	
  			<div class="form-group">
    			<label for="age">Age</label>
    			<input type="text" class="form-control" id="age" name="age" value="${age }"required>			<!-- request.getParameter("age") -->
  			</div> 
  			<div class="form-group">
    			<label for="login">Login</label>
    			<input type="text" class="form-control" id="login" name="login" value="${login }"required>			<!-- request.getParameter("age") -->
  			</div> 
  			<div class="form-group">
    			<label for="pass">Mot de Passe</label>
    			<input type="password" class="form-control" id="pass" name="pass" value="${mdp }"required>			<!-- request.getParameter("age") -->
  			</div> 
  			<div>
  				Adresse : <select name="idAdresse">
					<optgroup>
						<option value="0">---</option>
						<c:if test="${not empty adresses }">
  						<c:forEach items="${adresses }" var="a">
  						<option value="${a.idAdresse }"><c:out value="${a.numRue },${a.nomRue },${a.cp },${a.ville }"/></option>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->				
  						</c:forEach>
  						</c:if>
					</optgroup></br>
				</select>
  			</div>
			<div>
				<input type="submit" name="ajouter" value="Ajouter">
				<input type="submit" name="modifier" value="Modifier">
			</div>
		</form>
	</div>
	<div class="container">
		<table class="table">
  			<thead>
    			<tr>
      				<th scope="col">ID</th>
      				<th scope="col">PRENOMS</th>
      				<th scope="col">NOMS</th>
     			 	<th scope="col">AGES</th>
     			 	<th scope="col">ADRESSES</th>
    			</tr>	
  			</thead>
  		<tbody>
  			<c:if test="${not empty personnes }">
  				<c:forEach items="${personnes }" var="x">
  					<tr>
  						<td><c:out value="${x.id }"/></td>		<!-- les id,nom,prenom,age correspondent aux attributs de la classe metier car je  -->	
  						<td><c:out value="${x.nom }"/></td>		<!-- manipule des tableaux de personnes -->
  						<td><c:out value="${x.prenom }"/></td>	
  						<td><c:out value="${x.age }"/></td>		
  						<td><c:out value="${x.adresse.numRue },${x.adresse.nomRue },${x.adresse.cp },${x.adresse.ville }"/></td>		
  						<td><a href="SupprimerPersonne?idPersonne=${x.id }"> Supprimer </a> </td>
  						<td><a href="ModifierServlet?idPersonne=${x.id }"> Modifier </a> </td>
  					</tr>
  				</c:forEach>
  			</c:if>
  		</tbody>
	</table>
	</div>
</body>
</html>