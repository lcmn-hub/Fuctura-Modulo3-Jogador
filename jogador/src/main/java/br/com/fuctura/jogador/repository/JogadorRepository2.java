package br.com.fuctura.jogador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.jogador.model.JogadorModel;

@Repository
public interface JogadorRepository2 extends JpaRepository<JogadorModel,Long>{

}
