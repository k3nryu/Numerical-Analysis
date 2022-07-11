package 行列計算;
/**
 * jacobi=-D^(-1)*(E+F)
 * G-S=-(D+F)^(-1)*F
 * SOR=[1/ω(D+ωE)]^(-1)*1/ω[(1-ω)D-ωF]
 */
public class 計算数学過去問ー演習相原Aー2015年12月14日 {
	public static void main(String[] args) {

		/**1.(1)*********************************************************/
//		int n=100;
//		double[][] A=new double[n][n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				A[i][j]=Math.sqrt(2*(i+1)+j+1);
//			}
//		}
//		System.out.println("１−ノルム＝"+Calc.matNorm1(A));
//		System.out.println("無限−ノルム＝"+Calc.matNormInf(A));
		
		/**(2)ｐノルム*********************************************************/
//		int p=3;
//		double[]x=new double[100];
//		for(int i=0;i<100;i++){
//			x[i]=i+1;
//		}
//		double sum=0.0;
//		for(int i=0;i<x.length;i++){
//			sum+=Math.pow(Math.abs(x[i]),p);
//		}
//		System.out.println(Math.pow(sum, (1.0/p)));
		
		/**3.(1)逆行列以及tr*********************************************************/
		double A[][]={{-1.1,2.2,3.3},
		{4.4,-5.5,6.6},
		{7.7,8.8,-9.9}};
		double B[][]=LU_Inverse.A(A);
		Calc.printMat(B);
		double sum=0.0;
		for(int i=0;i<3;i++){
			sum+=B[i][i];
		}
		System.out.println(sum);
		/**4*********************************************************/
//		int n=7;
//		double[][]A=new double[n][n];
//		double[]x=new double[n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				A[i][j]=1.0/(i+j+1);
//			}
//		}
//		for(int i=0;i<n;i++){
//			x[i]=1.0;
//		}
//		double[]b=Calc.matVec(A, x);		
		/**(1)*********************************************************/
//		double A_[][]=LU_Inverse.A(A);
//		double k=Calc.matNorm1(A)*Calc.matNorm1(A_);
//		System.out.println("A的条件数="+k);
		/**(2)*********************************************************/
//		double[] x1=Solve.gep(A, b);
////		Calc.printMat(A);
//		Calc.printVec(b);
//		Calc.printVec(x1);
//		double[] w=Calc.subVec(x, x1);//真解-计算解（x-x1）
//		double e=Calc.vecNorm1(w);
//		double r=Calc.vecNorm1(x);
//		System.out.println();
//		System.out.println("相对误差1norm="+e/r);
		/**(3)*********************************************************/
//		b[0]=b[0]+0.001*b[0];
//		double[] x2=Solve.gep(A, b);
//		Calc.printVec(b);
//		Calc.printVec(x2);
//		double[] w=Calc.subVec(x, x2);//真解-计算解（x-x1）
//		double e=Calc.vecNorm1(w);
//		double r=Calc.vecNorm1(x);
//		System.out.println();
//		System.out.println("相对误差1norm="+e/r);
		/**(4)********************************************************
		 * (2)の結果より、得られた近似解x1に対する相対誤差１−ノルムは10e-8程度であり、
		 * 近似解の各成分が少なくとも8桁正しいと言える
		 * しかし(3)で右辺項に微小な誤差が混入した時、得られた近似解x2に対する相対誤差１−ノルムは10e+1を上回っており
		 * 近似解成分で一桁も正しくない成分がある。
		 * 右辺項に混入した誤差Δbが解に与える影響は条件数に依存しており、理論的に以下の関係式に成り立つ
		 *  ||Δx||       ||Δb||
		 *  ------ <=k(A)------
		 *  ||x*||       ||b*||
		 * ただし、Δxは解に含まれる誤差である。今、 ||Δb||/||b*||=2.81e-4であるが、条件数は10e+8を上回っていることから、
		 * 誤差が大きく拡大されるから、これより(3)では良い近似解が得られなかったと考えられる
		 * */
		
		
		
		
//		5.(1)
//		int n=3;
//		double[][]A=new double[n][n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				if(i>j){
//					A[i][j]=-1.0;
//				}
//				if(i==j){
//					A[i][j]=n;
//				}
//				if(i<j){
//					A[i][j]=1.0;
//				}
//			}
//		}
//		double[]b=new double[n];
//		for(int i=0;i<n;i++){
//			b[i]=1.0;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}