package 课后习题;

class 课题6 {
	static double f(double x){
		return Math.sin(x)/(x-1.0);
	}
	static double df(double x){
		return (Math.cos(x)*(x-1.0)-Math.sin(x))/Math.pow((x-1.0),2.0);
	}
	public static void main(String[] args) {
		double x=-5.0;
		double x1=x+1.0;
		double x2=0.0;
		double e=1.0E-10;
		int Nmax=50;
		int iter=0;
//		----------------Newton法--------------------
//		while(Math.abs((x1-x)/x)>=e){//相対誤差判定
////	while(Math.abs(f(x))>=e){//残差判定
//			x1=x;
//			x= x-f(x)/df(x);
//			iter +=1;
//			if(iter == Nmax){
//				System.out.println("No Convergence!");
//				break;
//			}
//			System.out.printf("%.2e\n",Math.abs(x-2.0*Math.PI));
//		}
//		System.out.println("反覆回数="+iter);
//		System.out.println("近似解="+x);
//		System.out.println("絶対誤差="+Math.abs(3.0-x));
//		
//		-----------------Secant法----------------------
		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
//		while(Math.abs(f(x))>=e){//残差判定
			x2=x1;
			x1= x1-f(x1)*(x1-x)/(f(x1)-f(x));
			x=x2;
			iter +=1;
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}	
		}
		System.out.println("反覆回数="+iter);
		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
		System.out.println("絶対誤差="+Math.abs(0.5-x));
//		
//		---------------Parallel Code法----------------
//		while(Math.abs((x-x1)/x)>=e){//相対誤差判定
////	while(Math.abs(f(x))>=e){//残差判定
//			    x1=x;
//				x= x-f(x)/df(5.0);//输入最初的x
//				iter +=1;
//				if(iter == Nmax){
//					System.out.println("No Convergence!");
//					break;
//				}	
//			}
//			System.out.println("反覆回数="+iter);
//			System.out.println("近似解="+x);
//			System.out.println("絶対誤差="+Math.abs(0.5-x));
//
	}

}
