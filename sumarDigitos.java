import java.util.Scanner;

public class sumarDigitos {

    // Método recursivo
    public static int sumaDigitos(int n) {
        // Caso base
        if (n == 0) {
            return 0;
        }
        // Caso recursivo
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Manejo de negativos (opcional)
        numero = Math.abs(numero);

        System.out.println("La suma de sus dígitos es: " + sumaDigitos(numero));

        scanner.close();
    }
}