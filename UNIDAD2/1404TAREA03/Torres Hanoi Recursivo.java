import java.util.Scanner;

public class TorresHanoi {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuántos discos quieres acomodar? ");
        int n = lector.nextInt();

        System.out.println("Los pasos para resolver la torre son:");
        // Llamada inicial: de poste 1 (Origen) a poste 3 (Destino) usando el 2 (Auxiliar)
        resolverHanoi(n, 1, 3, 2);
        
        lector.close();
    }

    /**
     * Método recursivo para mover los discos
     * @param n Número de discos
     * @param origen Poste inicial
     * @param destino Poste final
     * @param auxiliar Poste de apoyo
     */
    public static void resolverHanoi(int n, int origen, int destino, int auxiliar) {
        // Caso base: si solo hay un disco, lo movemos directamente
        if (n == 1) {
            System.out.println("Mover disco 1 de poste " + origen + " a poste " + destino);
        } else {
            // 1. Mover n-1 discos del origen al auxiliar usando el destino como apoyo
            resolverHanoi(n - 1, origen, auxiliar, destino);

            // 2. Mover el disco que queda (el más grande) al destino
            System.out.println("Mover disco " + n + " de poste " + origen + " a poste " + destino);

            // 3. Mover los n-1 discos que dejamos en el auxiliar hacia el destino
            resolverHanoi(n - 1, auxiliar, destino, origen);
        }
    }
}