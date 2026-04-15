int a = 0, b = 1;

for (int i = 0; i < 10; i++) {
    System.out.print(a + " "); // Imprimimos el número actual
    
    int suma = a + b; // Calculamos el que sigue
    a = b;            // El segundo pasa a ser el primero
    b = suma;         // La suma pasa a ser el segundo
}