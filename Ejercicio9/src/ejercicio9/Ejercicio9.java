/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán
diferentes operaciones matemáticas. La clase deber tener un constructor vacío, parametrizado y get y set. 
En el main se creará el objeto y se usará el Math.random para generar los dos números y 
se guardaran en el objeto con su respectivos set. Deberá además implementar los siguientes métodos:

    • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    • Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
      Previamente se deben redondear ambos valores.
    • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
      Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Matematica matematica1 = new Matematica();
        
        matematica1.setN1(Math.random());
        matematica1.setN2(Math.random());
        
        switch (matematica1.devolverMayor()) {
            case 0 :
                System.out.println("Los números son iguales.");
                break;
            case 1 :
                System.out.println("El número 1 es más grande que el número 2.");
                break;
            case 2 :
                System.out.println("El núemro 2 es más grande que el número 1.");
                break;
        }
        
        System.out.println("La potencia del número mayor es: " + matematica1.calcularPotencia());
        System.out.println("La raíz del número menor es: " + matematica1.calculaRaiz());
        
    }
    
}
