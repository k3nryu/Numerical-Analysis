package bisection;

class BisectionExample {

	public static void main(String[] args) {
      Bisection bisection = new MyBisection();
      double x = bisection.method(0.05, 0.16);
      System.out.println("x="+x);
	}

}

class MyBisection extends Bisection{

	@Override
	double f(double x) {
		return 100*x*x*x-80*x*x+17*x-1;
	}
	
}