<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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

<title>Cap 12 - Pitch</title>
</head>
<body>
	<div aria-selected=""></div>
	<nav id="menu">
		<ul>
			<li><a href="homeAluno.html">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Capítulos <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Cap 1 - Comunicação Empresarial</a></li>
					<li><a href="#">Cap 2 - Técnicas de Leitura e
							Interpretação de Textos</a></li>
					<li><a href="#">Cap 3 - A coesão textual e a construção do
							sentido</a></li>
					<li><a href="#">Cap 4 - Coerência - A unidade do texto</a></li>
					<li><a href="#">Cap 5 - Storytelling</a></li>
					<li><a href="#">Cap 6 - Conceito de Startup</a></li>
					<li><a href="#">Cap 7 - Modelo de Negócios - Canvas</a></li>
					<li><a href="#">Cap 8 - O moderno texto empresarial</a></li>
					<li><a href="#">Cap 9 - Características do moderno texto
							empresarial</a></li>
					<li><a href="#">Cap 10 - Erros empresariais comuns</a></li>
					<li><a href="#">Cap 11 - Técnicas de Apresentação</a></li>
					<li><a href="bot.jsp">Cap 12 - Pitch</a></li>
					<li><a href="#">Cap 13 - Gramática normativa aplicada à
							leitura e produção textual</a></li>
				</ul></li>
			<li><a  href="Login?acao=deslogar">Deslogar</a></li>
		</ul>
	</nav>
	<div class="flutuante">
		<div class="chat-container"></div>
		<input type="text" id="question" name="question" class="field"
			placeholder="Type your question or message to convert in audio" />
		<div class="controls">
			<button id="sendQuestion">Send</button>
			<button id="getVoiceButton">Get Voice</button>
			<button id="recordButton">Record</button>
			<button id="pauseButton" disabled>Pause</button>
			<button id="stopButton" disabled>Stop</button>
		</div>
	</div>



	<img src="imagens/bits.jpg" alt="imagem-pitch" id="imagem">
	<div id="port">PORTUGUÊS</div>
	<div id="pit">PITCH</div>
	<div id="cap">CAPÍTULO 12</div>

	<div class="container">
		<h1 id="int">INTRODUÇÃO</h1>
		<div id="int2">
			<br>
			<p>&emsp;&emsp;&emsp;Você sabe oque é um picth? De acordo com
				Madaleno (2015), é um termo em inglês que é ultilizadp para designar
				uma apresentação rápida, normalmente feita para "vender" uma idéia a
				um investidor ou para participar das competições de
				empreendedorismo. Um bom pitch passa informação suficientes para que
				a audiência se interesse por sua idéia e queira saber mais.</p>
			<p>
				&emsp;&emsp;&emsp;AS apresentações de até um minuto também são
				chamdas de <b>Elevator Pitch</b> ou Discurso do Elevador, porque tem
				a duração de uma “viagem” de elevador. Seria como se você
				encontrasse o investidor no elevador e tivesse apenas o tempo da
				subida para se apresentar e “vender” a sua ideia de forma clara e
				concisa.
			</p>
			<p>&emsp;&emsp;&emsp;Elaborar uma apresentação tão curta é um
				grande desafio. Por isso, a importância em focar apenas os aspectos
				realmente essenciais para prender a atenção do investidor de forma
				que ele se interesse pelo seu negócio.</p>
			<p>&emsp;&emsp;&emsp;O importante é que o empreendedor seja capaz
				de mostrar sua proposta e fazer-se entender. Pode acontecer em
				diferentes contextos, e o discurso deve se ajustar à cada situação.
				As informações a serem expostas variam conforme o interlocutor,
				portanto é recomendável ensaiar várias versões.</p>
			<p>&emsp;&emsp;&emsp;O pitch pode acontecer em elevadores, salas
				individuais ou até em grandes auditórios. Quando além da atenção se
				quer conseguir investimento para o negócio,</p>
			<p>
				&emsp;&emsp;&emsp;O <b>Investment Pitch</b> é o recomendado, pois é
				um pitch um pouco mais extenso, que em geral dura de 5 a 20 minutos.
				Nesse cenário, especialmente quando o interlocutor for de uma firma
				de venture capital, a expectativa é que o empreendedor não só
				apresente o negócio em profundidade, passando por aspectos
				financeiros e estratégicos, como também convença que é uma
				oportunidade de investimento superior às outras que existem no
				mercado.
			</p>
			<p>&emsp;&emsp;&emsp;Você pode ter uma ideia extraordinária com
				grandes chances de dar certo, mas se não souber apresentá-la de
				forma clara e objetiva, as chances de um investidor acreditar no seu
				produto e apostar em sua startup diminuem muito. Dessa forma, é
				muito importante elaborar uma apresentação de impacto para divulgar
				o seu projeto, pois grandes ideias podem passar despercebidas em uma
				apresentação mal preparada. Este é um momento decisivo que deve
				estar focado nos diferenciais e benefícios que seu negócio pode
				levar à audiência (MADALENO, 2015).</p>
			<br>

			<div class="jumbotron">
				<h1 id="int">ELEVATOR PITCH - Como fazer tanta coisa em tão
					pouco tempo?</h1>
				<br>
				<p>&emsp;&emsp;&emsp;O Pitch não tem como objetivo explicar
					tudo. O importante é gerar interesse no interlocutor,
					possibilitando que desse primeiro contato surja a oportunidade de
					uma reunião posterior na qual você terá a sua atenção por mais
					tempo e poderá explicar os detalhes do projeto.</p>
				<p>&emsp;&emsp;&emsp;Imagine que você esteja participando de uma
					competição de Startups, como sua apresentação pode se diferenciar
					no meio de tantas outras? Gerando empatia com a plateia. Uma das
					formas de conseguir isso é utilizando o Storytelling, ou seja,
					conte uma história que ilustre uma situação, um contexto.</p>
			</div>
		</div>
		<br>
		<div id="cinza">
			<h1 id="int">ELEVATOR PITCH - Como elaborar seu pitch</h1>
			<br>
			<p>&emsp;&emsp;&emsp;Planejar um bom pitch e se preparar muito
				são etapas fundamentais para as startups que procuram por
				investimentos e parcerias. De acordo com Carlos Carneiro, Head do
				Ace Start, “o público precisa entender o seu pitch. Essa é a base de
				tudo. Se não entender, não vai prestar atenção e não vai gostar. Se
				não gostar, não vai comprar. Como a meta do pitch não é simplesmente
				apresentar uma ideia, mas convencer a sua audiência sobre ela, é
				essencial atrair o interesse da plateia e criar empatia desde o
				início do discurso. ”</p>
			<p>
				&emsp;&emsp;&emsp;De acordo com ele, podemos alcançar esse interesse
				com um slide inicial provocador, pois a imagem já estará aberta
				antes mesmo de você iniciar sua apresentação e isso pode instigar o
				público. Lembre-se de que mostrar seu logotipo no primeiro momento
				não será algo que despertará o interesse, pois, muito provavelmente,
				ninguém o conhecerá ainda. <br> &emsp;&emsp;&emsp;Sua
				apresentação deverá ter por volta de 6 slides, que devem conter pelo
				menos as seguintes informações, podendo variar em função da
				particularidade de cada Startup:
			</p>
			<p>1. O problema.</p>
			<p>2. A solução.</p>
			<p>3. O mercado.</p>
			<p>4. Diferenciais e a concorrência.</p>
			<p>5. Expectativas financeiras.</p>
			<p>6. Time.</p>
			<p>7. Encerramento.</p>
			<p>&emsp;&emsp;&emsp;Esses tópicos são apenas sugestões, pois de
				acordo com Spina (2012), cada negócio tem suas peculiaridades, assim
				o que importa realmente é conseguir demonstrá-los sucintamente na
				sua apresentação. Lembre-se que o investidor estará analisando não
				só o seu negócio, mas principalmente você, o empreendedor, assim tão
				importante quanto apresentar claramente sua empresa é conseguir
				demonstrar seu conhecimento e capacidade de execução.</p>
			<p>&emsp;&emsp;&emsp;Lembre-se também de que não existe um único
				modelo, pois cada público tem um interesse distinto, assim, você
				terá de elaborar várias versões do seu pitch para apresentar
				conforme o perfil da plateia.</p>
		</div>
		<br>
		<h1 id="int">ELEVATOR PITCH - O problema</h1>


		<br>
		<table border=1>
			<tr>
				<th>Problema</th>

			</tr>
			<tr>

				<td>&emsp;&emsp;&emsp;Você deve iniciar sua apresentação de
					forma impactante. Seu pitch deve começar indicando claramente qual
					a dor (problema) que você resolve para seus clientes, qual a
					oportunidade que sua empresa irá atender, isto é, qual o mercado e
					a necessidade que ele tem e não é bem atendida com as soluções
					atuais. Deve mostrar também que o problema tende a aumentar no
					futuro. <br> &emsp;&emsp;&emsp;Seu objetivo nesse momento é
					deixar claro que a dor é suficientemente “forte” para fazer esse
					público pagar por uma solução.

				</td>
			</tr>
			<tr>
				<td>&emsp;&emsp;&emsp;A intenção é deixar a plateia incomodada
					com o problema e querendo comprar sua ideia ou produto.</td>
			</tr>
			<tr>
				<td>&emsp;&emsp;&emsp;Tente explicar em uma frase qual é o
					problema que sua empresa resolve. Descreva como as pessoas sofrem
					por ele existir, mostrando números e dados, explicando como as
					coisas são feitas atualmente, pois depois será muito mais fácil de
					entender a sua solução. <br> &emsp;&emsp;&emsp;Mesmo que seu
					ramo não seja muito comum, explique como as coisas são atualmente,
					ressalte os defeitos que podem ser melhorados e deixe o ouvinte
					curioso em descobrir como isso será resolvido. <br>
					&emsp;&emsp;&emsp;Uma dica que pode ajudá-lo a explicar o problema
					é contar uma história. Crie um personagem e mostre por quais
					situações ele está passando. Se a história for bem contada, gerará
					empatia e a plateia se identificará com a dor dele.
				</td>
			</tr>

		</table>
		<div></div>
		<br> <br>
		<h1 id="int">CONSIDERAÇÕES FINAIS</h1>
		<br> <br>
		<p>&emsp;&emsp;&emsp;Como sua empresa muito provavelmente estará
			em um estágio inicial, não existem muitos dados e números para que o
			investidor possa avaliar. Dessa forma, eles avaliam o time,
			verificando se ele é a melhor solução para executar o projeto
			apresentado.</p>
		<p>&emsp;&emsp;&emsp;Para fazer uma boa apresentação, você e sua
			equipe devem acreditar na ideia e também em cada palavra que está
			sendo dita. Se vocês mesmos não acreditarem, ninguém mais acreditará.
		</p>
		<p>&emsp;&emsp;&emsp;Em todo o Brasil, nas grandes cidades,
			existem várias competições, em que empreendedores se apresentam para
			investidores ou para uma banca de avaliação. Alguns desses eventos
			são abertos ao público. É muito importante participar deles, para
			ganhar experiência e ouvir os feedbacks, percebendo seus erros e
			acertos e ir melhorando seu pitch para futuras apresentações.</p>
		<p>&emsp;&emsp;&emsp;A estrutura apresentada aqui é apenas uma
			sugestão. O mais importante no seu pitch é conseguir mostrar o que é
			sua startup, por que é um negócio confiável e seguro, e,
			principalmente, por que sua equipe é a mais qualificada para
			transformar esse projeto em uma empresa rentável.</p>

		<div>

			<h1 id="int">Exemplos de Pitchs</h1>

			<iframe width="560" height="315" id="video"
				src="https://www.youtube.com/embed/x7qPAY9JqE4" frameborder="0"
				allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>



		</div>
	</div>

	</div>


	<script
		src="https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js"></script>

	<script type="text/javascript" src="scripts/bot.js"></script>
	<script type="text/javascript" src="scripts/tts.js"></script>
	<script type="text/javascript" src="scripts/stt.js"></script>

</body>
</html>