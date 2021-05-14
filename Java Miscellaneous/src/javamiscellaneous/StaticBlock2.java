package javamiscellaneous;

public class StaticBlock2 {
	static {
		System.out.println("static block");
	}
	public static void test() {
		System.out.println("testing method");
	}
	
	public static void cover() {
		System.out.println("cover method");
		test();
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		test();
		StaticBlock2.test();
		cover();

		
		
	

}
}
