import java.util.Scanner;

public class invertirNumero {

    // Método recursivo
    public static int invertir(int n, int resultado) {
        // Caso base
        if (n == 0) {
            return resultado;
        }
        // Caso recursivo
        return invertir(n / 10, resultado * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int invertido = invertir(numero, 0);

        System.out.println("Número invertido: " + invertido);

       
    }
}