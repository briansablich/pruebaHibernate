package pruebahibernate.pruebahibernate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pruebahibernate.pruebahibernate.model.Persona;
import pruebahibernate.pruebahibernate.service.IPersonaService;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        return "Persona creada correcatemente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);
        return "Persona borrada correctamente";
    }

    @PutMapping("/personas/editar/{idOriginal}")
    public Persona editPersona(@PathVariable Long idOriginal,
            @RequestParam(required = false, name = "id") Long nuevaId,
            @RequestParam(required = false, name = "nombre") String nuevoNombre,
            @RequestParam(required = false, name = "apellido") String nuevoApellido,
            @RequestParam(required = false, name = "edad") int nuevaEdad) {

        interPersona.editPersona(idOriginal, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
        Persona perso = interPersona.findPersona(idOriginal);
        return perso;
    }
}
