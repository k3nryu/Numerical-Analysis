package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class QuickSort {

	public static void main(String[] args)throws FileNotFoundException {
		
		System.out.println("クイックソート法による並び替え");
		
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
		
		//クイックソートによるソート
		//long startTime = System.currentTimeMilis();
		long startTime=System.nanoTime();
		
		int[][]stack=new int [100][2];
		
		int sp =1;
		stack[0][0]=0;
		stack[0][1]=x.length-1;
		while(sp>0){
			sp--;
			int left=stack[sp][0];
			int right=stack[sp][1];
			
			int l=left;
			int r=right;
			int pivot=x[(left+right)/2];
			
			do{
				while(x[l]<pivot){
					l++;
				}
				while(x[r]>pivot){
					r--;
				}
				if(l<=r){
					int y=x[l];
					x[l]=x[r];
					x[r]=y;
					l++;
					r--;
				} 
			}while(l<=r);
			if(left<r){
				stack[sp][0]=left;
				stack[sp][1]=r;
				sp++;
			}
			if(l<right){
				stack[sp][0]=l;
				stack[sp][1]=right;
				sp++;
			}
		}
		
		
		//long endTime = System.currentTimeMilis();
		long endTime=System.nanoTime();
				
		//時間経過を入力
		System.out.println("クイックソート法の経過時間="+(endTime-startTime)+"nsec");
		
		//出力
		for(int k=0;k<m;k++){
			System.out.print(x[k]+" ");
		}
		System.out.println();

	}

}
