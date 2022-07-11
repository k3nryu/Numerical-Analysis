package 行列計算;
/**
 * 功能：ベクトルと行列に関する計算
 * 例：行列同士の掛け算
 * @author Chen Jianlong
 */
public class Calc {
/***************行列・ベクトルのコンソール出力*******************/
//	ベクトル(1 次元配列)をコンソール出力する(void 型)
	public static void printVec (double x[]){
//		System.out.print("{"+"\t");				
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
//		System.out.print("}");				
		System.out.println();				
		return;
	}
//	行列(2 次元配列)をコンソール出力する(void 型)
	public static void printMat (double A[][]){
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				System.out.print(A[i][j]+"\t");				
			}
			System.out.println();				
		}
		return;
	}
/************************ベクトルに関する演算*******************/	
//	ベクトル x をスカラー c 倍する(戻り値:double[])
	public static double[] scalarMultiple(double a, double x[]){
		double[] c=new double[x.length];
		for(int i=0;i<x.length;i++){
			c[i]+=a*x[i];
		}
		return c;
	}
//	ベクトル同士の加算(x+y)を計算する(戻り値:double[])
	public static double[] addVec(double x[], double y[]){
		double[] c=new double[x.length];
		for(int i=0;i<x.length;i++){
			c[i]=x[i]+y[i];
		}
		return c;

	}
//	ベクトル同士の減算(x-y)を計算する(戻り値:double[])
	public static double[] subVec(double x[], double y[]){
		double[] c=new double[x.length];
		for(int i=0;i<x.length;i++){
			c[i]=x[i]-y[i];
		}
		return c;
		
	}
//	ベクトル同士の内積(x⊤y)を計算する(戻り値:double)
	public static double innProd(double x[], double y[]){
		double c=0.0;
		for(int i=0;i<x.length;i++){
			c+=x[i]*y[i];
		}
		return c;
	}
/************************行列・ベクトルに関する演算*******************/	
//	行列 A とベクトル x の積を計算する(戻り値:double[])
	public static double[] matVec(double A[][], double x[]){
		double[] c=new double[A.length];
		for(int i=0;i<A.length;i++){
			c[i]=0.0;
			for(int j=0;j<A[i].length;j++){
				c[i]+=A[i][j]*x[j];
			}
		}
		return c;
	}
//	行列 A とベクトル x, b に対して,Ax-b(残差という)を計算する(戻り値:double[])
	public static double[] residual(double A[][], double x[], double b[]){
		double[] c=new double[A.length];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				c[i]+=A[i][j]*x[j];
			}
			c[i]-=b[i];
		}
		return c;
	}
/************************行列同士の演算****************************/	
//	行列同士の加算(A+B)を計算する(戻り値:double[][])
	public static double[][] addMat(double A[][], double B[][]){
		double[][] c=new double[A.length][A[0].length];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B[0].length;j++){
				c[i][j]=A[i][j]+B[i][j];
			}
		}
		return c;
	}
//	行列同士の積(AB)を計算する(戻り値:double[][])
	public static double[][] multipleMat(double A[][], double B[][]){
		double[][] c=new double[A.length][B[0].length];
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[0].length;j++){
				c[i][j]=0.0;
				for(int k=0;k<A[0].length;k++){					
					c[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		return c;
	}
/************************ベクトルノルム****************************/	
//	ベクトルの 1 ノルム (∥x∥1 ) を計算する(戻り値:double)
	public static double vecNorm1(double x[]){
		double c = 0.0;
		for(int i=0;i<x.length;i++){
			c+=Math.abs(x[i]);
		}
		return c;
	}
//	ベクトルの 2 ノルム (∥x∥2 ) を計算する(戻り値:double)
	public static double vecNorm2(double x[]){
		double c = 0.0;
		for(int i=0;i<x.length;i++){
			c+=Math.pow(Math.abs(x[i]),2.0);
		}
		return Math.sqrt(c);
	}
//vecNormInf(double x[])・ベクトルの ∞ ノルム (∥x∥∞ ) を計算する(絶対値最大)
	static double vecNormInf(double x[]){
		double c=0.0;
		for(int i=0;i<x.length;i++){
			double g=c;
			c=Math.abs(x[i]);
			if(c<=g){
				c=g;
			}
		}
		return c;
	}
/***************行列ノルム*************************************/	
//matNorm1(double A[][])・行列の 1 ノルム (∥A∥1) を計算する(絶対値最大列和)
	static double matNorm1(double A[][]){
		double[] y=new double[A[0].length];
		for(int j=0;j<A[0].length;j++){
			for(int i=0;i<A.length;i++){
				y[j]+=Math.abs(A[i][j]);
			}
		}
		double c=y[0];
		for(int k=0;k<y.length;k++){
			if(c<y[k]){
				c=y[k];
			}
		}
		return c;
	}	
//matNormInf(double A[][])・行列の ∞ ノルム (∥A∥∞) を計算する(絶対値最大行和)
	static double matNormInf(double A[][]){
		double[] y=new double[A.length];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[0].length;j++){
				y[i]+=Math.abs(A[i][j]);
			}
		}
		double c=y[0];
		for(int k=0;k<y.length;k++){
			if(c<y[k]){
				c=y[k];
			}
		}
		return c;
	}
/*****************************以上*****************************/	
}