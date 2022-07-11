package 课后习题;

public class 二进制换10进制 {

	public static void main(String[] args) {
		int[] a={1,0,1,0,1,0,1,1};//输入整数部分
		int[] b={0,1,0,1};//输入小数部分
		
		//想要变换的2进制数值输出表示
		System.out.print("输入的2进制数：(");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.print(".");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
		System.out.println(")_2");
		
		//整数部分的转换
		int x =0;
		for(int i=0;i<a.length;i++){
			x = x*2+a[i];
		}
		//小数部分的转换
		double y=0d;
		for(int i=b.length-1;i>=0;i--){
			y =y*(double)((double)1/2)+(double)(b[i]);
		}
		y=y/2;
		double z =x+y;
		//结果输出
		System.out.print("转换好的10进制数：("+z);
		System.out.print(")_10");
		

	}

}
