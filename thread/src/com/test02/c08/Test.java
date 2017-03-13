package com.test02.c08;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		System.out.println(0.06+0.01);
		System.out.println(1.0-0.42);
		System.out.println(4.015*100);
		System.out.println(303.1/1000);
		BigDecimal b1 = new BigDecimal(Double.valueOf(0.06));
		b1.add(new BigDecimal(0.01));
	}
}
