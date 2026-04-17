import java.util.Scanner;

public class fibonacci {

    // Método recursivo Fibonacci
    public static int fib(int n) {
        if (n == 0) return 0; // caso base
        if (n == 1) return 1; // caso base
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el límite de la serie: ");
        int limite = scanner.nextInt();

        System.out.println("Serie de Fibonacci:");

        for (int i = 0; i <= limite; i++) {
            System.out.print(fib(i) + " ");
        }

        scanner.close();
    }
}