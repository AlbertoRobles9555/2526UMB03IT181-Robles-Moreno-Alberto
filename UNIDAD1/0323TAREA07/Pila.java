public class Pila 
{
    int[] memoria;
    int tope;

    public Pila(int tamaño) 
    {
        memoria = new int[tamaño];
        tope = -1;
    }

    public void empujar(int dato) 
    {
        if (tope < memoria.length - 1) 
        {
            memoria[++tope] = dato;
            System.out.println("Insertado: " + dato);
        } 
        else 
        {
            System.out.println("Pila llena");
        }
    }

    public void sacar() 
    {
        if (tope >= 0) 
        {
            System.out.println("Eliminado: " + memoria[tope--]);
        } 
        else 
        {
            System.out.println("Pila vacía");
        }
    }

    public static void main(String[] args) 
    {
        Pila p = new Pila(3);
        p.empujar(10);
        p.empujar(20);
        p.sacar();
    }
}