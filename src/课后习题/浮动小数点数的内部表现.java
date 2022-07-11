package 课后习题;

class 浮动小数点数的内部表现 {

	public static void main(String[] args) {
//		//问题1
//		double a=0.1;
//		double b=0.3;
//		double c=0.4;
//		System.out.println((a+b)+c);
//		System.out.println(a+(b+c));
//		
//		//问题2
//		double x=Math.pow(10,(-7));
//		double y=(1-Math.cos(x))/Math.pow(x, 2);
//		System.out.println("そのまま計算したyの値:"+y);
//		
//		double Y=Math.pow(Math.sin(x),2)/(Math.pow(x, 2.0)*(1.0+Math.cos(x)));
//		System.out.println("別の計算式で計算したyの値:"+Y);
//		
//		//问题3-1
//		int n =50000;
//		float sum=0f;
//		for(int k=1;k<=n;k++){
//			sum +=1/Math.pow(k, 2);
//		}
//		System.out.println("n="+n+"の時S1＝"+sum);
		
		//问题3-2
		float s=0f;
		float sum=0f;
		int N=500;
		while(sum!=s){
			s=sum;//把sum的数值储存到s里面
			for(int k=1;k<=N;k++){//计算sum
				sum +=1/Math.pow(k, 2);
			}
			N++;
		}
		System.out.println("N="+N+"の時等しい");
		
		//问题3-3
		

	}

}
