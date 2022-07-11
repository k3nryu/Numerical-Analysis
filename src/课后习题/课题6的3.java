package 课后习题;

public class 课题6的3 {
	static double f(double x){
		return Math.pow((x-1.0),4.0);
	}
	static double df(double x){
		return 4.0*Math.pow((x-1.0),3.0);
	}
	public static void main(String[] args) {
		double x=5.0;
		double x1=x+1.0;
		double e=1.0E-8;
		int Nmax=200;
		int iter=0;
//		---------------Parallel Code法----------------
		while(Math.abs((x-x1)/x)>=e){//相対誤差判定
//		while(Math.abs(f(x))>=e){//残差判定
			    x1=x;
				x= x-f(x)/df(5.0);//输入最初的x
				iter +=1;
				if(iter == Nmax){
					System.out.println("No Convergence!");
					break;
				}	
			}
			System.out.println("反覆回数="+iter);
			System.out.println("近似解="+x);
			System.out.println("絶対誤差="+Math.abs(1.0-x));


	}

}
