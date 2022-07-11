package 课后习题;

class 第1节课 {

	public static void main(String[] args) {
//		问题1
//		double x =Math.sqrt(Math.pow(4, 7)/Math.pow(7, 9));
//		double y =Math.abs(Math.cos(3.0/4*Math.PI)-Math.pow(Math.E, 6.0)*Math.sqrt(Math.log(5.0)));
//		System.out.println("x="+x+"y="+y);

//		问题2 Fibonacci数列
//		long []f=new long [9999999];
//		f[0]=0;
//		f[1]=1;
//		int n=50;
//		for(int i=2;i<=n;i++){
//			f[i]=f[(i-1)]+f[(i-2)];
////			System.out.println("f("+i+")"+f[i]);
//		}
//		System.out.println("f("+n+")="+f[n]);
		
		//问题3
//		double a;
//		int n =0;
//		double s=0.0;
//		do{
//			n++;
//			a =1.0/Math.pow(3,n);
//			s +=a;
//		}while(a>=Math.pow(10,-5));
//		System.out.println("n="+n+",s="+s);

		
		
//		问题4 Napier数e的求法1
//		double e =1;
//		int n=12;//输入n
//		for(int i=1;i<n;i++){
//			int j = i-1;
//			int k = i;
//			while(j>1){
//				k = k*j;
//				j--;
//			}
//			e = e + 1.0/k;
//		}
//		System.out.println("e="+e);

//		问题4 Napier数e的求法2
		double e=1.0;
		double temp=1.0;
		int n=12;//输入计算次数
		for(int i=1;i<n;i++){
			temp =temp/i;//1/i!の計算
			e = e + temp;
		}
		System.out.println("e="+e);
		System.out.printf("%.2e",Math.abs(Math.E-e));//绝对误差
//		
//		問題５
//		double[][]a=new double[3][3];
//		double[][]b=new double[3][3];
//		double[][]c=new double[3][3];
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				a[i][j]= (i+1)+(j+1);
//				b[i][j]=Math.sqrt((i+1)*(j+1));
//				c[i][j]=a[i][j]+b[i][j];
//				System.out.print(c[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		System.out.println(c[3][3]);
//		System.out.printf("%7d, %5.3f, %.15e", 12345, 12345.6789, 12345.6789);//7桁の整数,整数部5桁,小数部3桁の実数,小数点以下15桁の指数表示
//		System.out.println("絶対値を返しますMath.abs(-50)=" + Math.abs(-50));
//		System.out.println("円周率PI=" + Math.PI);
//		System.out.println("ネイピア数E=" + Math.E);
//		System.out.println("三角関数" + Math.cos(1)+Math.sin(1)+Math.tan(1));
//		System.out.println("第一引数を第二引数のべき乗した値を返します 2^3= " + Math.pow(2,3));
//	    System.out.println("引数を2つ受け取り値の高い方を返しますmax(15,30)=" + Math.max(15,30));
//	    System.out.println("引数を2つ受け取り値の低い方を返しますmin(15,30)=" + Math.min(15,30));
//	    System.out.println("引数を1つ受け取り、最も近いdouble整数値を返しますMath.rint(1.8)=" + Math.rint(1.8));
//	    System.out.println("引数を1つ受け取り、最も近いlong整数値を返しますMath.round(1.8)=" + Math.round(1.8));
//	    System.out.println("浮動小数値1つを引数に受け取り、引数値より小さく 最も近い整数値と等しいdouble型を返しますMath.floor(1.8)=" + Math.floor(1.8));
//	    System.out.println("浮動小数値1つを引数に受け取り、引数値より大きく 最も近い整数値と等しいdouble型を返しますMath.ceil(1.8)=" + Math.ceil(1.8));
//	    System.out.println("0.0以上1.0未満のランダムなdouble値を返しますMath.random()" + Math.random());
//	    System.out.println("引数値の平方根を返しますMath.sqrt(2)=" + Math.sqrt(2));
	    
//	    double x=1.0E-9;
//	    double x_=9.999E-10;
//	    System.out.printf("%.16e",Math.abs(x_-x));//绝对误差
//	    System.out.printf("%.16e",Math.abs(x_-x)/Math.abs(x));//相对误差
		
		
		
		
		
		
		
		
		
		
	}

}
//