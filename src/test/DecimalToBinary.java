package test;

import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {

		int x = 529;
		System.out.println(x + ": " + solution(x));
	}

	public static String solution(int N) {

		Stack<String> remstack = new Stack<String>();
		String binaryString = "";

		while (N > 0) {

			Integer rem = N % 2;
			remstack.push(rem.toString());
			N = Math.floorDiv(N, 2);

			while (!remstack.isEmpty()) {
				binaryString = remstack.pop() + binaryString;
			}
		}

		return binaryString;
	}
}
