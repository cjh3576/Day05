package com.JH.methods;

import java.util.Scanner;

public class MethodTest1 {
	
	public void hap(){
		System.out.println(10+20);
	}
	
	public void minus() {
		System.out.println(10-20);
	}
	
	public void bark() {
		//size 변수 선언 값 입력
		//size 90 보다 크면 컹컹컹
		//60~90 이면 멍멍멍
		// 60이하 왈왈왈
		
		System.out.println("size 입력");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size >= 90) {
			System.out.println( " 컹컹컹");
		}
		else if(size>=60 && size<90) {
			System.out.println("멍멍멍");
		}
		else if(size > 0 && size < 60) {
			System.out.println("왈왈왈");
		}
		else {
			System.out.println("잘못된 입력 값");
		}
		
		
		
	}
	
}
