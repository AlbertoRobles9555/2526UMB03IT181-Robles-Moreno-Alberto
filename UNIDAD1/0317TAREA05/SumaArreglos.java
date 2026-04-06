public class SumaArreglos 

{
    public static void main(String[] args) 
    {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma del arreglo es: " + suma);
    }
}