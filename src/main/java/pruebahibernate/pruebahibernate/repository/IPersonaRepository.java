package pruebahibernate.pruebahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pruebahibernate.pruebahibernate.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
