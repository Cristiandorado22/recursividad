import java.util.Scanner;

public class sumaArreglo {

    // Método recursivo para sumar elementos del arreglo
    public static int sumar(int[] arr, int n) {
        // Caso base: no hay elementos
        if (n == 0) {
            return 0;
        }
        // Caso recursivo
        return arr[n - 1] + sumar(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos números deseas ingresar: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        // Leer elementos del arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("La suma de los elementos es: " + sumar(arreglo, n));

        scanner.close();
    }
}