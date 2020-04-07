
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELRAULMALDONADOSO
 */     
public class Extractor {
    public String getCarInsuranceName(Optional<Persona> person, int minAge){
      Persona persona = new Persona();
        
      if(persona.getAge() < minAge){
                return person.flatMap(Persona::getCar)
              .flatMap(Car::getInsurance)
              .map(Insurance::getName)
              .orElse("Unknown");
      }
      else{
          return "error";
      }  
    }
}