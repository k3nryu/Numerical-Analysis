package 课堂笔记;
/**
 * 功能：求多项式P(x)=an*x^n+a(n-1)*x^(n-1)+...+a1*x+a0的值
 * 例：f(X)=5X^4+4X^3+3X^2+2X+1;
 * @author Chen Jianlong
 */
public class ホーナー法HOHNER {
	public static double hohner(double a[],double x){
		double val=a[0];
		for(int i=1;i<a.length;i++){
			val=val*x+a[i];
		}
		return val;
	}

	public static void main(String[] args) {
		int n=51;
		double[] a=new double [n];
		for(int i=0;i<a.length;i++){//定义an行列为递减行列
			a[i]=n-i;
			//			System.out.println(a[i]);
			//			System.out.print(a[i]+"*X^"+(n-i-1)+"+");
		}
		System.out.println();
		double x=0.9;//输入x的值
		System.out.println("f("+x+")="+hohner(a,x));
		System.out.println();
	}

}
