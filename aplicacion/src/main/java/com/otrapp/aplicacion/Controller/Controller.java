package com.otrapp.aplicacion.Controller;
import java.util.List; 
import org.springframework.web.bind.annotation.PostMapping;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.repository.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class Controller {
    
  @Autowired
  private IPersonaService persoServ;
    
    @PostMapping("/new/Persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
      @GetMapping ("/ver/personas")
          @ResponseBody
     public List<Persona> verPersonas(){
        return persoServ.verPersonas();
}
     
     @DeleteMapping ("/delete/{id}")
     public void borrarPersona (@PathVariable Long id){
         persoServ.borrarPersona(id);
}
}
