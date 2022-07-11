package 行列計算;

class Solve {
	static double[] ge(double[][] A1,double[] b1){

//		Calc m=new Calc();
		//誤差(ノルム)出力のために同じ値を保存しておいたりするシーン(erがbでA1がA)
		double[] b=new double[b1.length];
		double[][] A=new double[A1.length][A1[0].length];
		for(int i=0;i<b.length;i++){
			b[i]=b1[i];
		}
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				A[i][j]=A1[i][j];
			}
		}
		//前進代入過程の所
		double alpha=0;
		for(int k=0;k<A[0].length-1;k++){
			for(int i=k+1;i<A.length;i++){
				alpha=A[i][k]/A[k][k];
				for(int j=k+1;j<A[k+1].length;j++){
					A[i][j]-=alpha*A[k][j];
				}
				b[i]-=alpha*b[k];
			}
		}
		//後退代入過程の所(メモリ節約のために解のxはbで代用す)
		for(int k=b.length-1;k>=0;k--){
			for(int j=k+1;j<b.length;j++){
				b[k]-=A[k][j]*b[j];
			}
			b[k]=b[k]/A[k][k];
		}
//		//Axを求めて
//		b=Calc.matVec(A1, b);
//		//Ax-bを計算する
//		for(int i=0;i<b.length;i++) {
//			b[i]=b[i]-b1[i];
//		}
		return b;
	}

	static double[] gep(double[][] A1,double[] b1){
//		Calc m=new Calc();
		//誤差(ノルム)出力のために同じ値を保存しておいたりするシーン(erがbでA1がA)
		double[] b=new double[b1.length];
		double[][] A=new double[A1.length][A1[0].length];
		for(int i=0;i<b1.length;i++) b[i]=b1[i];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				A[i][j]=A1[i][j];
			}
		}
		//前進代入過程の所
		double alpha=0;
		double max=0;
		int maxN=0;
		for(int k=0;k<A[0].length-1;k++){
			max=0;
			for(int i=k;i<A.length;i++){
				if(max<Math.abs(A[i][k])) {
					max=Math.abs(A[i][k]);
					maxN=i;
				}
			}
			if(max<1/10000) {
				System.out.println("This matrix is too difficult to solve");
			}
			if(maxN!=k){
				for(int i=0;i<A[0].length;i++){
					max=A[k][i];
					A[k][i]=A[maxN][i];
					A[maxN][i]=max;
				}
				max=b[k];
				b[k]=b[maxN];
				b[maxN]=max;
			}
			for(int i=k+1;i<A.length;i++){
				alpha=A[i][k]/A[k][k];
				for(int j=k+1;j<A[k+1].length;j++){
					A[i][j]-=alpha*A[k][j];
				}
				b[i]-=alpha*b[k];
			}
		}
		//後退代入過程の所(メモリ節約のために解のxはbで代用す)
		for(int k=b.length-1;k>=0;k--){
			for(int j=k+1;j<b.length;j++){
				b[k]-=A[k][j]*b[j];
			}
			b[k]=b[k]/A[k][k];
		}
//		//Axを求めて
//		b=Calc.matVec(A1, b);
//		//Ax-bを計算する
//		for(int i=0;i<b.length;i++) {
//			b[i]=b[i]-b1[i];
//		}
		return b;
	}


}
