public class MatrizSinContador 
{
    public static void main(String[] args) 
    {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j; // Se llena con la suma de sus índices
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}