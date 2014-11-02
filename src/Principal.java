
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonxi's
 */
public class Principal {

    
    private final static String filename = "stockTextFile.txt";
    public static void main(String[] args) {
        
        Path path = Paths.get(filename);
        Scanner scann = new Scanner (System.in);
        String cod = "";
//        consultProduct (path);
        
        byte op = 0;

        do {
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
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }                      
        } while (op != 5);
    }
}
