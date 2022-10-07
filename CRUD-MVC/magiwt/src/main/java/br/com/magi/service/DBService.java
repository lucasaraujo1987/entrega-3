package br.com.magi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magi.domain.MaGiwt;
import br.com.magi.repositories.MaGiRepository;

@Service
public class DBService {

	@Autowired
	private MaGiRepository repo;
	
	public void inicializarBancoDados() {
		MaGiwt magiwt = new MaGiwt(null, "Lucas", 345678910, 1234567, "Rio de Janeiro", "São Paulo", "Rua sem saída nº 00");
		repo.save(magiwt);
	}
}
