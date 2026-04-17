import java.util.Scanner;

public class sumaFracciones {

    // Método recursivo
    public static double suma(int n) {
        // Caso base
        if (n == 1) {
            return 1.0;
        }
        // Caso recursivo
        return (1.0 / n) + suma(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            System.out.println("La sumatoria es: " + suma(numero));
        }

        scanner.close();
    }
}