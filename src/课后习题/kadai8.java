package 课后习题;

import 行列計算.Calc;

public class kadai8 {

	public static void main(String[] args) {
		int n=500;
		int iter =100;
		double A[][]=new double[n][n];
		double b[]=new double[n];
		
		double A1[][]=new double[n][n];
		double b1[]=new double[n];
		
		for(int k=0;k<iter;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					A[i][j]=Math.random();
				}
				b[i]=Math.random();
			}
//			x1=Solve.Gauss(A,b);
//			x2=Solve.Pivot_Gauss(A,b);
		}
		A1=A;
		b1=b;

		double alpha =0.0;
		


		/***************Pivot洗濯付きの前進消去過程*************************/	
		int ell=0;
		double pivot=0.0;
		for(int k=0;k<n-1;k++){
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
		/******************後退代入過程（近似解は配列 b に上書き）*************************/
		for(int k=n-1;k>=0;k--){
			for(int j=k+1;j<n;j++){
				b[k]=b[k]-A[k][j]*b[j];
			}
			b[k]=b[k]/A[k][k];
		}
		b=Calc.matVec(A1, b);
		for(int i=0;i<b.length;i++){
			b[i]=b1[i]-b[i];
		}
		System.out.println(Calc.vecNorm2(b));

	}

}


