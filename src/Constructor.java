public class Constructor {
    String greet;

    // Constructor
    public Constructor() {
        greet = "Hello";
    }

    public static void main(String[] args) {
        // Calling a constructor
        Constructor myConst = new Constructor();
        System.out.println(myConst.greet);
    }
}
