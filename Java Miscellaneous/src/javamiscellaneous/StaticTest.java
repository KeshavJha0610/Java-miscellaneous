package javamiscellaneous;

public class StaticTest {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    StaticTest() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        new StaticTest();
    }
}

//static block is called when class is loaded
//Instance Initialization Block is called when object is created
		
	
     
      
