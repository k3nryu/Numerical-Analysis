package 课后习题;

public class 計算数学過去問ー演習相原Aー2015年7月13日 {
	/**
	 * 问题5
	 * ∑∞ xn
	 * n=0 n! 
	 * n = 21 浮動小数点演算では丸め誤差の影響は避けられない.倍精度において,e21(1.5) ≈ 4.481689070338066 であり,
	 * また第 22 項目の値は 9.762758099774124E−17 であった.この値は倍精度マシンイプシロン (≈ 2.22E−16)
	 *  を下回っており,e21(1.5) に加えても「情報落ち」によって計算結果に反映されなかった と考えられる.なお,
	 *  第 21 項目の値は 1.3667861339683774E−15 であり,e20(1.5) に加えるとわずかに 計算結果に反映される.
	 *  
	 *  问题6
	 *  ある 3 次方程式 の解を求めるために,Parallel Code 法を適用した.様々な初期値からスタートし,十分 に反復を行ったが収束せず,
	 *  精度のよい近似解は求まらなかった.この場合に考えられる状況や関数の 形状などを具体的に挙げよ.(複数回答可)
	 *  
	 *  (x − 1)3 = 0 など 3 重解を持つ方程式を考えると,収束率がほぼ 1 になるため,Parallel Code 法では精 度のよい近似解を求められないと考えられる
	 */	
	/**
	 * 问题7
	 */
	static double f(double x){
		return x*x*x*x-(13.0/2.0)*x*x*x+15.0*x*x-14.0*x+4.0;
	}
	static double df(double x){
		return 4.0*x*x*x-(39.0/2.0)*x*x+30.0*x-14.0;
	}
	static double ddf(double x){
		return 12.0*x*x-39.0*x+30.0;
	}
	public static void main(String[] args) {
		double x=1.0;
		double x1=1.5;
		double x_=0.0;
		double e=1.0E-12;
		int Nmax=200;
		int iter=0;
//		----------------Newton法--------------------
////		while(Math.abs((x1-x)/x)>=e){//相対誤差判定
//		while(Math.abs(f(x))>=e){//残差判定
//			x1=x;
//			x= x-f(x)/df(x);
//			iter +=1;
//			if(iter == Nmax){
//				System.out.println("No Convergence!");
//				break;
//			}
//		}
//		System.out.println("反覆回数="+iter);
//		System.out.println("近似解="+x);
//		System.out.println("絶対誤差="+Math.abs(3.0-x));
//		-----------------Secant法-1---------------------
		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
//		while(Math.abs(f(x1))>=e){//残差判定
			x_=x1;
			x1= x1-df(x1)*((x1-x)/(df(x1)-df(x)));
			x=x_;
//			System.out.println(Math.abs((x1-x)/x1)+"\t"+x1);
			iter ++;
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}	
		}
		System.out.println("反覆回数="+iter);
		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
//		System.out.println("絶対誤差="+Math.abs(0.50-x1));
		System.out.println(ddf(x1)>0);
//		-----------------Secant法-2---------------------
//		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
//		while(Math.abs(f(x1))>=e){//残差判定
//			x_= x1-f(x1)*(x1-x)/(f(x1)-f(x));
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
//		
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
	
	}	
}
