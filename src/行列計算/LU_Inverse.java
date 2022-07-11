package 行列計算;
/** 
 * @author chen jianlong
 *利用LU分解求逆行列
 */
public class LU_Inverse {
//	public static void main(String[] args) {
	public static double[][] A(double A[][]){

//		 行列サイズ n 
//		double A[][]={{1,2,3},
//				{2,5,7},
//				{3,5,3}};

		int n = A.length;
		
		double L[][] = new double[n][n];
		double U[][] = new double[n][n];
		double CA[][] = new double[n][n];
		double X[][] = new double[n][n];
		double Y[][] = new double[n][n];
		
		double [][]E=new double [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					E[i][j]=1.0;
				}else{
					E[i][j]=0.0;
				}
			}
		}

		//　係数行列 A の出力
//		System.out.println("A=");
//		Calc.printMat(A);

		// 右辺項 X の出力
//		System.out.println("X=");
//		Calc.printMat(E);


		// 係数行列 A のコピー
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				L[i][j] = E[i][j];
				CA[i][j] = A[i][j];
				U[i][j] = A[i][j];
			}
		}

		/***************前進消去過程*************************/		
		double alpha =0.0;
		for(int k=0;k<n-1;k++){//(k=0,1,2,...,n-2)
			for(int i=k+1;i<n;i++){//(i=0,1,2,...,n-1)
				alpha =A[i][k]/A[k][k];
				for(int j=k+1;j<n;j++){//(j=1,1,2,...,n-1)
					A[i][j]=A[i][j]-alpha*A[k][j];
					U[i][j]=A[i][j];
//					CA[i][j]=A[i][j];
//					CA[k][j]=U[k][j];
//					CA[j][k]=A[j][k]/A[0][0];
					L[j][k]=A[j][k]/A[k][k];
					U[j][k]=0;
				}
			}
		}
//		System.out.println("L=");
//		Calc.printMat(L);
//		System.out.println("U=");
//		Calc.printMat(U);
//		System.out.println();
//		System.out.println("CA=");
//		Calc.printMat(CA);
//		System.out.println();
		
		for(int i=0;i<n;i++){
			for(int k=0;k<n;k++){
				Y[k][i]=E[k][i];
				for(int j=0;j<k;j++){
					Y[k][i]=Y[k][i]-L[k][j]*Y[j][i];
				}
			}
			for(int k=n-1;k>=0;k--){
				X[k][i]=Y[k][i];
				for(int j=k+1;j<n;j++){					
					X[k][i]=X[k][i]-U[k][j]*X[j][i];
				}
				X[k][i]=X[k][i]/U[k][k];
			}
		}
//		System.out.println("E=");
//		Calc.printMat(E);
//		System.out.println("Y=");
//		Calc.printMat(Y);
//		System.out.println();
//		System.out.println("X=");
//		Calc.printMat(X);
//		System.out.println();
//		double[][]b=Calc.multipleMat(L,Y);
//		System.out.println("b=");
//		Calc.printMat(b);
//		System.out.println();
//		double[][]Q=Calc.multipleMat(CA,X);
//		System.out.println("Q=");
//		Calc.printMat(Q);
//		System.out.println();
		return X;

		
	}

}
