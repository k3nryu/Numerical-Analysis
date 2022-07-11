package sec10;

class MethodExample {

	public static void main(String[] args) {
		int x = MyMath.add( 1, 2 );
		System.out.println( " x = " + x );
		MyMath myMath = new MyMath();
		int y = myMath.plus( 3, 4);
		System.out.println( " y = " + y );
		// int z = MyMath.plus( 5, 6); これはできない！

		int a = 1;
		a = MyMath.addition( a, 2 ); // a に２を加えるメソッドのつもり
		System.out.println( " a = " + a );

		a = 1;
		int b = 2;
		MyMath.swap( a, b );
		System.out.printf( " a = %d, b = %d%n", a, b );

		int[] c = {1,2};
		int[] d = {3,4};
		MyMath.swap1( c, d );
		System.out.printf( "c = { %d, %d }, d = { %d, %d }%n",c[0],c[1],d[0],d[1]);
		MyMath.swap2( c, d );
		System.out.printf( "c = { %d, %d }, d = { %d, %d }%n",c[0],c[1],d[0],d[1]);
	}
}

class MyMath {

	static void swap1(int[] x, int[] y) {
		int[] w = x;
		x = y;
		y = w;
	}

	static void swap2(int[] x, int[] y) {
		for(int i=0; i<x.length; i++) {
			int w = x[i];
			x[i] = y[i];
			y[i] = w;
		}
	}

	static void swap(int x, int y) {
		int w = x;
		x = y;
		y = w;
	}

	static int add( int x, int y ) {
		return x + y;
	}

	int plus( int x, int y ) {
		return x + y;
	}

	/*static void addition( int x, int y ) {
		x += y;
		System.out.println( " x = " + x );
	}*/

	static int addition( int x, int y ) {
		return x + y;
	}
}