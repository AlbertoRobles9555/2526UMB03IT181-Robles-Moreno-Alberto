public class Calificaciones 

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la calificación (0-100): ");
        int nota = sc.nextInt();

        if (nota >= 70) 
        {
            System.out.println("Aprobado");
        } else 

        {
            System.out.println("Reprobado");
        }
    }
}