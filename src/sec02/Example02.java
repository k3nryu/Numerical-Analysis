package sec02;

class Example02 {

	public static void main(String[] args) {
		double x = 1.2345;
		double y = 0.00000012345;
		double z = 1.23456E-3;

		System.out.println( x );
		System.out.println( y );
		System.out.println( z );
		
		float w = 1.234f;
		System.out.println( w );
		
		/* 以下の結果は1ではなく、0.99999999999999となる*/
		System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
		
		double distance = 8146461123456789012345D;
		System.out.println( distance );
		
	}

}
