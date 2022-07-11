package 行列計算;

public class Solve1 {
	public static void Guass (double A[][],double b[]){
		/***************前進消去過程*************************/	
		int n=A.length;
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
		Calc.printMat(A);
		System.out.println();
		Calc.printVec(b);
	}
	
	public static void Pivot_Guass (double A[][],double b[]){
		/***************Pivot洗濯付きの前進消去過程*************************/	
		int n=A.length;
		double alpha =0.0;
		int ell=0;
		double pivot=0.0;
		for(int k=0;k<n-1;k++){//(k=0,1,2,...,n-2)
			pivot=0.0;;
			for(int i=k;i<A.length;i++){
				if(Math.abs(A[i][k])>pivot){
					pivot=Math.abs(A[i][k]);
					ell=i;
				}
			}
			if(ell!=k){
				for(int i=0;i<A[0].length;i++){
					pivot=A[k][i];
					A[k][i]=A[ell][i];
					A[ell][i]=pivot;
				}
				pivot=b[k];
				b[k]=b[ell];
				b[ell]=pivot;
			}
			for(int i=k+1;i<n;i++){
				alpha =A[i][k]/A[k][k];
				for(int j=k+1;j<n;j++){
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
		Calc.printMat(A);
		System.out.println();
		Calc.printVec(b);
	}

}
