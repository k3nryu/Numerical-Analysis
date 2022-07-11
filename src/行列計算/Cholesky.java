package 行列計算;

public class Cholesky {
	public static void main(String[] args) {

		// 以下では，行列 A のコレスキー分解 A=LL^T を求める

		//　係数行列 A の設定
		double A[][] = {{1, -1, 2, 1, -2},
				{-1, 5, -4, 3, 4},
				{2, -4, 14, -3, 1},
				{1, 3, -3, 10, -4},
				{-2, 4, 1, -4, 11}};

		//　右辺項 b の設定
		double b[] = {1, 1, 1, 1, 1};

		//　係数行列 A の出力
		System.out.println("A=");
		Calc.printMat(A);

		// 右辺項 b の出力
		System.out.println("b=");
		Calc.printVec(b);

		// 行列サイズ n 
		int n = A.length;

		// コレスキー分解後の行列 L を格納する二次元配列
		double L[][] = new double[n][n];

		// コレスキー分解の実行
		double sum = 0.0;
		for(int j=0; j<n; j++){
			for(int i=j; i<n; i++){
				sum = 0.0;
				for(int k=0; k<j; k++){
					sum = sum + L[i][k]*L[j][k];
				}
				if(i==j){
					L[i][i] = Math.sqrt(A[i][i]-sum); 
				}else{
					L[i][j] = (A[i][j] - sum)/L[j][j];
				}
			}
		}

		// コレスキー分解後の行列 L の出力
		System.out.println("コレスキー分解後の L=");
		Calc.printMat(L);

		// 次に，連立一次方程式 Ax=b をコレスキー法によって解く
		// ただし，近似解は右辺項 b と同一メモリに格納する

		// 前進代入過程 （Ly=b を解く）
		for(int k=0; k<n; k++){
			for(int j=0; j<k; j++){
				b[k] = b[k] - L[k][j]*b[j];
			}
			b[k] = b[k]/L[k][k];
		}	

		// 後退代入過程 （L^Tx=y を解く）
		for(int k=n-1; k>=0; k--){
			for(int j=k+1; j<n; j++){
				b[k] = b[k] - L[j][k]*b[j];
			}
			b[k] = b[k]/L[k][k];
		}

		// 近似解 x の出力
		System.out.println("得られた近似解 x=");
		Calc.printVec(b);

		// 各自，残差ノルムなどを計算して近似解の精度を確認してみよう

	}

}
