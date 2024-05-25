<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <c:url value="/controllerServlet" var="link"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form method="POST" action="${link}">
  <input type="text" name="acao" value="novaEmpresa">
		<label>Nome:</label> <input name="nome" type="text" />
		<label>Data Abertura:</label> <input type="text" name="data" />
		<button type="submit">Enviar</button>
	</form>

</body>
</html>