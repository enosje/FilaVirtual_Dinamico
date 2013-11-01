<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#BDB76B">
<h3 align="center">Olá ${nome } ${sobrenome }</h3>
	<table border="1" bordercolor="#2E8B57" align="center"
			bgcolor="#EEE8AA">
		<tr>
			<td colspan="2" align="center">Cadastro efetuado com sucesso!</td>
		</tr>
		<tr>
			<td>Nome:</td>
			<td>${nome }</td>
		</tr>
		<tr>
			<td>Sobrenome:</td>
			<td>${sobrenome }</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${email }</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a
				href="http://localhost:8080/ProjetoFilaVirtual_/">Click aqui
					para fazer login</a></td>
		</tr>
	</table>
</body>
</html>