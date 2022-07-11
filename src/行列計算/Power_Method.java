package 行列計算;

public class Power_Method {

	public static void main(String[] args) {
		double A[][] = {{2, -2, 3},
				{1, 1,  1},
				{1, 3, -1}};
		double x[] = {1, 1, 1};

		int n=A.length, iter=0, Nmax=5; //行列サイズ，反復回数，最大反復回数
		double[]x_old=x;//更新前の近似解 (初期値は0)
		double x_norm=0;


		while(true){
			x=Calc.matVec(A, x_old);
			x_norm=Calc.vecNormInf(x);
			System.out.println("近似固有値="+x[1]/x_old[1]);
			for(int i=0; i<n; i++){ //近似解の保存（入れ替え）
				x[i]=x[i]/x_norm;
				x_old[i] = x[i];
			}
			if(iter == Nmax){
				break;
			}
			iter++;
		}
		System.out.println("反復回数="+iter);
	}

}
