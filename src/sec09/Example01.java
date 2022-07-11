package sec09;

class Example01 {

	public static void main(String[] args) {
		//Carクラスのインスタンスを作成
		Car myCar = new Car(100);
		
		//myCar.speed = 10000000;
		
		//速度を５０上げる
		int speed = myCar.speedUP(50);
		System.out.println("速度は、時速"+speed+"km");
		
		//速度を３０下げる
		myCar.speedDown(30);
		
		//速度を表示する
		myCar.printSpeed();
		
		Car sisterCar= new Car();
		speed = sisterCar.speedUP(30);

	}

}
