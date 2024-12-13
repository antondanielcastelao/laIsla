import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa simulador del famoso juego de fumar porros "La Isla"
 * @author Conguchu y Saul
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("   ██▓     ▄▄▄          ██▓  ██████   ██▓     ▄▄▄      ");
        System.out.println("  ▓██▒    ▒████▄       ▓██▒▒ ██    ▒  ▓██▒    ▒████▄    ");
        System.out.println("  ▒██░    ▒██  ▀█▄     ▒██▒░  ▓██▄    ▒██░    ▒██  ▀█▄  ");
        System.out.println("  ▒██░    ░██▄▄▄▄██    ░██░   ▒   ██▒ ▒██░    ░██▄▄▄▄██ ");
        System.out.println("  ░██████ ▒▓█   ▓██▒   ░██░▒ ██████▒▒ ░██████ ▒▓█   ▓██▒");
        System.out.println("  ░ ▒░▓   ░▒▒   ▓▒█░   ░▓  ▒  ▒▓▒ ▒ ░ ░ ▒░▓   ░▒▒   ▓▒█░");
        System.out.println("  ░ ░ ▒   ░ ▒   ▒▒ ░    ▒ ░░  ░▒  ░ ░ ░ ░ ▒   ░ ▒   ▒▒ ░");
        System.out.println("    ░ ░     ░   ▒       ▒ ░░   ░  ░     ░ ░     ░   ▒   ");
        System.out.println("      ░   ░     ░  ░    ░         ░       ░   ░     ░  ░");


        System.out.println("[?] A que isla vamos a jugar ");
        String nombreIsla = entrada.next();

        String[] concursantes = registrarConcursantes();

        String[] palabras = new String[1];

        System.out.println("[?] Quien se ha liado el peta? ");
        String empieza = entrada.next();

        // encontramos el indice del jugador para seguir un órden lógico

    }

    /**
     * A partir de un array y un valor dentro del mismo, devuelve su índice
     * @param palabras Array de las palabras
     * @param palabraBuscar Palabra que buscaremos
     * @return El indice de la palabra en ese array
     */
    public static int buscarIndice(String[] palabras, String palabraBuscar) {
        return 0;
    }

    /**
     * Función = Añade palabras al array unidimensional [] palabras.
     * @param palabras Array unidimensional
     * @param palabra Parámetro que tendrá el valor de las palabras que queramos introducir en el programa
     * @return la nueva lista, nuevo array que se creará con las nuevas palabras
     */
    public static String [] añadirPalabra (String[] palabras, String palabra){
        String [] nuevasPalabras = new String[palabras.length +1];
        for (int i = 0; i<palabras.length;i++){
            nuevasPalabras[i]=palabras[i];
        }
        nuevasPalabras[nuevasPalabras.length-1]=palabra;
        return nuevasPalabras;
    }

    /**
     * Función = Muestra las palabras del array unidimensional "palabras", declarado en la main.
     * @param palabras Array de palabras
     * @param nombreIsla nombre d la isla
     * @return true si ha pasado la isla false si ha perdido
     */
    public static boolean mostrarPalabras (String [] palabras, String nombreIsla){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A la isla de " + nombreIsla + " me llevaria... (espacio + enter para redirte  || enter para continuar)");

        for (int i = 0; i < palabras.length; i++){
            String entrada = scanner.nextLine();
            boolean espacio = entrada.equals(" ");
            if (espacio){
                System.out.println("[!] Mala suerte, perdiste");
                return false;
            } else if (entrada.isEmpty()){
                System.out.print(palabras[i]);
            }
        }
        return true;
    }



    /**
     * Registra los nombres de los concursantes que jugarán a la isla
     * @return array con los concursantes
     */
    public static String[] registrarConcursantes() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n [+] Introduce el numero de personas que jugaréis > ");
        int nConcursantes = entrada.nextInt();

        String[] concursantes = new String[nConcursantes];

        System.out.println("[*] Introduce el nombre del concursante y pulsa enter");
        for (int i = 0; i<concursantes.length;i++) {
            String nconcursante = entrada.nextLine();
            while (nconcursante.isEmpty())
            {
                nconcursante = entrada.nextLine();
            }
            concursantes[i] = nconcursante;
        }

        System.out.println("[+] Concursantes registrados correctamente");
        return concursantes;
    }

    /**
     * Elimina un concursante si pierde
     * @params concursante El concursante a eliminar
     * @params concursantes Lista de concursantes
     * @return Lista con los concursantes sin el eliminado
     */
    public static String[] eliminarConcursante(String concursante, String[] concursantes) {
        // nuevo array vacío con la longitud de los concursantes -1 (el que eliminamos)
        String[] nuevoConcursantes = new String[concursantes.length - 1];

        //variable auxiliar contador para indice de nuevoConcursante
        int c = 0;

        // iteramos la lista concursantes
        for (int i = 0; i<concursantes.length; i++) {
            // solo añadimos a la nueva lista si el concursante NO es el eliminado
            if (!concursantes[i].equals(concursante)) {
                nuevoConcursantes[c] = concursantes[i];
                c++;
            }
        }
        return nuevoConcursantes;
    }
    // */
}