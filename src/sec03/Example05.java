package sec03;

class Example05 {

	public static void main(String[] args) {
		int a = 1000;
		short b =(short)a;
		byte c = (byte)a;
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		short d = 10000;
		System.out.println("d="+d);
		
		int y = (int)(3.2*4.5+1.0)/5;
		System.out.println("y="+y);
		
		int price = 100;
		int number = 9;
		double discount = 0.3;
		int amount = (int)(price*number*(1-discount));
		System.out.println(amount);

	}

}
