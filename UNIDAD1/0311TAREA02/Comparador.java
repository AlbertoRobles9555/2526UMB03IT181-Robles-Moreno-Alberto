import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa compara dos numeros enteros y determina cual es mayor o si son iguales.");

        System.out.println("Ingresa el primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.println("Ingresa el segundo numero: ");
        float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.println("El numero (" + num1 + ") es diferente y mayor que el numero: (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("El numero (" + num2 + ") es diferente y mayor que el numero: (" + num1 + ").");
        } else {
            System.out.println("Los numeros son iguales.");
        }

        scanner.close();
    }
    
}
