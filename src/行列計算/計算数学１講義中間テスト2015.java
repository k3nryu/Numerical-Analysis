package 行列計算;

public class 計算数学１講義中間テスト2015 {
	public static void main(String[] args) {

		double a = 0.5;
		double A[][] = {{2, 1, 2, 0},
				{2, 3, 2, 1},
				{-2, 1, -1, 0},
				{0,1,1,a}};

		//　右辺項 b の設定
		double b[] = {0, 1, 1, 0};
		int n = A.length;

		double L[][] = new double[n][n];
		double U[][] = new double[n][n];
		double CA[][] = new double[n][n];
		double X[]= new double[n];
		double Y[]= new double[n];

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
		System.out.println("A=");
		Calc.printMat(A);

		/***************LU分解*************************/		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				L[i][j] = E[i][j];
				CA[i][j] = A[i][j];
				U[i][j] = A[i][j];
			}
		}
		double alpha =0.0;
		for(int k=0;k<n-1;k++){
			for(int i=k+1;i<n;i++){
				alpha =A[i][k]/A[k][k];
				for(int j=k+1;j<n;j++){
					A[i][j]=A[i][j]-alpha*A[k][j];
					U[i][j]=A[i][j];
					L[j][k]=A[j][k]/A[k][k];
					U[j][k]=0;
				}
			}
		}
		System.out.println("L=");
		Calc.printMat(L);
		System.out.println("U=");
		Calc.printMat(U);
		System.out.println();
		/********************************************/		
		/***************计算X*************************/		
		for(int i=0;i<n;i++){
			Y[i]=b[i];
			for(int k=0;k<i;k++){
				Y[i]=Y[i]-L[i][k]*Y[k];
			}
		}
		for(int i=n-1;i>=0;i--){
			X[i]=Y[i];
			for(int k=i+1;k<n;k++){
				X[i]=X[i]-U[i][k]*X[k];
			}
			X[i]=X[i]/U[i][i];
		}

		double[][]Q=Calc.multipleMat(CA,U);
		System.out.println("Q=");
		Calc.printMat(Q);
		System.out.println();
		System.out.println("Y=");
		Calc.printVec(Y);
		System.out.println();
		System.out.println("X=");
		Calc.printVec(X);
		System.out.println();
		double[]I=Calc.matVec(CA,X);
		System.out.println("I=");
		Calc.printVec(I);
		System.out.println();

	}
}
