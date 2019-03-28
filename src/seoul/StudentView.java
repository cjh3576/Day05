package seoul;

public class StudentView {
	public void view(Student students) {
		//한명 출력
		System.out.println("이름 : " + students.name + " 번호 : " + students.num);
		System.out.println("국어점수 : " + students.kor + "  영어점수 : " + students.eng + "  수학점수 : " + students.math);
		System.out.println("총점 : " + students.total + "  평균 : " + students.avg);
		System.out.println("=======================");
	}
	
	public void listView(Student[] students) {
		Student[] s = null;
		if(students != null) {
			for(int i =0; i<students.length; i ++) {
				s= new Student[i];
				System.out.println("이름 : " + students[i].name + " 번호 : " + students[i].num);
				System.out.println("국어점수 : " + students[i].kor + "  영어점수 : " + students[i].eng + "  수학점수 : " + students[i].math);
				System.out.println("총점 : " + students[i].total + "  평균 : " + students[i].avg);
				System.out.println("=======================");
			}
		}
		else {
			System.out.println("등록된 학생이 없습니다");
		}
	}
	
	
}
