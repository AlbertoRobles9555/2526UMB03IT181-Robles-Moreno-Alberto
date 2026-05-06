public class BusquedaBinaria {
    
    public static int busquedaIterativa(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el objetivo está en el medio
            if (arreglo[medio] == objetivo) {
                return medio;
            }

            // Si el objetivo es mayor, ignoramos la mitad izquierda
            if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } 
            // Si el objetivo es menor, ignoramos la mitad derecha
            else {
                fin = medio - 1;
            }
        }

        return -1; // No se encontró el elemento
    }
}