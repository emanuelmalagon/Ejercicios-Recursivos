import java.util.Scanner;

public class ejercicio3 {
    
    // Función recursiva para convertir decimal a binario
    public static String decimalABinario(int decimal) {
        // Caso base: si el número es 0, retornamos "0"
        if (decimal == 0) {
            return "0";
        }
        // Caso base: si el número es 1, retornamos "1"
        if (decimal == 1) {
            return "1";
        }
        
        // Caso recursivo: dividir por 2 y concatenar el residuo
        return decimalABinario(decimal / 2) + (decimal % 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversión de Decimal a Binario (Recursivo)");
        System.out.println("==========================================");
        
        // Solicitar número al usuario
        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = scanner.nextInt();
        
        // Validar que el número sea no negativo
        if (numeroDecimal < 0) {
            System.out.println("Error: Por favor ingrese un número no negativo.");
        } else {
            // Convertir a binario usando la función recursiva
            String resultadoBinario = decimalABinario(numeroDecimal);
            
            // Mostrar resultado
            System.out.println("El número " + numeroDecimal + " en binario es: " + resultadoBinario);
        }
        
        scanner.close();
    }
}
