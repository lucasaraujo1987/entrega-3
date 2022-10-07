package br.com.magi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magi.domain.MaGiwt;
import br.com.magi.repositories.MaGiRepository;
import br.com.magi.service.exception.ObjectNotFoundException;

@Service
public class MaGiService {
	
	@Autowired
	private MaGiRepository repo;
	
	public MaGiwt findById(Integer id) {
		Optional<MaGiwt> magiwt = repo.findById(id);
		return magiwt.orElseThrow(() -> new ObjectNotFoundException("Nome não encontrado id: " + id + " Tipo: " + MaGiwt.class.getName()));
	}
	
	public List<MaGiwt> findAll(){
		return repo.findAll();
	}
	
	public MaGiwt save(MaGiwt magiwt) {
		magiwt.setId(null);
		return repo.save(magiwt);
	}
	
	public MaGiwt update(MaGiwt magiwt) {
		MaGiwt newMaGiwt = findById(magiwt.getId());
		updateProduto(magiwt, newMaGiwt);
		return repo.save(newMaGiwt);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	private void updateProduto(MaGiwt oldmagiwt, MaGiwt newMaGiwt) {
		newMaGiwt.setNome(oldmagiwt.getNome());
		newMaGiwt.setCpf(oldmagiwt.getCpf());
		newMaGiwt.setCep(oldmagiwt.getCep());
		newMaGiwt.setEmbarque(oldmagiwt.getEmbarque());
		newMaGiwt.setDestino(oldmagiwt.getDestino());
		newMaGiwt.setEndereco(oldmagiwt.getEndereco());
		
	}
}
