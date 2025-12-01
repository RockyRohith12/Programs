class RecursionExample {
    // Recursive method to compute n!
    static int factorial(int n) {
        if (n == 0) // Base case
            return 1; // Changed comma to semicolon
        else
            return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("5!=" + res); // Output: 120
    }
}
