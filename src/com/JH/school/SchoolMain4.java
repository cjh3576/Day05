package com.JH.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		// 
		//1. 학생등록
		// 학생수 입력, 학생 번호 입력, 학생 이름 입력 , 학생 국영수 점수 입력
		//2. 전체 정보 조회
		// 모든 학생 번호, 이름, 국어, 영어, 수학 출력
		//3. 학생정보 검색 (한사람만)
		// 검색할 학생의 번호 입력
		// 검색한 학생의 번호, 이름, 국영수 출력
		//4. 프로그램 종료
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 학생 수");
		int num = sc.nextInt();
		
		Student st = null;
		Student [] students = new Student[num];
		
		for(int i =0; i<num; i++) {
			st = new Student();
			System.out.print(i+1 + " 번째 학생 이름 입력 : ");
			st.name = sc.next(); 
			System.out.print(i+1 + " 번째 학생 번호 입력 : ");
			st.num = sc.nextInt();
			System.out.print(i+1 + " 번째 국어 점수 입력 : ");
			st.kor = sc.nextInt();
			System.out.print(i+1 + " 번째 영어 점수 입력 : ");
			st.eng = sc.nextInt();
			System.out.print(i+1 + " 번째 수학 점수 입력 : ");
			st.math = sc.nextInt();
			System.out.println();
			students[i] = st;
			students[i].total += students[i].kor + students[i].eng + students[i].math;
			students[i].avg = students[i].total/3;
		}
		for(int i = 0; i<num; i++) {
			System.out.println(i+1 + " 번 학생이름 : " +students[i].name );
			System.out.println("번       호 : " + students[i].num);
			System.out.println("국어점수 : " + students[i].kor);
			System.out.println("영어점수 : " + students[i].eng);
			System.out.println("수학점수 : " + students[i].math);
			System.out.println();
		}

	}

}
