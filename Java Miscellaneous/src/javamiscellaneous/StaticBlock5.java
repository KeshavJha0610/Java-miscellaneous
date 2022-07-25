package javamiscellaneous;

public class StaticBlock5 {
    //can we initialize member variables within static block?
    String name;
    static int age;

    static {
        StaticBlock5 a1 = new StaticBlock5();
        a1.name = "Keshav";
        age = 24;
        System.out.println(a1.name + " " + age);
    }

    public static void main(String[] args) {


    }


}
     
      
