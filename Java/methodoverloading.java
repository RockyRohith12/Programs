class Example {
    // Method 1
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Method 2
    void show(String s) {
        System.out.println("String: " + s);
    }

    // Method 3
    void show(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show(10);        // Calls method 1
        obj.show("Hello");   // Calls method 2
        obj.show(5, 15);     // Calls method 3
    }
}
