package 课后习题;

public class 計算数学過去問ー演習相原Bー2015年7月9日 {
/**
 * 絶対誤差の振る舞いから,このグラフは 1 次収束よりも速く,2 次収束よりも遅い収束性を示すものであると分かる.
 * 方程式 f (x) = 0 の解は α = 3, − 1/2(重解)であるから,(2) と合わせて,Newton法であれば α = 3 に 2 次収束し,
 * α = − 1 に対しては 1 次収束すると考えられる(要計算).また,Parallel Code 法は重解でない場合でも高々1 次収束であるから,
 * 消去法によって,このグラフは Secant 法を適用した結果であると考えられる(備考:Secant 法の収束率は約 1.618 である)
 */
//======问题2================================================	
//	public static void main(String[] args) {
//			double a = 1.0;
//			int n =0;
//			double s=0.0;
//			do{
//				n++;
//				a *=1.0/n;
//				s +=a;
//			}while(a>=Math.pow(10,-8));
//			System.out.println("n="+n+",s="+s);
//	}
//======问题4================================================
//	public static void main(String[] args) {		
//			int a=0;
//			while(1.0+Math.pow(2.0,-a)!=1.0){
//				a++;
//			}
//			System.out.println("a="+a);
//	}
//======问题6================================================
//	static double f(double x){
//		return x*x*x-2.0*x*x-(11.0/4.0)*x-(3.0/4.0);
//	}
//	static double df(double x){
//		return 3.0*x*x-4.0*x-(11.0/4.0);
//	}
//	static double ddf(double x){
//		return 6.0*x-4.0;
//	}
//	public static void main(String[] args) {
//		double x=6.0;
//		double x1=0.5;
//		double x_=0.0;
//		double e=1.0E-8;
//		int Nmax=200;
//		int iter=0;
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
//		while(Math.abs((x1-x)/x1)>=e){//相対誤差判定
////		while(Math.abs(f(x1))>=e){//残差判定
//			x_=x1;
//			x1= x1-f(x1)*(x1-x)/(f(x1)-f(x));
//			x=x_;
//			System.out.println(Math.abs((x1-x)/x1)+"\t"+x1);
//			iter ++;
//			if(iter == Nmax){
//				System.out.println("No Convergence!");
//				break;
//			}	
//		}
//		System.out.println("反覆回数="+iter);
//		System.out.println("近似解="+x1);//**注意**：得出的解是x1而不是x
//		System.out.println("絶対誤差="+Math.abs(0.50-x1));
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
//				x= x-f(x)/df(-2.0);
//				iter +=1;
//				if(iter == Nmax){
//					System.out.println("No Convergence!");
//					break;
//				}	
//			}
//			System.out.println("反覆回数="+iter);
//			System.out.println("近似解="+x);
//			System.out.println("絶対誤差="+Math.abs(0.5-x));
//			System.out.println(ddf(-0.5));
//==========================================================
	
//	}
/**
* f (x) = 3 tan−1 (x − 2) + 1/4 (x − 1) 
* 理由:
反復解が無限ループしてしまうことが原因である.反復解の振る舞いを見て,2 つの値
(例えば x199 = −15.508909243239493,x200 = 17.86288260493808)を
交互にとるなど,振動している様子を把握でき ていれば可.
対応: 
反復解の無限ループを回避するために,初期値を変更するなどの対応が書かれていれば可
(実際に初期 値を変更して近似解を求めていることが望ましい).
*/
}



