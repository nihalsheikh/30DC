public class Constructor {
    String greet;
    String name;

    // Constructor for myConst
    public Constructor(String greetings) {
        greet = greetings;
    }

    public Constructor(String firstName, String lastName) {
        name = firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Calling a constructor
        Constructor myConst = new Constructor("Hello");
//        myConst.greet = "Hello";
        System.out.println(myConst.greet);

        // Another method
        Constructor myConst2 = new Constructor("Hiiii");
//        myConst2.greet = "Hiii";
        System.out.println(myConst2.greet);

        // Another method
        Constructor myConst3 = new Constructor("Heyyy");
        System.out.println(myConst3.greet);

        // Another one
        Constructor myConst4 = new Constructor("John", "Doe");
        System.out.println(myConst4.name);
    }
}
