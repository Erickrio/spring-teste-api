package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {


	@Override
	public void notificar(Cliente cliente, String mensagem) {	
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}


}
