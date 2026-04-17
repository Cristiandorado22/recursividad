import java.util.Scanner;

public class potencia {

    // Método recursivo
    public static long potencia(int base, int exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();

        if (exponente < 0) {
            System.out.println("Este ejemplo no maneja exponentes negativos.");
        } else {
            System.out.println("Resultado: " + potencia(base, exponente));
        }

        scanner.close();
    }
}