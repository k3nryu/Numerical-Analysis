package sec02;

class Example07 {

	public static void main(String[] args) {
		double x = 0.5;
		
		if(x<0||3<x){
			System.out.println(x+"は区間Ａに入っています");
		}else{
			if(1<=x&&x<2){
			System.out.println(x+"は区間Ｂに入っています");
		}else{
			System.out.println(x+"は区間Ｃに入っています");
		}
			
		if(!(x<0)){//if(x>=0)でもＯＫ
			System.out.println(x+"は非負です");
		}
		
		String mess =(x>=1)?"１以上です":"１未満です";
		System.out.println(x+"は"+mess);
		
		if(x>=1){
			System.out.println(x+"は１以上です");
		}else{
			System.out.println(x+"は１未満です");
		}
		
		}

	}

}
