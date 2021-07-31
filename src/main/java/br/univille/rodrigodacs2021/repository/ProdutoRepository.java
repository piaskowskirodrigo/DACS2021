package br.univille.rodrigodacs2021.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.rodrigodacs2021.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    
}