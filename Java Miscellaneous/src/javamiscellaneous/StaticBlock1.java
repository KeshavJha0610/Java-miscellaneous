package javamiscellaneous;

public class StaticBlock1 {
    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    static {
        System.out.println("static block 3");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static {
        System.out.println("static block 4");
    }

}
