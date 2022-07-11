package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("要素数は");
		int n = scan.nextInt();
		scan.close();

		String fileName="src/sorting/SortData_n"+n+"max1000000.txt";
		File file= new File(fileName);

		//乱数データのファイル読み込み
		System.out.println(fileName+"よりデータの読み込み！");
		scan = new Scanner(file);


		@SuppressWarnings("unused")
		int dummy = scan.nextInt();//dummyは利用しない
		@SuppressWarnings("unused")
		int max = scan.nextInt();

		int[]x = new int[n];
		for(int i =0;i<n;i++){
			x[i]=scan.nextInt();
		}
		scan.close();

		//出力
		for(int i =0;i<10;i++){
			System.out.printf("%d ",x[i]);
		}
		System.out.println();

	}

}
