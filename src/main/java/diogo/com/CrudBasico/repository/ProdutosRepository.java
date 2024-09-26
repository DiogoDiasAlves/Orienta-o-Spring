package diogo.com.CrudBasico.repository;

import diogo.com.CrudBasico.entities.Produtos;
import diogo.com.CrudBasico.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutosRepository extends CrudRepository<Produtos, Long> {

    Optional<Produtos> findById(Long id);
    List<Produtos> findAll();



}
