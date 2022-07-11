package 课后习题;

public class Newton法解函数 {
	static double f(double x){
		return x*x*x - 4.0*x*x +(13.0/4.0)*x -(3.0/4.0);
	}
	static double df(double x){
		return 3.0*x*x - 8.0*x +(13.0/4.0);
	}

	public static void main(String[] args) {
		double x=-6.0;
		double x_old=7.0;
		double e=1E-7;

		while(Math.abs(x_old-x)>e){
			x_old=x;
			x= x-f(x)/df(x);
		}
		System.out.println(x);
	}

}
