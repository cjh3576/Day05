package com.JH.school;

import java.util.Scanner;

public class StudentView {

	Scanner sc = new Scanner(System.in);
	//	listView
	//	학생정보 전체를 출력
	public void  listView(Student [] students)
	{
		
		for(int i = 0; i<students.length; i++) {
			
			System.out.println("학생정보 출력");
			System.out.println(i+1 + "학생 이름 : " + students[i].name);
			System.out.println(i+1 + "학생 번호 : " + students[i].num);
			System.out.println(i+1 + "학생 국어 점수 : " + students[i].kor);
			System.out.println(i+1 + "학생 영어 점수 : " + students[i].eng);
			System.out.println(i+1 + "학생 수학 점수 : " + students[i].math);
			System.out.println("총점 : " +  students[i].total);
			System.out.println("평균 : " +  students[i].avg);
			System.out.println("===================================");
			
		}
	}
	//	view
	//학생 한명 정보 출력
	public void view(Student student) {

		System.out.println("이름 : " +student.name);
		System.out.println("번호 : " +student.num);
		System.out.println("국어점수 : " + student.kor);
		System.out.println("영어점수 : " + student.eng);
		System.out.println("수학점수 : " +student.math);
		System.out.println("총점 : " +  student.total);
		System.out.println("평균 : " +  student.avg);
	}



}

