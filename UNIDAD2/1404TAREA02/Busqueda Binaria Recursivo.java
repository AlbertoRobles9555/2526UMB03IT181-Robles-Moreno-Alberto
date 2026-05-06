public class BusquedaBinaria {

    public static int busquedaRecursiva(int[] arreglo, int objetivo, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // Caso base: no encontrado
        }

        int medio = inicio + (fin - inicio) / 2;

        if (arreglo[medio] == objetivo) {
            return medio;
        }

        // Si el objetivo es mayor que el medio, buscamos en la derecha
        if (arreglo[medio] < objetivo) {
            return busquedaRecursiva(arreglo, objetivo, medio + 1, fin);
        }

        // Si el objetivo es menor, buscamos en la izquierda
        return busquedaRecursiva(arreglo, objetivo, inicio, medio - 1);
    }
}