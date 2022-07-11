package arrayExamples;

//配列の中の最大値や最小値
class Example01 {

	public static void main(String[] args) {
		int[]x = {10,9,5,-3,8,20,23,-12};
		
		//最大値を求める
		int max = x[0];
		for(int i =0;i<x.length;i++){
		  if(x[i]>max){
			  max=x[i];
		  }
		}
		System.out.println("最大値は"+max);
		
		//最大値を求める
		max = Integer.MIN_VALUE;
		for(int element:x){
			max = Math.max(max, element);
		}
		System.out.println("最大値は"+max);
		
		//最小値を求める
		int min = x[0];
		for(int i =0;i<x.length;i++){
			if(x[i]<min){
				min=x[i];
			}
		}
		System.out.println("最小値は"+min);
		
		//最小値を求める
		min = Integer. MAX_VALUE;
		for(int element:x){
			min = Math.min(min,element);
			
		}
		System.out.println("最小値は"+min);
		
		//xを出力
		for(int i =0;i<x.length;i++){
			System.out.print(x[i]+",");
		}
		System.out.println();
		
		System.out.println("最大値＝"+max);
	}

}
