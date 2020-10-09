package com.unifacisa.microservices.produtos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

	public List<Produto> findAll(){
		return new ArrayList<Produto>();
	}
}
