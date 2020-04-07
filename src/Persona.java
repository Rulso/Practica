
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
public class Persona {
   private Car car;
   private int age;
   
   public Optional <Car> getCar(){
       return Optional.ofNullable(car);
   }
   
   public int getAge(){
       return age;
   }
   
   public void setCar(Car car){
       this.car=car;
   }
   
   public  void setAge(int age){
       this.age=age;
   }
   
}

