package argumentos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author BuenSeñor
 */
public class Argumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Argumentos:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumento " + i + ": " + args[i]);
            }
            System.out.println();
            System.out.println("Introduce un código de retorno entre 0 y 9:");
            int returnCode = new Scanner(System.in).nextInt();
            if(returnCode >= 0 && returnCode <= 9){
                System.exit(returnCode);
            }
            System.out.println("El codigo de retorno esta fuera de rango, se asume '-1'");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Error al introducir el codigo de retorno, se asume '-2'");
            System.exit(-2);
        }

    }

}
