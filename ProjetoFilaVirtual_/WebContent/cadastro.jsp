<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Cadastro</title>
</head>
<body bgcolor="#BDB76B" >
<h1 align="center">Cadastro Usuário</h1>
	<form action="cadastrarUsuario" method="post">
		<table border="1" bordercolor="#2E8B57" align="center" bgcolor="#EEE8AA">
			<tr>
				<td>Nome</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td><input type="password" name="senha" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Cadastrar" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>