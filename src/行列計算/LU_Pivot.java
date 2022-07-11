package 行列計算;

public class LU_Pivot {

	public static void main(String[] args) {
	
		// 以下では，連立一次方程式 Ax=b を部分Pivot選択付きLU分解を用いて解く
		// 部分Pivot選択付きLU分解は，適当な置換行列 P を用いて PA=LU と表されることに注意　→ 要確認！
		
		//　係数行列 A の設定
		double A[][] = {{1, 2, 1, 2, 1},
						{2, 3, 2, 3, 2},
						{1, 2, 3, 4, 5},
						{4, 3, 8, 1, 2},
						{8, 2, 4, 1, 9}};
				
		//　右辺項 b の設定
		double b[] = {1, 2, 3, 4, 5};
		
		//　係数行列 A の出力
		System.out.println("A=");
		Calc.printMat(A);

		// 右辺項 b の出力
		System.out.println("b=");
		Calc.printVec(b);
		
		// 行列サイズ n 
		int n = A.length;
		
		// 残差ノルムの計算に用いる配列
		double CA[][] = new double[n][n];	// 係数行列 A のコピー用
		double L[][] = new double[n][n];	// 係数行列 A のコピー用
		double U[][] = new double[n][n];	// 係数行列 A のコピー用
		double Cb[] = new double[n];		// 右辺項 b のコピー用
		double r[] = new double[n];			// 残差 r:=b-Ax の保存用
				
		// 係数行列 A のコピー
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				CA[i][j] = A[i][j];
			}
		}
		
		// 右辺項 b のコピー
		for(int i=0; i<n; i++){
			Cb[i] = b[i];
		}
		
		// 部分Pivot選択に用いる変数
		double pivot = 0.0;	// Pivot の値
		int ell = 0;		// Pivot　の行番号
		
		System.out.println("拡大係数行列 (A|b) に部分Pivot選択付きLU分解を適用\n");

		//　部分Pivot選択付きLU分解
		for(int k=0; k<n-1; k++){
			
			pivot = Math.abs(A[k][k]);
			ell = k;
			
			//　部分Pivot選択
			for(int i=k+1; i<n; i++){
				if(pivot < Math.abs(A[i][k])){
					pivot = Math.abs(A[i][k]);
					ell = i;
				}
			}
			
			// 係数行列の行の入れ替え
			for(int j=0; j<n; j++){ // A の狭義下三角部分も入れ替えることに注意　→ なぜか？
				pivot = A[k][j];
				A[k][j] = A[ell][j];
				A[ell][j] = pivot;
			}
			
			// 右辺項の入れ替え
			pivot = b[k];
			b[k] = b[ell];
			b[ell] = pivot;
			
			//　前進消去過程 （A の狭義下三角部分には L の要素を格納）
			for(int i=k+1; i<n; i++){
				A[i][k] = A[i][k]/A[k][k];
				for(int j=k+1; j<n; j++){
					A[i][j] = A[i][j] - A[i][k]*A[k][j];
				}
			}
			
		}
		
		//　行列 A の出力 （狭義下三角部分に L の要素，上三角部分に U の要素が格納されている）
		System.out.println("適用後の A= ");
		Calc.printMat(A);

//		for(int i=0; i<n; i++){
//			for(int j=0; j<n; j++){
//				L[i][j] = A[i][j];
//				U[i][j] = A[i][j];
//				if(i>j){
//					U[i][j]=0.0;
//				}
//				if(i==j){
//					L[i][j]=1.0;
//				}
//				if(i<j){
//					L[i][j]=0.0;
//				}
//			}
//		}
//		System.out.println("L=");
//		Calc.printMat(L);
//		System.out.println("U=");
//		Calc.printMat(U);
//		System.out.println();
//		double[][]P=Calc.multipleMat(L,U);
//		System.out.println("P=");
//		Calc.printMat(P);
		
		// 右辺項 b の出力 （部分Pivot選択により入れ替えが行われている）
		System.out.println("適用後の Pb=");
		Calc.printVec(b);
		
		System.out.println("方程式 LUx=Pb に前進代入過程と後退代入過程を適用\n");
		
		// 以下，近似解は右辺項 b と同一メモリに格納する
		
		//前進代入過程 （Ly=Pb を解く）
		for(int k=0; k<n; k++){
			for(int j=0; j<k; j++){
				b[k] = b[k] - A[k][j]*b[j];
			}
		}	
		
		//後退代入過程 （Ux=y を解く）
		for(int k=n-1; k>=0; k--){
			for(int j=k+1; j<n; j++){
				b[k] = b[k] - A[k][j]*b[j];
			}
			b[k] = b[k]/A[k][k];
		}
		
		// 近似解 x の出力
		System.out.println("得られた近似解 x=");
		Calc.printVec(b);
		
		// 近似解 x に対する残差2ノルム ||b-Ax||_2 を計算して出力
		r = Calc.residual(CA, b, Cb);
		System.out.println("残差2ノルム ||b-Ax||_2=\n" + Calc.vecNorm2(r));
		
	}


}
