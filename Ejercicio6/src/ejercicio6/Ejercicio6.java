/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Implemente, al menos, los siguientes métodos: 

    • Constructor predeterminado o vacío
    • Constructor con la capacidad máxima y la cantidad actual
    • Métodos getters y setters.
    • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
      simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
      se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
      y de no haberse llenado en cuanto quedó la taza.
    • Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y 
      se añade a la cafetera la cantidad de café indicada.
 */

//Dejo comentada la solución original.
package ejercicio6;

import ejercicio6.servicios.ServicioCafetera;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        //Creamos una cafetera
        
//        Cafetera cafetera1 = new Cafetera();
//        cafetera1.setCapacidadMaxima(200.0);
//        
//        //Probamos los métodos
//        
//        cafetera1.agregarCafe(150);
//        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
//        cafetera1.servirTaza(50);
//        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
//        cafetera1.servirTaza(150);
//        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
//        cafetera1.agregarCafe(500);
        
        //Creamos una cafetera y su servicio
        ServicioCafetera servicioCaf = new ServicioCafetera();
        Cafetera cafetera1 = new Cafetera(500.0, 0.0);
        
        //Probamos los métodos
        servicioCaf.agregarCafe(cafetera1, 150);
        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
        servicioCaf.llenarCafetera(cafetera1);
        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
        servicioCaf.servirTaza(cafetera1, 23);
        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
        servicioCaf.servirTaza(cafetera1, 720);
        System.out.println("∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻∻");
        
    }
    
}
