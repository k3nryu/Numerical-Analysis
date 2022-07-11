package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InsertionSort {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("挿入法のよる並び替え");
		
		//データの読み込み
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
		
		int m =20;//出力する個数

		
		//出力
		for(int i=0;i<m;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		//挿入法によるソート
		//long startTime = System.currentTimeMilis();
		long startTime=System.nanoTime();
		for(int i=1;i<x.length;i++){
			int val=x[i];
			int j=i;
			while(j>0&&x[j-1]>val){
				x[j]=x[j-1];
				j--;
			}
			x[j]=val;
		}
		//long endTime = System.currentTimeMilis();
		long endTime=System.nanoTime();
		
		//時間経過を入力
		System.out.println("挿入の経過時間="+(endTime-startTime)+"ミリ秒");
		
		//出力
		for(int k=0;k<m;k++){
			System.out.print(x[k]+" ");
		}
		System.out.println();

		
		//挿入法による

	}

}
