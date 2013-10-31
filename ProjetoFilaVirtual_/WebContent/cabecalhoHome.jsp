<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Bem Vindo ${usuarioLogado.nome }</h2>

	<table align="center">
		<tr>
			<td><form action="gerarFichaServlet" method="post">
					<input type="submit" value="Gerar Ficha">
				</form></td>
		</tr>
		<tr>
			<td align="center"><h4 align="center">
					<c:import url="FichaGerada.jsp" />
				</h4></td>
		</tr>
		<tr>
			<td align="center"><form action="logout" method="post">
					<input type="submit" value="Sair">
				</form></td>
		</tr>
	</table>

	<hr>
</body>
</html>