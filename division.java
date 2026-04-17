import java.util.Scanner;

public class division {

    // Método recursivo para cociente por restas sucesivas
    public static int cociente(int dividendo, int divisor) {
        // Caso base: si el dividendo es menor que el divisor
        if (dividendo < divisor) {
            return 0;
        }
        // Caso recursivo
        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingresa el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            // Trabajar con valores positivos
            dividendo = Math.abs(dividendo);
            divisor = Math.abs(divisor);

            System.out.println("El cociente es: " + cociente(dividendo, divisor));
        }

        scanner.close();
    }
}