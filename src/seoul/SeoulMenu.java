package seoul;
import java.util.Scanner;



public class SeoulMenu {
	public void start() {
		boolean check = true;


		Scanner sc = new Scanner(System.in);
		Student[] students = null;
		
		
		while(check) {
			StudentView sv = new StudentView();
			StudentSearch ss = new StudentSearch();
			StudentInput si = new StudentInput();
			System.out.println("1. 정보입력");
			System.out.println("2. 정보전체 출력");
			System.out.println("3. 정보검색 출력");
			System.out.println("4. 프로그램 종료");
			int n = sc.nextInt();

			if(n == 1 ) {
				students = si.makeStudent();
			} //1번 끝


			else if(n == 2 ) {
				System.out.println("전체정보");
				sv.listView(students);
			} //2번 끝
			
			else if (n == 3) {
				
				Student s =ss.search(students);
				if( s!= null) {
					sv.view(s);
				}
				else {
					System.out.println("등록된 학생이 없습니다");
				}
				
			}			//3번 ㄲㅌ

			else if (n ==4) {
				System.out.println("프로그램 종료");
				check = !check;
			}
		} // while문 끝
		sc.close();

	}
}

