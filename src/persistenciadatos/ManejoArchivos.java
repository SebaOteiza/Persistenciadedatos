

package persistenciadatos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoArchivos {
    
    public static void CrearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo); //objeto de tipo file 
        
        try {
            //crear un archivo
            PrintWriter salida = new PrintWriter(archivo); //si el archivo no existe lo creamos 
            salida.close();
            System.out.println("Se creó el archivo");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
    public static void EscribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); //objeto de tipo file 
        
        try {
            //crear un archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); //si el archivo no existe lo creamos 
            //dejando el (new filewriter(archivo) no voy a sobreescribir el archivo
            salida.print(contenido);
            salida.close();
            System.out.println("Se escribio el archivo");
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
