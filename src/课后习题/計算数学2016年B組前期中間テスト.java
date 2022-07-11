package 课后习题;

public class 計算数学2016年B組前期中間テスト {
	static double f(double x){
		return x*x*x-3.0*x+2;
	}
	static double df(double x){
		return 3.0*x*x-3.0;
	}
	static double ddf(double x){
		return 6.0*x;
	}
	static double g(double x,double y){
		return 1.0/(Math.sqrt(x+y)-Math.sqrt(x));
	}
	static double h(double x,double y){
		return (Math.sqrt(x+y)+Math.sqrt(x))/y;
	}

	public static void main(String[] args) {
//============================问题4================================================
//		System.out.println(g(4.0E6,4.0E-6));
//		System.out.println(h(4.0E6,4.0E-6));
//============================问题6================================================
		double x=20.0;
		double x1=15.0;
		double x_=0.0;
		double e=1.0E-12;
		int Nmax=200;
		int iter=0;
//		----------------Newton法--------------------
		while(Math.abs((x1-x)/x)>=e){//相対誤差判定
//	while(Math.abs(f(x))>=e){//残差判定
			x1=x;
			x= x-f(x)/df(x);
			iter +=1;
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}
		}
		System.out.println("反覆回数="+iter);
		System.out.println("近似解="+x);
		System.out.println("絶対誤差="+Math.abs(1.0-x));
		System.out.println(df(-2.0));
//		
//		-----------------Secant法-1---------------------
////		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
//		while(Math.abs(f(x1))>=e){//残差判定
//			x_=x1;
//			x1= x1-f(x1)*((x1-x)/(f(x1)-f(x)));
///**			x1= x1-f(x1)*(x1-x)/(f(x1)-f(x));注意：丸め誤差発生**/
//			x=x_;
//			iter ++;
////			System.out.println(Math.abs((x1-x)/x1)+"\t"+x1);
//			if(iter == Nmax){
//				System.out.println("No Convergence!");
//				break;
//			}	
//			System.out.print("e"+iter+"=");
//			System.out.printf("%.2e",Math.abs(x1-1.0));
//			System.out.println();
//		}
//		System.out.println("反覆回数="+iter);
//		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
//		System.out.println(df(1.0));
//		-----------------Secant法-2---------------------
//		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
////		while(Math.abs(f(x1))>=e){//残差判定
//			x_= x1-f(x1)*((x1-x)/(f(x1)-f(x)));
//			x=x1;
//			x1=x_;
//			iter ++;
//			if(iter == Nmax){
//				System.out.println("No Convergence!");
//				break;
//			}	
//		}
//		System.out.println("反覆回数="+iter);
//		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
//		System.out.println("絶対誤差="+Math.abs(0.50-x1));
//		---------------Parallel Code法----------------
//		while(Math.abs((x-x1)/x)>=e){//相対誤差判定
////	while(Math.abs(f(x))>=e){//残差判定
//			    x1=x;
//				x= x-f(x)/df(-6.0);
//				iter +=1;
//				if(iter == Nmax){
//					System.out.println("No Convergence!");
//					break;
//				}	
//			}
//			System.out.println("反覆回数="+iter);
//			System.out.println("近似解="+x);
//			System.out.println("絶対誤差="+Math.abs(0.5-x));


//================================================================================
	}

}
