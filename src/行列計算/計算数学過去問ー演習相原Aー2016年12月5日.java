package 行列計算;

public class 計算数学過去問ー演習相原Aー2016年12月5日 {
	public static void main(String[] args) {
		/**1.(3)*********************************************************/
//		int n=100;
//		double[][] A=new double[n][n];
//		double[][] At=new double[n][n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				A[i][j]=i+j+2.0;
//				At[j][i]=i+j+2.0;
//			}
//		}
//		double B[][]=Calc.multipleMat(At,A);
//		Calc.printMat(A);
//		double sum=0.0;
//		for(int i=0;i<n;i++){
//			sum+=B[i][i];
//		}
//		System.out.println(Math.sqrt(sum));
		/**2.(1)*********************************************************/
//		double A[][] = {{1,  1, 1, 1},
//				        {1, -1, 1,-1},
//				        {1,  1,-1,-1},
//				        {1, -1,-1, 1}};
//		for(int i=0;i<4;i++){
//			for(int j=0;j<4;j++){
//				A[i][j]=A[i][j]/2.0;
//			}
//		}
//		Calc.printMat(A);
//		double B[][]=LU_Inverse.A(A);
//		Calc.printMat(B);
		/**3*********************************************************/
		double A[][] = {{1e-15,  2, 0},
				        {2, 2, 2},
				        {0, 2,1e+15}};
		double B[][] = {{1e-15,  2, 0},
				{2, 2, 2},
				{0, 2,1e+15}};
		double[]x=new double[3];
		for(int i=0;i<3;i++){
			x[i]=1.0;
		}
		double[]b=Calc.matVec(A, x);
		/**(1)*********************************************************/
		Calc.printMat(A);
		double A_[][]=LU_Inverse.A(B);
		double k=Calc.matNorm1(A)*Calc.matNorm1(A_);
		System.out.println("A的条件数="+k);
		/**(2)*********************************************************/
//		double[]k=new double[3];
//		double[] x1=Solve.ge(A, b);
////		Calc.printMat(A);
//		Calc.printVec(b);
//		Calc.printVec(x1);
//		double[]i=Calc.matVec(A, x1);
//		double[] w=Calc.subVec(x, x1);//真解-计算解（x-x1）
//		double[] u=Calc.subVec(b, i);//真解-计算解（x-x1）
//		double e=Calc.vecNorm1(w);
//		double r=Calc.vecNorm1(x);
//		double t=Calc.vecNorm1(u);
//		double y=Calc.vecNorm1(b);
//		System.out.println();
//		System.out.println("相对残差1norm="+t/y);
//		System.out.println("相对误差1norm="+e/r);
//		/**5*********************************************************/
//		int n=100;
//		double[][]A=new double[n][n];
//		double[][]B=new double[n][n];
//		double[][]C=new double[n][n];
//		/**5*********************************************************/
//		/**5*********************************************************/
//		double[][]T=new double[n][n];
//		double[][]D=new double[n][n];
//		double[][]E=new double[n][n];
//		double[][]F=new double[n][n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				if(i>j){
//					A[i][j]=-1.0;
//					E[i][j]=-1.0;
//				}
//				if(i==j){
//					A[i][j]=n;
//					D[i][j]=n;
//				}
//				if(i<j){
//					A[i][j]=1.0;
//					F[i][j]=1.0;
//				}
//			}
//		}
//		double[]b=new double[n];
//		for(int i=0;i<n;i++){
//			b[i]=1.0;
//		}
//		B=Calc.addMat(E, F);
////		Calc.printMat(D);
//		C=LU_Inverse.A(B);
//		T=Calc.multipleMat(D, C);
//		System.out.println(Calc.matNormInf(T));



	


		
		
		
		
		
	}

}
