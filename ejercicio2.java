public class ejercicio2 {
    
    // Método principal para demostrar el QuickSort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array original:");
        imprimirArray(arr);
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Array ordenado con QuickSort:");
        imprimirArray(arr);
    }
    
    // Método principal de QuickSort
    public static void quickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            // Encontrar el índice del pivote
            int pi = particionar(arr, bajo, alto);
            
            // Ordenar recursivamente los elementos antes y después l pivote
            quickSort(arr, bajo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }
    
    // Método para particionar el array
    public static int particionar(int[] arr, int bajo, int alto) {
        // Elegir el último elemento como pivote
        int pivote = arr[alto];
        
        // Índice del elemento más pequeño
        int i = (bajo - 1);
        
        // Mover elementos menores que el pivote a la izquierda
        for (int j = bajo; j < alto; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        
        // Colocar el pivote en su posición correcta
        intercambiar(arr, i + 1, alto);
        
        return i + 1;
    }
    
    // Método auxiliar para intercambiar elementos
    public static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Método para imprimir el array
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
