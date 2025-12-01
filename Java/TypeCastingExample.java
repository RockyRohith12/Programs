public class TypeCastingExample {
    public static void main(String[] args) {
        int x = 55;
        double y = x;

        double height = 172.9;
        int shortHeight = (int) height;

        System.out.println(y);
        System.out.println(shortHeight);
    }
}
