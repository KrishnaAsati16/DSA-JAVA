public class Basic {
    public static void supriya(){
        System.out.println("Hello A1");
    }
    public static void main(String[] args) {
        kaju(); // call lagana
        System.out.println("Hello A2");
        supriya();
        kaju();
    }
    public static void kaju(){
        System.out.println("Hello A3");
        supriya();
    }
}
