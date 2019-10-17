function validarRm(tag,idErro){
	var rm = parseInt(tag.value);
	var validacao = /^\d{5}$/;
	if
	 (!validacao.test(rm)){
	alert("Por favor digite seu RM com 5 digitos!")
	}else{
		alert("RM digitado com sucesso!");
		}

	}


	