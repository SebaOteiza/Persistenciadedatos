package persistenciadatos;

import static persistenciadatos.ManejoArchivos.*;

public class Main {

    public static void main(String[] args) {
        //CrearArchivo("archivo\\Hola.txt"); //ruta relativa que de dirige al proyecto trabajado
        //CrearArchivo("C:\\JavaArchivos\\hola.txt");
        
        EscribirArchivo("archivo\\Hola.txt", "Hola desde Java");
        EscribirArchivo("archivo\\Hola.txt", "Hola Mundo");
        EscribirArchivo("archivo\\Hola.txt", "Hola Maldito desgraciado");
        //al hacer lo de arriba, se va sobreescribiendo el archivo
           
    }

}

 //List lista1 = new ArrayList(); //Estas colecciones son interfaces, no son clases normales
//        
//        //LA LISTA RESPETA EL ORDEN QUE ASIGNAMOS A LOS DATOS 
//        
//        //agregar elementos a la lista
//        lista1.add(1);
//        lista1.add("Sebastian");
//        lista1.add(34);
//        lista1.add(1.69);
//        lista1.add(true);
//        //estos datos son considerados como objetos porque estas colecciones fueron creadas para eso
//        
//        //System.out.println(lista1); //esto va a imprimir todos los elementos de la lista1
//        
//        for(Object dato : lista1){
//            System.out.println(dato);
//            
//         
//        }
//        
//            System.out.println(lista1.get(0));
//            
//            
//       //eliminar elementos de la lista
//       lista1.remove(2);
//        System.out.println(lista1);
//        
//        //editar un elemento de la lista
//        
//        lista1.set(1, " sebastian El mejor del mundo");
//        System.out.println(lista1);
//        
//        //eliminar todos los elementos de  la lista 
//        lista1.clear();
//        System.out.println(lista1);
        //***********************************************************// 
//        //SET: no permite la repetición de los datos y no respeta el orden en que se ingresan estos (orden aleatorio)
//        Set dias = new HashSet();
//        dias.add("Lunes");
//        dias.add("Martes");
//        dias.add("Miercoles");
//        dias.add("Jueves");
//        dias.add("Viernes");
//        
//        for(Object dia : dias){
//            System.out.println(dia);
//        }
//        
//        //como no entrega un orden definido, debo poner el nombre del elemento a eliminar
//        dias.remove("Lunes");
//        System.out.println(dias);
//        
//        //eliminar todo
//        dias.clear();


        //********************************************//
        
        
        //MAP es independiente, no hereda de Colletion, es distinto
        //cada dato se almacena con clave y valor 
//        Map numeros = new HashMap();
//
//        //asignar datos
//        numeros.put(1, "Uno"); //clave y valor)
//        numeros.put(2, "Dos");
//        numeros.put(3, "Tres");
//        numeros.put(4, "Cuatro");
//        numeros.put(5, "Cinco");
//        
//        System.out.println(numeros);
//        
//        //acceder a los datos
//        //LAS CLAVES SERÍAN COMO LOS ÍNDICES 
//        
//        System.out.println(numeros.get(1));
//        
//        //iterar los datos
//        
//       // for(Object valores : numeros.keySet()){ //con esto recupero las claves, tambien puedo poner .values
//        //    System.out.println(valores);
//        
//        //iterar para recuperar clave y valor
//        
//        for(Object clave : numeros.keySet()){
//            System.out.println(clave+" "+ numeros.get(clave));
//            
//        }
//        
//        //aliminar algún elemento
//        
//        numeros.remove(5);
//        System.out.println(numeros);
//        
//        //eliminar todo
//        
//        numeros.clear();

