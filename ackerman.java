import java.util.Scanner;

public class ackerman {

    // Función recursiva de Ackermann
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } 
        else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } 
        else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa m: ");
        int m = scanner.nextInt();

        System.out.print("Ingresa n: ");
        int n = scanner.nextInt();

        // Advertencia básica
        if (m < 0 || n < 0) {
            System.out.println("Los valores deben ser enteros no negativos.");
        } else {
            System.out.println("Resultado Ackermann: " + ackermann(m, n));
        }

        scanner.close();
    }
}