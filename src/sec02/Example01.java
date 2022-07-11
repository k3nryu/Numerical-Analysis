package sec02;

class Example01 {

	public static void main(String[] args) {
//	int a = 123;
	//long b = 1234567890123456789L;
//	byte b = 100;
	String a ="10+20="+10+20;
	double b =1.5 + 1/2;
	System.out.println( a );
	System.out.println( b );
	
	char c = 'ば';
	System.out.println( c );
	
	
	System.out.println( (int)c );
	
	c = (char)(c + 1);
	System.out.println( c );
	}

}
