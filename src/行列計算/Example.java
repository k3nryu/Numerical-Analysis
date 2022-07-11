package 行列計算;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a={0,2,3,4};
		double[] b={1,2,3,4};
		double[][] c={{1,2,3,4},
				     {3,4,5,6}};
		double[] d={1,1,1,1};
		double[] e={1,1};
		double[][] f={{1,0},{1,1},{1,2},{1,3}};
//		Calc.printVec(a);
//		Calc.printMat(c);
//		Calc.printVec(Calc.scalarMultiple(2.0,a));
//		Calc.printVec(Calc.addVec(a,b));
//		System.out.println(Calc.innProd(a,b));
//		Calc.printVec(Calc.matVec(c,d));
//		Calc.printVec(Calc.residual(c,d,e));
//		Calc.printMat(Calc.multipleMat(c,f));
		System.out.println(Calc.vecNorm1(d));
		System.out.println(Calc.vecNorm2(d));
		System.out.println(Calc.matNorm1(c));
		System.out.println(Calc.matNormInf(c));

	}

}
