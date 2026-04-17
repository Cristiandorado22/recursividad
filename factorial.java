import java.util.Scanner;

public class factorial{

    // Método recursivo
    public static long factorial(int n) {
        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Validación
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("El factorial de " + numero + " es " + factorial(numero));
        }

        scanner.close();
    }
}