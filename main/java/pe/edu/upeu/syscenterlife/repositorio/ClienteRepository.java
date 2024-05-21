package pe.edu.upeu.syscenterlife.repositorio;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, String>{
    
}
