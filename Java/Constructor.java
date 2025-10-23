public class Constructor {
    int x;

    // Constructor
    public Constructor() {
        x = 5;  // Initialize x
        System.out.println("Constructor called, x = " + x);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();  // Calls constructor
    }
}
