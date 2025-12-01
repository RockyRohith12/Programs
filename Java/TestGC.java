public class TestGC {
    public void finalize(){
        System.out.println("Finalize method is called");
    }

    public static void main(String[] args){
        TestGC tg = new TestGC();
        tg = null;
        System.gc();
        System.out.println("Main method is called");
    }
}
