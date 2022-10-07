package br.com.magi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magi.domain.MaGiwt;

@Repository
public interface MaGiRepository extends JpaRepository<MaGiwt, Integer>{

	

}
