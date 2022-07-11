package 行列計算;

public class Guassの消去法 {
	public static void main(String[] args) {
//		
//		double A[][]={{1,2,1,2,1},
//				{2,3,2,3,2},
//				{1,2,3,4,5},
//				{4,3,8,1,2},
//				{8,2,4,1,9}};
//		
//		double b[]={7,7,7,7,7};
//		Calc.printVec(Solve.gep(A, b));
//		
//		int n=A.length;
		int n=5;
		double A[][]=new double[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				A[i][j]=1.0/(i+1+j+1);
			}
		}
		double b[]={1,1,1,1,1};	
		/***************前進消去過程*************************/		
		double alpha =0.0;
		for(int k=0;k<n-1;k++){//(k=0,1,2,...,n-2)
			for(int i=k+1;i<n;i++){//(i=0,1,2,...,n-1)
				alpha =A[i][k]/A[k][k];
//				for(int j=k;j<n;j++){//(j=0,1,2,...,n-1)下三角是0
				for(int j=k+1;j<n;j++){//(j=1,1,2,...,n-1)
					A[i][j]=A[i][j]-alpha*A[k][j];
				}
				b[i]=b[i]-alpha*b[k];
			}
		}
		Calc.printMat(A);
		System.out.println();
		Calc.printVec(b);
		
		/******************後退代入過程（近似解は配列 b に上書き）*************************/
		for(int k=n-1;k>=0;k--){
			for(int j=k+1;j<n;j++){
				b[k]=b[k]-A[k][j]*b[j];
			}
			b[k]=b[k]/A[k][k];
		}
//		Calc.printMat(A);
		System.out.println();
		Calc.printVec(b);
		
	}

}
