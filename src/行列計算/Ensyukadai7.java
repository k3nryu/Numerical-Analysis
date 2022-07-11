package 行列計算;

class Ensyukadai7 {

	public static void main(String[] args) {
		double[]x = new double[100];
		for(int i=0;i<x.length;i++){
			x[i]=Math.sqrt(i+1);
		}
		System.out.println(Calc.vecNorm1(x));
		System.out.println(Calc.vecNorm2(x));
		System.out.println(Calc.vecNormInf(x));
		double [][]y =new double[100][100];
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
//				y[i][j]=Math.sqrt(2*i+j);この行を以下に変更させた
				y[i][j]=Math.sqrt(2*(i+1)+(j+1));
			}
		}
		System.out.println(Calc.matNorm1(y));
		System.out.println(Calc.matNormInf(y));

	}

}
