package com.JH.school;

import java.util.Scanner;


public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("선생님 이름을 입력 : ");
		String tName = sc.next();
		System.out.println("선생님의 과목명 입력 : ");
		String tSubject = sc.next();
		Teacher teacher = new Teacher();
		boolean check = true;
		StudentView sv = new StudentView();



		while(check) {


			System.out.println("1. 학생정보 입력"); //학생 수, 정보 입력
			System.out.println("2. 전체정보 조회");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 프로그램 종료");
			int num = sc.nextInt();

			switch(num) {
			case 1 : //학생정보입력
				System.out.println("입력할 학생 정보 수 : ");
				int sNum = sc.nextInt();				
				teacher.students = new Student[sNum]; //입력수 만큼 teacher객체에 있는 Student [] 타입의 students  생성


				for(int i =0; i<teacher.students.length; i++) {

					Student student = new Student(); //students  길이 만큼 Student 객체 생성

					System.out.println(i+1 + "번째 학생 이름 입력 ");
					student.name = sc.next();
					System.out.println(i+1 + "번째 학생 번호 입력");
					student.num = sc.nextInt();
					System.out.println(i+1 + "번째 학생 국어점수 입력");
					student.kor = sc.nextInt();
					System.out.println(i+1 + "번째 학생 영어점수 입력");
					student.eng = sc.nextInt();
					System.out.println(i+1 + "번째 학생  수학점수 입력");
					student.math = sc.nextInt();

					student.total = student.kor + student.eng + student.math;
					student.avg = student.total/3.0;
					teacher.students[i] = student;

				}
				break;
			case 2:   //전체정보 조회
				if(teacher.students!= null ) {
					sv.listView(teacher);
				}
				else {
					System.out.println("입력된 학생 정보가 없습니다");
					System.out.println();
				}
				break;

			case 3:
				System.out.print("검색할 학생 번호 입력 : ");
				int stuNum = sc.nextInt();
				boolean find = true;
				for(int i = 0; i<teacher.students.length; i++) {
					if(stuNum == teacher.students[i].num) {
						sv.view(teacher.students[i]);
						find = !find;
						
					}
					if(find) {
						System.out.println("없는 번호 입니다.");
					}
				
				break;

				case 4:
					// 프로그램 종료
					check = false;
					System.out.println("프로그램 종료");
					break;


				} 
			}
		}
	} 
}



