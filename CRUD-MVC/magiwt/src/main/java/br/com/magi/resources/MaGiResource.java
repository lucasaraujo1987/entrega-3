package br.com.magi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magi.domain.MaGiwt;
import br.com.magi.service.MaGiService;

@RestController
@RequestMapping(value = "/ma_giwt")
@CrossOrigin("*")
public class MaGiResource {
	@Autowired
	private MaGiService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<MaGiwt> findById(@PathVariable Integer id){
		MaGiwt magiwt = service.findById(id);
		return ResponseEntity.ok().body(magiwt);
	}
	
	@GetMapping
	public ResponseEntity<List<MaGiwt>> findAll(){
		List<MaGiwt>magiwt = service.findAll();
		return ResponseEntity.ok().body(magiwt);
	}
	
	@PostMapping
	public ResponseEntity<MaGiwt> save(@RequestBody MaGiwt magiwt){
		MaGiwt obj = service.save(magiwt);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping
	public ResponseEntity<MaGiwt> update(@RequestBody MaGiwt magiwt){
		MaGiwt obj = service.update(magiwt);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
