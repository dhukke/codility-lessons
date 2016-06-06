package test;

import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {

		BigInteger fact = new BigInteger("1");

		for (int i = 1; i <= 25; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}

		System.out.println(fact.toString());
	}
}