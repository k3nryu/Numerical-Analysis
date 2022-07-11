package sec07;

import java.util.Scanner;

class Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1;ハンバーガー 2;チーズバーガー　3;カフェオレ;");
		int no = scan.nextInt();
		scan.close();
		/*
		if(no == 1){
			System.out.println("ハンバーガーは100円です");
		}else{
		if(no == 2){
			System.out.println("チーズバーガーは150円です");
		}else{
		if(no == 3){
			System.out.println("カフェオレは120円です");
		}else{
			System.out.println("その番号はメニューにありません");
		}
		*/
		
		switch( no ){
		case 1:
		 System.out.println("ハンバーガーは100円です");
		 break;
		case 2:
		 System.out.println("チーズバーガーは150円です");
		 break;
		case 3:
		 System.out.println("カフェオレは120円です");
		 break;
		default:
		 System.out.println("その番号はメニューにありません");
		 break;
			
		}

		switch(no){
		case 1:
		case 2:
		 System.out.println("1もしくは2");
		 break;
		case 3:
		 System.out.println("3");
		 break;
		default:
		 System.out.println("その他");	
		 break;
		}
	}

}
