package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MergeSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner( System.in );
		System.out.println( "要素数：" );
		int n  = scan.nextInt();
		scan.close();

		File file = new File( "src/sorting/SortData_n" + n + ".txt" );
		scan = new Scanner( file );

		@SuppressWarnings("unused")
		int dummy = scan.nextInt(); // dummy は使用しない
		@SuppressWarnings("unused")
		int max = scan.nextInt();

		int m = 20;                  // 出力する要素の個数

		int[] x = new int[n];
		for(int i = 0; i < x.length; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();

		// 出力
		for(int i = 0; i < m; i++) {
			System.out.printf( "%d ",  x[i]);
		}
		System.out.println();

		// マージソート
		// long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();

		int[] temp = new int[x.length];
		for(int intvl = 1; intvl <= x.length; intvl *= 2) {
			for(int s1 = 0; s1 < x.length; s1 += intvl * 2 ) {
				int e1 = Math.min( s1 + intvl , x.length);
				int s2 = e1;
				int e2 = Math.min(s2 + intvl,  x.length);
				int i = s1;
				int j = s2;
				int k = s1;
				while( i < e1 && j < e2 ) {
					if( x[i] < x[j] ) {
						temp[k] = x[i];
						k++;
						i++;
					} else {
						temp[k] = x[j];
						k++;
						j++;
					}
				}
				while( i < e1 ) {
					temp[k] = x[i];
					k++;
					i++;
				}
				while( j < e2 ) {
					temp[k] = x[j];
					k++;
					j++;
				}
				System.arraycopy(temp, s1, x, s1, k - s1);
			}
		}

		//long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();

		// 出力
		System.out.println( "マージソートによる実行時間：" + (endTime - startTime) + " nsec" );

		for(int i = 0; i < m; i++) {
			System.out.printf( "%d ",  x[i]);
		}
		System.out.println();
	}

}