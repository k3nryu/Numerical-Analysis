package 行列計算;

public class 課題9 extends Solve{
	public static void main(String[] args) {
		int n=5;
		double[][] A=new double[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				A[i][j]=1.0/((i+1)+(j+1)-1.0);
			}
		}
		Calc.matNormInf(A);
		Calc.printMat(LU_Inverse.A(A));
		
	}
}
