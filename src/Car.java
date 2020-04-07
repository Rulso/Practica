
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
public class Car {
   private Insurance insurance;
   
   
   public Optional <Insurance> getInsurance(){
       return Optional.ofNullable(insurance);
   }
   public void setCar(Car car){
       this.insurance=insurance;
   }
    
}
