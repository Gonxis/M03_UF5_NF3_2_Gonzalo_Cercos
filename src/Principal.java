
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonxi's
 */
public class Principal {

    
    private final static String filename = "stockTextFile.txt";
    private final static String filename2 = "Auxiliar.txt";
    public static void main(String[] args) {
        
        Path path = Paths.get(filename);
        Path path2 = Paths.get(filename2);
        Scanner scann = new Scanner (System.in);
        String cod = "";
//        consultProduct (path);
        
        byte op = 0;

        do {
            try {
                try {
                    System.out.println("");
                    op = Actions.menu(op);
                } catch (InputMismatchException e) {
                    System.out.println("");
                    System.out.println("Valor numérico requerido, entre el 1-5");
                    System.out.println("");
                }

                switch (op) {

                    case 1:
                        
                        System.out.print("Interta el código del producto que quiera introducir: ");
                        cod = scann.next();
                        if ()
                        
                        break;
                    case 2:
                        
                        Actions.eraseInFile(path, path2, cod);
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("");
                        Actions.readAllLinesFromFile(path);
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("Ha elegido salir del programa");
                        System.out.println("");
                        System.out.println("Adiós");
                        break;
                }                      
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (op != 5);
    }
}
