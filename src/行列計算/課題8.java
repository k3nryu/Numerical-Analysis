package 行列計算;

public class 課題8 extends Solve{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calc m=new Calc();
		int h=500;
		for(int MX=0;MX<100;MX++){
			double[][] A=new double[h][h];
			double[] b=new double[h];
			for(int i=0;i<A.length;i++){
				b[i]=Math.random();
				for(int j=0;j<A[i].length;j++){
					A[i][j]=Math.random();
				}
			}
//			System.out.println(Solve.ge(A,b));
			System.out.println(Solve.gep(A,b));
//			System.out.println("{"+Solve.ge(A,b)+","
//					+Solve.gep(A,b)+"},");
			
		}
	}

}