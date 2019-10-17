
<div class="menu">
<ul>
<li><a class="btn-crud" href="index.jsp">Home</a></li>
<li><a class="btn-crud" href="">Disciplinas</a></li>
<li><a class="btn-crud" href="cadastro.jsp">Cadastro</a></li>
<li class="dir"><a class="btn-crud" href="Login?acao=deslogar">Deslogar</a></li>
<li class="dir nome"><span>Usuário: <%= session.getAttribute("nome") %></span></li>
</ul>
</div>