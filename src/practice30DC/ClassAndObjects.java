package practice30DC;

class Main2 {
    int x = 10;
}

public class ClassAndObjects {
    int a = 11;

    // Method
    static void meth1() {
        String greet = "Hii there!";
        System.out.println(greet);
    }

    int meth1(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        // Creating and object
        ClassAndObjects myObject = new ClassAndObjects();

        // calling the object
        System.out.println(myObject.a);

        // Calling class
        Main2 myClassObj = new Main2();
        System.out.println(myClassObj.x);

        // calling method
        // direct calling the static method
        meth1();

        // making object to call method
        ClassAndObjects myObject2 = new ClassAndObjects();
        System.out.println(myObject2.meth1(30, 6));

    }
}

