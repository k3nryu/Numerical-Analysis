package 课后习题;

public class Newton法的收束性 {
	static double f(double x){
		return x*x*x+x*x-5.0*x+3.0;
	}
	static double df(double x){
		return 3.0*x*x+2.0*x-5.0;
	}
	public static void main(String[] args) {
		double x=-30.0;
		double e=1.0E-12;
		int Nmax=50;
		int iter=0;
		
		while(Math.abs(f(x))>=e){//残差判定
			x= x-f(x)/df(x);
			iter +=1;
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}	
			System.out.printf("%.2e\n",Math.abs(x+3.0));
	    }
		System.out.println("反覆回数="+iter);
		System.out.println("近似解="+x);
	}
}
