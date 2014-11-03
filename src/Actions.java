
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gonxi's
 */
public class Actions {

    public static byte menu(byte op) {

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

    public static void readAllLinesFromFile(Path path) throws IOException {


        try {
            List<String> lines = Files.readAllLines(path, java.nio.charset.StandardCharsets.UTF_8);
            for (String linea : lines) {
                System.out.println(linea);
            }

            BufferedReader bufferedReader = Files.newBufferedReader(path, java.nio.charset.StandardCharsets.UTF_8);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException io) {
            System.out.println("Error al leer el fichero txt... " + io);
        }
    }

    public static void writeInFile(Path path, Path path2) throws IOException {
        try {
            BufferedWriter bufferWriter = Files.newBufferedWriter(path2,
                    java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.CREATE);


        } catch (Exception e) {
        }
    }

    public static void eraseInFile(Path path, Path path2, String cod) {
        try {
            BufferedWriter bufferWriter = Files.newBufferedWriter(path2,
                    java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.CREATE);

            BufferedReader bufferReader = Files.newBufferedReader(path, java.nio.charset.StandardCharsets.UTF_8);
            String linea;
            while ((linea = bufferReader.readLine()) != null) {
                
                String atributo[] = linea.split(";");
                
                if (atributo[0].equalsIgnoreCase(cod)) {
                } else {

                    bufferWriter.write(atributo[0] + ";" + atributo[1] + ";" + atributo[2] + ";" + atributo[3]);
                    bufferWriter.newLine();

                }
            }
            Files.move(path2, path, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(path2);
            bufferWriter.close();
            bufferReader.close();

        } catch (Exception e) {
        }
    }
}
