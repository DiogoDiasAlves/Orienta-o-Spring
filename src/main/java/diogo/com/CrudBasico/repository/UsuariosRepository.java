package diogo.com.CrudBasico.repository;

import diogo.com.CrudBasico.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

    List<Usuarios> findAll();

    Usuarios findByCodigo(int codigo);

    List<Usuarios> findByOrderByNome();

    List<Usuarios> findBy





}
