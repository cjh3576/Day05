package com.JH.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double reward = 0;
		boolean check = true;
		MethodTest2 m1 = new MethodTest2();

		while(check) {
			System.out.println(" 1. 급여 입력");
			System.out.println(" 2. 고용보험");
			System.out.println(" 3. 의료보험");
			System.out.println(" 4. 국민연금");
			System.out.println(" 5. 산재보험");
			System.out.println(" 6. 종료");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.print("급여 입력 : ");
				reward = sc.nextInt();
				break;
			case 2:
				System.out.println("고용 보험 계산 ");
				m1.Go(reward);
				break;
			case 3:
				System.out.println("의료 보험 계산");
				m1.Ui(reward);
				break;
			case 4:
				System.out.println("국민 연금 계산");
				m1.Kuk(reward);
				break;
			case 5:
				System.out.println("산재 보험 계산");
				m1.San(reward);
				break;
			case 6:
				check = false;
				break;
			default : 
				System.out.println( "잘못된 입력  프로그램 종료");
				check = false;
				break;
			}


		}

	}

}
