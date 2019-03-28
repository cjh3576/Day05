package seoul;

import java.util.Scanner;

public class StudentInput {
	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int select = sc.nextInt();
		
		Student[] students = new Student[select];
		students = new Student[select];

		for(int i =0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 점수 입력");
			student.eng = sc.nextInt();
			System.out.println( "수학 점수 입력");
			student.math = sc.nextInt();
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/ 3.0;
			students[i] = student;
			
		}
		return students;
	}
}
