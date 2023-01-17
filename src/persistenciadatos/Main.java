
package persistenciadatos;
import java.util.*;


public class Main {

    
    public static void main(String[] args) {
        
        List lista1 = new ArrayList(); //Estas colecciones son interfaces, no son clases normales
        
        //agregar elementos a la lista
        lista1.add(1);
        lista1.add("Sebastian");
        lista1.add(34);
        lista1.add(1.69);
        lista1.add(true);
        //estos datos son considerados como objetos porque estas colecciones fueron creadas para eso
        
        //System.out.println(lista1); //esto va a imprimir todos los elementos de la lista1
        
        for(Object dato : lista1){
            System.out.println(dato);
            
         
        }
        
            System.out.println(lista1.get(0));
            
            
       //eliminar elementos de la lista
       lista1.remove(2);
        System.out.println(lista1);
        
        //editar un elemento de la lista
        
        lista1.set(1, " sebastian El mejor del mundo");
        System.out.println(lista1);
        
        //eliminar todos los elementos de  la lista 
        lista1.clear();
        System.out.println(lista1);
               
        
    }
    
}
