package com.JH.methods;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. plus");
		System.out.println(" 2. minus");
		MethodTest1 m1 = new MethodTest1();
		int select = sc.nextInt();
		if(select ==1) {

			m1.hap();
		}
		else {
			m1.minus();
		}

		m1.bark();


	}

}
