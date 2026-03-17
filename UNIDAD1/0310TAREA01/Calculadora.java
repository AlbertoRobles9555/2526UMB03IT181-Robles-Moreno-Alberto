import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escoge la Operacion que deseas realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Residuo");

        int oper = scanner.nextInt();
        double x = 0;
        boolean op = true;

        switch (oper) 
        {
            case 1:
                x = num1 + num2;
            break;

            case 2:
                x = num1 - num2;
            break;

            case 3:
                x = num1 * num2 ;
            break;

            case 4:
                x = num1 / num2;
            break;

            case 5:
                x = num1 % num2 ;
            break;

            default:
                System.out.println("Error, ingresa un valor entre 1 y 5");
                op = false;
            break;

        }
        if (op) 
        {
            System.out.println("El resultado es: " + x);
        }

        scanner.close();
    }
    
}
