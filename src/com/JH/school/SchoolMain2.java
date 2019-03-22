package com.JH.school;

import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("입력할 학생 수");
		int num = sc.nextInt();
		
		
		Student st = null;
		Student [] students = new Student[num];
		
		for(int i =0; i<num; i++) {
			st = new Student();
			System.out.print("이름 입력 : ");
			st.name = sc.next(); 
			System.out.print("번호 입력 : ");
			st.num = sc.nextInt();	
			students[i] = st;
		}
		for(int i = 0; i<num; i++) {
			System.out.println("학생이름 : " +students[i].name + "번호 입력 : " + students[i].num);
		}

		
		
		
	}

}
