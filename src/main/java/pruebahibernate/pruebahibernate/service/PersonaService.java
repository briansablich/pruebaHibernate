package pruebahibernate.pruebahibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pruebahibernate.pruebahibernate.repository.IPersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private IPersonaRepository persoRepo;
}
