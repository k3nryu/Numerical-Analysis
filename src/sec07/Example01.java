package sec07;

import java.util.Scanner;

class Example01 {

	public static void main(String[] args) {
		//キーボードからデータを入力する
		Scanner scan = new Scanner(System.in);
		System.out.print("xを入力して;");
		Double x = scan.nextDouble();
		scan.close();
		
		if(x>=0){
			if(x<1){
				System.out.println("0≦x<1です");
			}else{
				System.out.println("1≦xです");
			}
		}else{
			System.out.println("x<0です");
		}
		

	}

}
