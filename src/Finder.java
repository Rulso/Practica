/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELRAULMALDONADOSO
 */
public class Finder {
    
    public Insurance findCheapestInsurance(Persona person, Car car){
        Insurance cheapestCompany = null;
        
        int serviceQuantity=2;//no se cuantos servicios tendremos
        
            Service service[]= new Service[serviceQuantity];
            int n = 0;
            
            
            //estos valores salen de los queries
            String nombre = null;
            float precio = 0;
            
            for(int position=0; position < serviceQuantity; position ++){
                service[position] = new Service(nombre, precio);
            }
            
            float precioActual=service[0].getPrice();//le damos el valor del objeto en la posicion 0
            String nombreActual=service[0].getName();
            for(int position=1; position < serviceQuantity; position ++){
                if(service[position].getPrice()<precioActual){
                    precioActual = service[position].getPrice();
                    nombreActual=service[position].getName();
                } 
            }
            cheapestCompany.setName(nombreActual);   
        
        return cheapestCompany;
    }
    
}
