<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Cadastro</title>
</head>
<body bgcolor="#BDB76B">
	<c:import url="cabecalho.jsp" />
	<h4 align="center">Cadastro de Usuário</h4>
	<form action="cadastrarUsuario" method="post">
		<table border="1" bordercolor="#2E8B57" align="center"
			bgcolor="#EEE8AA">
			<tr>
				<td>Nome*</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Sobrenome*</td>
				<td><input type="text" name="sobrenome" /></td>
			</tr>
			<tr>
				<td>CPF</td>
				<td><input type="text" name="cpf" /></td>
			</tr>
			<tr>
				<td>Sexo</td>
				<td><input type="text" name="sexo" /></td>
			</tr>
			<tr>
				<td>Data Nascimento</td>
				<td><input type="text" name="dataNascimento" /></td>
			</tr>
			<tr>
				<td>Email*</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Senha*</td>
				<td><input type="password" name="senha" /></td>
			</tr>
			<tr>
				<td>CEP</td>
				<td><input type="text" name="cep" /></td>
			</tr>
			<tr>
				<td>Estado</td>
				<td><input type="text" name="estado" /></td>
			</tr>
			<tr>
				<td>Cidade</td>
				<td><input type="text" name="cidade" /></td>
			</tr>
			<tr>
				<td>Endereco</td>
				<td><input type="text" name="endereco" /></td>
			</tr>
			<tr>
				<td>Complemento</td>
				<td><input type="text" name="complemento" /></td>
			</tr>
			<tr>
				<td>Telefone</td>
				<td><input type="text" name="telefone" /></td>
			</tr>
			<tr>
				<td>Celular</td>
				<td><input type="text" name="celular" /></td>
			</tr>
			<tr>
				<td></td>
				<td rowspan="2" align="center"><input type="submit" value="Cadastrar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>