<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://fonts.googleapis.com/css?family=Big+Shoulders+Display&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="aluno.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script src="aluno.js"></script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

<title>Cadastro</title>
</head>
<body background="imagens/globo.jpg">

	<div class="container">
		<div class="row">
			<div class="lign-items-center">
				<form id="login" action="CadastroServlet" method="post">

					<fieldset>
						<legend id="cadastro">CADASTRO</legend>
						<div class="divForm">
							<input type="hidden" name="acao" value="cadastrar"> <input
								type="hidden" name="codigo" value="${usuario.codigo}"> <input
								type="hidden" name="tipo" value="${usuario.tipo}">
							<div>
								<label for="idNome">Nome:</label> <input type="text" name="nome"
									value="${usuario.nome}">
							</div>
							<div>
								<label for="idCpf">CPF:</label> <input type="text" name="cpf"
									value="${usuario.cpf}">
							</div>
							<div>
								<label for="datapicker">Nascimento:</label> <input type="text"
									name="data" id="datapicker" autocomplete="off"
									value="<fmt:formatDate pattern="
										dd/MM/yyyy" value="${cliente.dataNascimento.time}" />">
							</div>
							<div>
								<label for="idEmail">E-mail:</label> <input type="text"
									name="email" value="${usuario.email}">
							</div>
							<div>
								<label for="idSenha">Senha:</label> <input type="text"
									name="senha" value="${usuario.senha}">
							</div>
							<div class="divBtn">
								<input type="submit" value="CADASTRAR">
								<c:if test="{$not empty cliente}">
									<a class="btn-voltar" href="login.jsp">Voltar</a>
								</c:if>
							</div>
						</div>


					</fieldset>
				</form>
			</div>
		</div>
	</div>


</body>
</html>