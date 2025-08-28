import java.util.Scanner;

public class ejercicio1 {
    
    /**
     * Función recursiva que elimina todas las apariciones de un carácter dado en una cadena
     * @param cadena La cadena original
     * @param caracter El carácter a eliminar
     * @return La cadena sin el carácter especificado
     */
    public static String eliminarCaracter(String cadena, char caracter) {
        // Caso base: si la cadena está vacía, retornar cadena vacía
        if (cadena.isEmpty()) {
            return "";
        }
        
        // Obtener el primer carácter de la cadena
        char primerCaracter = cadena.charAt(0);
        
        // Si el primer carácter es igual al que queremos eliminar,
        // continuar recursivamente con el resto de la cadena
        if (primerCaracter == caracter) {
            return eliminarCaracter(cadena.substring(1), caracter);
        }
        
        // Si el primer carácter es diferente, mantenerlo y continuar recursivamente
        // con el resto de la cadena
        return primerCaracter + eliminarCaracter(cadena.substring(1), caracter);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ELIMINADOR DE CARACTERES ===");
        System.out.println("Este programa elimina todas las apariciones de un carácter en una cadena");
        System.out.println();
        
        // Solicitar la cadena al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        // Solicitar el carácter a eliminar
        System.out.print("Ingrese el carácter que desea eliminar: ");
        String caracterStr = scanner.nextLine();
        
        // Validar que se ingresó exactamente un carácter
        if (caracterStr.length() != 1) {
            System.out.println("Error: Debe ingresar exactamente un carácter.");
            scanner.close();
            return;
        }
        
        char caracter = caracterStr.charAt(0);
        
        // Mostrar resultados
        System.out.println();
        System.out.println("=== RESULTADOS ===");
        System.out.println("Texto original: \"" + cadena + "\"");
        System.out.println("Carácter a eliminar: '" + caracter + "'");
        System.out.println("Texto resultante: \"" + eliminarCaracter(cadena, caracter) + "\"");
        
        scanner.close();
    }
}
