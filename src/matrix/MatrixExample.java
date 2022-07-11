package matrix;

class MatrixExample {

	public static void main(String[] args) {

		int[][] A={{1,2,3},{2,-1,0}};
		int[][] B={{1,1,1},{-1,-1,-1}};

		//行列の和
		int[][] C=new int[A.length][A[0].length];

		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				C[i][j]=A[i][j]+B[i][j];
			}
		}

		//結果の出力
		System.out.println("A+B=");
		for(int i=0;i<C.length;i++){
			for(int j=0;j<C[0].length;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}

		int[][]D={{1,1},{0,-2},{-2,1}};

		//行列の積
		int[][]E= new int[A.length][D[0].length];

		for(int i=0;i<E.length;i++){
			for(int j=0;j<E[i].length;j++){
				E[i][j]=0;
				for(int k=0;k<D.length;k++){
					E[i][j] += A[i][k]*D[k][j];
				}
			}
		}
		
		System.out.println("E=");
		for(int i=0;i<E.length;i++){
			for(int j=0;j<E[i].length;j++){
				System.out.print(E[i][j]+" ");
			}
			System.out.println();}

		int[][]F={{1,2,3},{-2,-4,5},{-3,-5,6}};

		//行列の転置
		for(int i=0;i<F.length-1;i++){
			for(int j=i+1;j<F[i].length;j++){
				int x=F[i][j];
				F[i][j]=F[j][i];
				F[j][i]=x;
			}
		}

		//結果の出力
		System.out.println("tF=");
		for(int i=0;i<F.length;i++){
			for(int j=0;j<F[i].length;j++){
				System.out.print(F[i][j]+" ");
			}
			System.out.println();}

	}}


