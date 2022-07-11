package monteCarlo;

public class WinterReport extends CalcAreaByMonteCarlo {

	public static void main(String[] args) {
		CalcAreaByMonteCarlo report = new WinterReport();
//		report.setRange( -8, 0, 10, 130 );
		report.setRange( -4, -5, 4, 10 );
		report.setIterCount( 900000000, true );
		double area = report.start();
		System.out.printf( "面積 = %f%n", area );
	}
		
	/**
	 * 面積を求める領域の上限となる関数
	 */
	@Override
	protected double upperFunction(double x) {
//		return -Math.pow(x, 2)+4*x+100;
		return 10;
	}

	/**
	 * 面積を求める領域の下限となる関数
	 */
	@Override
	protected double lowerFunction(double x) {
//		return Math.pow(x, 2);
		return Math.pow(x, 2)-5;
	}
}
