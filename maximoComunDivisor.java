import java.util.Scanner;

public class maximoComunDivisor{

    // Método recursivo (Algoritmo de Euclides)
    public static int mcd(int m, int n) {
        // Caso base
        if (n == 0) {
            return m;
        }
        // Caso recursivo
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int m = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int n = scanner.nextInt();

        // Opcional: trabajar con valores positivos
        m = Math.abs(m);
        n = Math.abs(n);

        System.out.println("El MCD es: " + mcd(m, n));

        scanner.close();
    }
}