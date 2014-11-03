
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Gonxi's
 */

public class Actions {
    
    public static byte menu (byte op){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("____________________ Menú ________________________");
        System.out.println("");
        System.out.println("          1. Insertar nuevo producto");
        System.out.println("            2. Dar de baja producto");
        System.out.println("        3. Modificar Stock de producto");
        System.out.println("             4. Consultar producto");
        System.out.println("                   5. Salir");
        System.out.println("__________________________________________________");
        
        System.out.print("Escoja la opción que desea hacer: ");
        op = scanner.nextByte();
        
        return op;
    }
    
    public static void readFromFile (Path path, String cod) throws IOException{
        

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path, java.nio.charset.StandardCharsets.UTF_8);
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }
        }catch (EOFException eo){          
            System.out.println("Final del archivo aparente " + eo);    
        } catch (Exception ex) {
            System.out.println("Error al leer el fichero txt... " + ex);
        }
    }
    
    public static void writeInFile (Path path) throws IOException{
        try {
            BufferedWriter bufferWriter = Files.newBufferedWriter(path, 
                    java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.CREATE);
            
            
        } catch (Exception e) {
        }
    }
    
    public static void eraseInFile (Path path, Path path2){
        try {
            BufferedWriter bufferWriter=Files.newBufferedWriter(path2, 
                    java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.CREATE);
            
        } catch (Exception e) {
        }
    }
}
