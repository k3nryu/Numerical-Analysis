package sec09;

class Truck extends Car {
	private int payload = 0;
	
	/*荷物（ペイロード）を載せる*/
	void addPayload(int value){
		this.payload+=value;
	}
	
	/*荷物（ペイロード）下す*/
	void deletePayload(int value){
		this.payload-=value;
	}
	
	void printPayload(){
		System.out.printf("現在の積載量は%dkgです。%n",this.payload);
	}

}
