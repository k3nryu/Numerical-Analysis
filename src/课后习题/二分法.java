package 课后习题;

public class 二分法 {
	
	static double f(double x){
		return x*x*x - 2.0*x*x - x +2.0;
	}
	
	public static void main(String[] args) {
		double a =1.5;
		double b =3.0;
		double c =0.0;
		double e =1E-12;
		int iter = 0,Nmax=200;
		if(f(a)*f(b) > 0.0){
			System.out.println("初期値が適切ではありません");
		}else{
			while(Math.abs(b-a)/2.0>=e){
				c=(a+b)/2.0;
				iter += 1;
				if(f(a)*f(c)>0){
					a=c;
				}else if(f(a)*f(c)<0){
					b=c;
				}else if(f(a)*f(c)==0){
					break;
				}else if(iter == Nmax){
					System.out.println("最大反復回数を超えました");
					break;
				}
			}
		}
				
		int k =0;		
		while(Math.abs(3.0-1.5)/Math.pow(2.0, k+1)>=1E-12){
			k++;
		}
		System.out.println("k="+k);
		System.out.println("反復回数は" + iter + "回");		
		System.out.println("近似解は" + c);
		System.out.println("|f(c)|="+Math.abs(f(c)));
		
	}

}
