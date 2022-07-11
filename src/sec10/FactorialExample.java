package sec10;

/* 階乗計算 */
class FactorialExample {

	public static void main(String[] args) {

			int n = 10;
			int answer1 = factorial1( n );
			System.out.printf( "%d! = %d%n", n, answer1 );

			// FactorialExample example = new FactorialExample();
			// int answer2 = example.factorial2( n );

			int answer3 = factorial3( n );
			System.out.printf( "%d! = %d%n", n, answer3 );
	}
	// 非再帰バージョン
	static int factorial1( int n ) {
		int m  = 1;
		for(int i=1; i<=n; i++) {
			m *= i;
		}
		return m;
	}
	// 再帰バージョン
	static int factorial3( int n ) {
		if( n == 0 ) {
			return 1;
		} else {
			return n * factorial3( n - 1 );
		}
	}

}