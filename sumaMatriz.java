import java.util.Scanner;

public class sumaMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de filas (m): ");
        int m = scanner.nextInt();

        System.out.print("Ingresa el número de columnas (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];
        int suma = 0;

        // Llenar la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingresa el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de los elementos de la matriz es: " + suma);

        scanner.close();
    }
}