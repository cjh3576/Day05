package com.JH.cars;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.wheel = 4;
		car.color = "white";
		car.size = "중형세단";
		car.company = "BenZ";
		
		Car car2 = new Car();
		car2.color = car.color;
		
		car2.color = "red";
		
		System.out.println(car.color);
		
		
		Bike b1 = new Bike();
		b1.wheel = 2;
		b1.color = "black";
		b1.company = "honda";
		/*
		Engine engine = new Engine();
		engine.hp = 100;
		engine.fuel = "gas";
		engine.cc = 1000;
		car.engine = engine;
		*/
		
		car.engine = new Engine();
		car.engine.hp = 100;
		car.engine.fuel = "gas";
		car.engine.cc = 1000;
		
		System.out.println(car.engine.hp);
		
		Airplane airplane = new Airplane();
		airplane.engine = new Engine[2];
		
		airplane.engine[0] = new Engine();
		airplane.engine[1] = new Engine();
		airplane.engine[0].hp = 10000;
		
		System.out.println(airplane.engine[0].hp);
		
		
		Airplane airplane2 = new Airplane();
		airplane2.engine = new Engine[120];
		for(int i =0; i<airplane2.engine.length; i++) {
			
			Engine e = new Engine();
			e.hp = 1000;
			e.cc = 30000;
			e.fuel = "항공유";
			airplane2.engine[i] = e;
			
//			airplane2.engine[i] = new Engine();
//			airplane2.engine[i].hp = 1000;
//			airplane2.engine[i].fuel = "항공유";
//			airplane2.engine[i].cc = 30000;
			
			
		}
		
	}

}
