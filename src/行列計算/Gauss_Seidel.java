package 行列計算;

public class Gauss_Seidel {
	public static void main(String[] args) {
//		double A[][] = {{6, 1, 1, 1, 0},
//						{1, 7, 1, 1, 1},
//						{0, 1, 8, 1, 1},
//						{0, 0, 1, 9, 1},
//						{0, 0, 0, 1, 10}};
//		double b[] = {9, 11, 11, 11, 11};
		int n=50;
		double[][]A=new double[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>j){
					A[i][j]=-1.0;
				}
				if(i==j){
					A[i][j]=n;
				}
				if(i<j){
					A[i][j]=1.0;
				}
			}
		}
		double[]b=new double[n];
		for(int i=0;i<n;i++){
			b[i]=1.0;
		}

		
//		int n=A.length, iter=0, Nmax=100; //行列サイズ，反復回数，最大反復回数
		int iter=0, Nmax=1000; //行列サイズ，反復回数，最大反復回数
	    double e=1.0e-10, sum=0.0; //許容誤差，補助変数
	    double[]x_old=new double[n];//更新前の近似解 (初期値は0)
		double[]x=new double[n];//更新後の近似解
		double[]error=new double[n];
		
		while(true){
			for(int i=0;i<n;i++){
				sum=0.0;
				for(int j=0;j<n;j++){
					if(i!=j){
						sum+=A[i][j]*x[j];
					}
				}
				x[i]=(b[i]-sum)/A[i][i];
			}
			iter++;
//			/***************************誤差ノルム判定*********************************/
//			for(int i=0;i<n;i++){
//				error[i]=x[i]-x_old[i];
//			}
//			if(Calc.vecNormInf(error)<e){
//				break;
//			}
//			/***************************相対誤差ノルム判定*********************************/
//			for(int i=0;i<n;i++){
//				error[i]=x[i]-x_old[i];
//			}
//			if(Calc.vecNormInf(error)<e*Calc.vecNormInf(x)){
//				System.out.println("相対誤差ノルム判定");
//				break;
//			}
//			/***************************残差ノルム判定*********************************/
			double[]j=Calc.matVec(A,x);
			double[]k=(Calc.subVec(b,j));
//			if(Calc.vecNorm1(k)<e){
//				System.out.println("残差ノルム判定="+Calc.vecNormInf(k));
//				break;
//			}
			/***************************相対残差ノルム判定*********************************/
			if(Calc.vecNorm2(k)<e*Calc.vecNorm2(b)){
				System.out.println("相対残差ノルム判定");
				break;
			}
			/***************************最大回数判定*********************************/
			if(iter == Nmax){
				System.out.println("No Convergence!");
				break;
			}
			/*********************************************************************/
			for(int i=0; i<n; i++){ //近似解の保存（入れ替え）
				x_old[i] = x[i];
			}
			/*********************************************************************/
		}
		System.out.println("反復回数="+iter);
		System.out.println("近似解x=");
		Calc.printVec(x);

	}

}
