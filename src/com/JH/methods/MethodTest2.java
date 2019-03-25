package com.JH.methods;

public class MethodTest2 {
	//m1 - 급여 받아 고용보험 0.2 계산 / 출력
	//m2 - 의료보험 1.3
	//m3 - 국민 1.0
	//m4 - 산재보험 0.4
	public void Go(double g) {
		g = g*0.002 ;
		System.out.println("고용보험 : " + g);
		System.out.println();
	}

	public void Ui(double u) {
		u=u*0.013;
		System.out.println("의료보험 : " + u);
		System.out.println();
	}
	public void Kuk(double k) {
		k=k*0.01;
		System.out.println("국민보험 : " + k);
		System.out.println();
	}
	public void San(double s) {
		s = s*0.004;
		System.out.println("산재보험 : " + s);
		System.out.println();
	}

}
