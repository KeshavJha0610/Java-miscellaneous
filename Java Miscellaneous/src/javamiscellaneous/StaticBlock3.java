package javamiscellaneous;

public class StaticBlock3 {
    //How can we create objects if we make the constructor private?

    int age;

    static {
        StaticBlock3 obj1 = new StaticBlock3();

    }

    public static int createObject() {
        StaticBlock3 obj1 = new StaticBlock3();
        obj1.age = 40;
        return obj1.age;

    }


    private StaticBlock3() {
        age = 30;

    }

    public static void main(String[] args) {
        StaticBlock3 obj = new StaticBlock3();
        System.out.println(obj.age);

    }
}
