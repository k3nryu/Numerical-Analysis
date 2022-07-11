package 行列計算;

public class CG {
	public static void main(String[] args) {
//		int n=2000;
		for(int n=50;n<=3000;n+=50) {
		double[][]A=new double[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>j){
					A[i][j]=0.0;
				}
				if(i==j){
					A[i][j]=i+1.0;
				}
				if(i<j){
					A[i][j]=0.0;
				}
			}
		}

		double[]b=new double[n];
		for(int i=0;i<n;i++){
			b[i]=i+1.0;
		}
		int iter=0, Nmax=1000; //行列サイズ，反復回数，最大反復回数
	    double e=1.0e-10, sum=0.0; //許容誤差，補助変数
		double[]x=new double[n];//更新前の近似解 (初期値は0)
		double[]x_new=new double[n];//更新後の近似解
		double[]error=new double[n];
		double[]w=new double[n];
		double[]r=new double[n];
		double[]r_new=new double[n];
		double[]p=new double[n];
		double[]p_new=new double[n];
		double a = 0.0;
		double be= 0.0;
		
//		double A[][] = {{2,1},{1,3}};
//		double b[] = {4,7};
//		double x[] = {0,3};
		
//		Calc.printMat(A);
//		System.out.println();
//		Calc.printVec(b);
//		System.out.println();
		
		r=Calc.subVec(b, Calc.matVec(A, x));
		p=r;
//		System.out.printf("r=");
//		Calc.printVec(r);
//		for(int k=0;k<n;k++) {
		while(true){
			w=Calc.matVec(A, p);
			double c = 0.0;
			for(int i=0;i<n;i++){
				c+=p[i]*w[i];
			}
			a=Math.pow(Calc.vecNorm2(r),2.0)/c;

			x=Calc.addVec(x,Calc.scalarMultiple(a, p));
//			System.out.printf("x=");
//			Calc.printVec(x);
			r_new=Calc.subVec(r,Calc.scalarMultiple(a, w));	
			if(Calc.vecNorm1(r_new)<=e*Calc.vecNorm1(b)){
//				System.out.println("相対残差ノルム判定");
				break;
			}
			be=Math.pow(Calc.vecNorm2(r_new), 2.0)/Math.pow(Calc.vecNorm2(r), 2.0);
			p_new=Calc.addVec(r_new, Calc.scalarMultiple(be,p));
			r=r_new;
			p=p_new;
			iter++;
		}
//		Calc.printVec(x);
//		System.out.println("反復回数="+iter);
		System.out.println(iter);
		}
		
		
		
	}
}
