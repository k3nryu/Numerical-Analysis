package sec10;

class HanoiExample {

	public static void main(String[] args) {

		int n = 3;
		// hanoi( n, 'A', 'B', 'C' );

		// A と B の間で直接円盤の移動をしてはいけない場合
		hanoi2( n , 'A', 'B', 'C' );
	}

	static void hanoi( int n, char a, char b, char c ) {
		if( n == 0 ) {
			return;
		}
		hanoi( n - 1, a, c, b );
		System.out.printf( "%sから%sへ円盤%dを移動%n", a, b, n );
		hanoi( n - 1, c, b, a );
	}

	static void hanoi2( int n,  char a, char b, char c ) {

	}
}