public static int fibonacci(int n) {
    // 1. El "alto" o caso base
    if (n <= 1) {
        return n; 
    }
    
    // 2. La función se llama a sí misma
    return fibonacci(n - 1) + fibonacci(n - 2);
}