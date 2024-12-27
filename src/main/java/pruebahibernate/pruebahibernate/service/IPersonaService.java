package pruebahibernate.pruebahibernate.service;

import java.util.List;
import pruebahibernate.pruebahibernate.model.Persona;

public interface IPersonaService {
    
    public List<Persona> getPersonas();
    public void savePersona (Persona perso);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
    public void editPersona (Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);
    
}
