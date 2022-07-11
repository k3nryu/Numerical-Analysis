package 课后习题;

public class summerReport {
	static double f(double x){
//		return 100.0*Math.sin(x/100.0);
//				return 200.0*Math.sin(x/200.0)*Math.cos(x/200.0);
				return (200.0*Math.tan(x/200.0))/(1.0+Math.pow(Math.tan(x/200.0),2.0));
	}
	public static void main(String[] args) {
		double x=100.0;
		double x1=x+1.0;
		double x_=0.0;
		double e=1.0E-10;
		int Nmax=300;
		int iter=0;
		//		----------------Newton法--------------------
		//		while(Math.abs((x1-x)/x)>=e){//相対誤差判定
		//			while(Math.abs(f(x))>=e){//残差判定
		//				x1=x;
		//				x= x-f(x)/df(x);
		//				iter +=1;
		//				if(iter == Nmax){
		//					System.out.println("No Convergence!");
		//					break;
		//				}
		//			}
		//			System.out.println("反覆回数="+iter);
		//			System.out.println("近似解="+x);
		//			System.out.println("絶対誤差="+Math.abs(3.0-x));

		//		-----------------Secant法-1---------------------
		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
			//			while(Math.abs(f(x1))>=e){//残差判定
			x_=x1;
			x1= x1-f(x1)*((x1-x)/(f(x1)-f(x)));
			/**			x1= x1-f(x1)*(x1-x)/(f(x1)-f(x));注意：丸め誤差発生**/
			x=x_;
			iter ++;
			System.out.println(iter+"番目＝"+Math.abs(x1));
//			System.out.println(Math.abs(x1));
//			System.out.println(Math.abs((x1-x)/x1));
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}	
		}
		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
		System.out.println("反復回数="+iter);
		System.out.println("絶対誤差="+Math.abs(0.0-x1));
		//		-----------------Secant法-2---------------------
		//			while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
		//				while(Math.abs(f(x1))>=e){//残差判定
		//					x_= x1-f(x1)*((x1-x)/(f(x1)-f(x)));
		//					x=x1;
		//					x1=x_;
		//					iter ++;
		//					if(iter == Nmax){
		//						System.out.println("No Convergence!");
		//						break;
		//					}	
		//				}
		//				System.out.println("反覆回数="+iter);
		//				System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
		//				System.out.println("絶対誤差="+Math.abs(0.50-x1));
		//			---------------Parallel Code法----------------
		//					while(Math.abs((x-x1)/x)>=e){//相対誤差判定
		//						while(Math.abs(f(x))>=e){//残差判定
		//							x1=x;
		//							x= x-f(x)/df(-6.0);
		//							iter +=1;
		//							if(iter == Nmax){
		//								System.out.println("No Convergence!");
		//								break;
		//							}	
		//						}
		//						System.out.println("反覆回数="+iter);
		//						System.out.println("近似解="+x);
		//						System.out.println("絶対誤差="+Math.abs(0.5-x));
		//
		//					}

	}
}

