import java.util.Scanner;

public class multiplicacion {

    // Método recursivo usando sumas sucesivas
    public static int multiplicar(int a, int b) {
        // Caso base
        if (b == 0) {
            return 0;
        }
        // Caso recursivo
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        // Manejo de negativos
        int signo = 1;
        if (a < 0) {
            a = -a;
            signo = -signo;
        }
        if (b < 0) {
            b = -b;
            signo = -signo;
        }

        System.out.println("El resultado de la multiplicación es: " 
                           + (signo * multiplicar(a, b)));

        scanner.close();
    }
}