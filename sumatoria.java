import java.util.Scanner;

public class sumatoria{

    // Método recursivo
    public static int suma(int n) {
        // Caso base
        if (n == 0) {
            return 0;
        }
        // Caso recursivo
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("La sumatoria no está definida para números negativos.");
        } else {
            System.out.println("La sumatoria de 1 hasta " + numero + " es: " + suma(numero));
        }

        scanner.close();
    }
}