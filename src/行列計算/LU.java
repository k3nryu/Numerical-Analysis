package 行列計算;

public class LU {
	public static double[] PivotGauss(double A[][], double b[]){
		int n = A.length, ell = 0; //ellはPivot選択における絶対値最大成分の行番号
		double alpha = 0.0, pivot = 0.0;   
		for(int k=0; k<n-1; k++){ //前進消去過程
			ell = k;
			pivot = Math.abs(A[k][k]);
			for(int i=k+1; i<n; i++){ //Pivot選択
				if(pivot < Math.abs(A[i][k])){
					pivot = Math.abs(A[i][k]);
					ell =i ;
				}
			}
			for(int j=k; j<n; j++){ //行の入れ替え 
				pivot= A[k][j];
				A[k][j] =A[ell][j];
				A[ell][j] = pivot;
			}
			pivot = b[k];
			b[k] = b[ell];
			b[ell]= pivot;

			for(int i=k+1; i<n; i++){ //第k列目の消去
				alpha = A[i][k]/A[k][k];
				for(int j=k+1; j<n; j++){
					A[i][j] = A[i][j] - alpha*A[k][j];
				}
				b[i] = b[i] - alpha*b[k];
			}
		}
		//後退代入過程・ (割愛)
		return b; 
	}
}


