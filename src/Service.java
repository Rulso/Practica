/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELRAULMALDONADOSO
 */
public class Service {
    private String name;
    private float price;

    Service(String nombre, float precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  public String getName(){
      return name;
  }  
  public float getPrice(){
      return price;
  }

 public void setName(String name){
      this.name=name;
  }   
  public void setPrice(float price){
      this.price=price;
  }
 
}