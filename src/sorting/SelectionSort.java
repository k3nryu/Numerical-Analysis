package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SelectionSort {

	public static void main(String[] args) throws FileNotFoundException {
	System.out.println("選択法のよる並び替え");
		
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
		
		int m =20;
		
		//出力
		for(int i=0;i<m;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();	
		
		//選択法によるソート
		//long startTime = System.currentTimeMillis();
		long startTime=System.nanoTime();
		for(int i=0;i<x.length-1;i++){
			int min=i;
			for(int j=i+1;j<x.length;j++){
				if(x[j]<x[min]){
					min=j;
				}
			}
			int y=x[min];
			x[min]=x[i];
			x[i]=y;
		}
		//long endTime = System.currentTimeMillis();
		long endTime=System.nanoTime();
		
		//時間経過を出力
		//System.out.println( "選択法の経過時間 = " + (endTime - startTime)  + " msec" );
		System.out.println("選択法の経過時間="+(endTime-startTime)+"nsec");
		
			//出力
			for(int k=0;k<m;k++){
				System.out.print(x[k]+" ");
			}
			System.out.println();
		}

	}


