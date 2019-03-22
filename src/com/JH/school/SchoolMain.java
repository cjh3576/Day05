package com.JH.school;

public class SchoolMain {

	public static void main(String[] args) {
		//student 참조해서 student 객체를 생성
		// 1. 클래스 명, 변수명 선언
		Student st = new Student();
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		
		st.name="JH";
		st.num = 1;
		System.out.println(st.name);
		System.out.println(st.num);
		
		
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.num);
		
		System.out.println("===============");
		System.out.println("total : " +st.total);
		st.kor = 40;
		st.eng = 40;
		st.math = 40;
	}

}
