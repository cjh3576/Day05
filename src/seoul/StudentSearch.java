package seoul;
import java.util.Scanner;

public class StudentSearch {
	public Student search(Student []  students) {
		//학생 번호 입력받고 배열에서 학생번호랑 일치하는 학생 리턴
		Scanner sc = new Scanner(System.in);
		Student stu = null;
		System.out.println("검색할 학생 번호 입력");
		int sNum = sc.nextInt();

		for(int i =0; i<students.length ; i++) {
			if(students[i].num == sNum) {
				stu = students[i];
				break;
			}
			else {
				System.out.println("등록된 학생이 없습니다.");
				break;
			}
		}

		return stu;

	}
}
