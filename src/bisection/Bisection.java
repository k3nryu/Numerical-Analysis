package bisection;

//２分法
abstract class Bisection {
	
	double method(double a,double b){
		double fa =f(a);
		double epsilon = 1.0e-15;
		double m = a;
		while(true){
			m = (a+b)/2;
			double fm = f(m);
			if(Math.abs(fm)<epsilon)break;
			if(fa*fm<0){
				b=m;
			}else{
				a=m;
				fa=fm;//これは無くても良いだけれど
			}
			System.out.printf("a=%f,f(a)=%f,m=%f,f(m)=%f,b=%f,f(b)=%f%n",a,fa,m,fm,b,f(b));
		}
		return m;
	}
	
	abstract double f(double x);

}
