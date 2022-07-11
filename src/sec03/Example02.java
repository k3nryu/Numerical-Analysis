package sec03;

//肥満度BMIの計算
class Example02 {

	public static void main(String[] args) {
		double myWeight= 50.5;  //体重(kg)
		double myHeight= 167.5/100; //身長(m)
		double bmi = myWeight/(myHeight*myHeight);
		double averageWeight=22.0*(myHeight*myHeight);
		
		System.out.println("標準体重="+ averageWeight + "kg");
		System.out.println("あなたのBMIは、"+bmi);
		if( bmi>= 25){
			System.out.println("デブですね！");}
		else if(bmi>= 18.5){
			System.out.println("普通体重です。");	
		}
		else{
			System.out.println("痩せすぎ");
		}

	}

}
