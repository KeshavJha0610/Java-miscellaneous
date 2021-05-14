package javamiscellaneous;

import java.util.stream.IntStream;

public class Print1to100withoutloop {
	// using recursive functiona & java streams

	public static void main(String[] args) {
		printNum(1);
		IntStream.range(1, 101).forEach(e -> System.out.println(e)); //java streams
	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}

	}

}
