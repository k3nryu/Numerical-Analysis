package sec10;

import java.util.Scanner;

class FibonacciExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		System.out.print( "n = " );
		int n = scan.nextInt();
		scan.close();

		// 配列バージョン
		int answer1 = fibonacci1( n );
		System.out.printf( "%d 番目の値は、%d %n", n, answer1 );
	}
	// 配列バージョン
	static int fibonacci1( int n ) {
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;
		for(int i=2; i<n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n-1];
	}
}