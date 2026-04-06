public class Cola 
{
    int[] datos;
    int tope; // Indica cuántos elementos hay

    public Cola(int tamaño) 
    {
        datos = new int[tamaño];
        tope = 0;
    }

    public void insertar(int valor) 
    {
        if (tope < datos.length) 
        {
            datos[tope++] = valor;
        } 
        else 
        {
            System.out.println("Cola llena");
        }
    }

    public void eliminar() 
    {
        if (tope > 0) 
        {
            System.out.println("Eliminando: " + datos[0]);
            // Recorrido de elementos
            for (int i = 0; i < tope - 1; i++) 
            {
                datos[i] = datos[i + 1];
            }
            tope--;
        } 
        else 
        {
            System.out.println("Cola vacía");
        }
    }

    public static void main(String[] args) 
    {
        Cola c = new Cola(5);
        c.insertar(1);
        c.insertar(2);
        c.eliminar(); // Elimina el 1 y el 2 pasa a la posición 0
    }
}