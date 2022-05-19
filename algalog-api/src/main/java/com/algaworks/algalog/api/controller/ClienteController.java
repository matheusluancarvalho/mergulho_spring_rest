package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Matheus Carvalho");
		cliente1.setEmail("matheuscarvalhophd@yahoo.com");
		cliente1.setTelefone("62 9 9808-8459");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Shhhhh");
		cliente2.setEmail("shhhhh@gmail.com");
		cliente2.setTelefone("+xx xx xxxx-x");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
	
}
