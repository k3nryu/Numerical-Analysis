package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MargeSort {

	public static void main(String[] args) throws FileNotFoundException {
		
System.out.println("マージソート法による並び替え");
		
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
		
		//マージソートによるソート
		//long startTime = System.currentTimeMilis();
		long startTime=System.nanoTime();
		
		int[]temp=new int[x.length];
		
		for(int intvl =1;intvl<=x.length;intvl*=2){
			for(int s1=0;s1<x.length;s1+=intvl*2){
				int e1=Math.min(s1+intvl, x.length);
				int s2=e1;
				int e2=Math.min(s2+intvl, x.length);
				int i=s1;
				int j=s2;
				int k=s1;
				while(i<e1&&j<e2){
					if(x[i]<x[j]){
						temp[k]=x[i];
						k++;
						i++;
					}else{
						temp[k]=x[j];
						k++;
						j++;
					}
				}
				while(i<e1){
					temp[k]=x[i];
					k++;
					i++;
				}
				while(j<e2){
					temp[k]=x[j];
					k++;
					j++;
				}
				System.arraycopy(temp,s1,x,s1,k-s1);
			}
		}
		
		//long endTime = System.currentTimeMilis();
		long endTime=System.nanoTime();
				
		//時間経過を入力
		System.out.println("マージソート法の経過時間="+(endTime-startTime)+"nsec");
		
		//出力
		for(int i=0;i<m;i++){
			System.out.printf("%d ",  x[i]);
		}
		System.out.println();

	}

}
