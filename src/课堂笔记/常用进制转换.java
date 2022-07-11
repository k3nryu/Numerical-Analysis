package 课堂笔记;
/**
 * 功能:2，4，6，8，10，16进制的实数的转换
 * 例：
 *    (123)_8=(83)_10
 *    (175)_8=(7D)_16
 *    (3E6.5)_16=(1111100110.0101)_2
 * @author Chen Jianlong
 */
class 常用进制转换 {
	public static void f(int a,int b,double x){
		double y = 0.0;
		if(a>b){
			int u = (int)x;
			double v =x-u;
			int[]n=new int[100];
			int[]m=new int[100];
			System.out.println(u+v+"の"+b+"進数を変換した結果は：");
			int i =0;
			while(u !=0){
				n[i]=u%b;
				u=u/b;
				i++;
			}
			i--;
			System.out.print("("+x+")_"+a+"=(");
			while(i>=0){
				System.out.print(n[i]);//输出整除部分
				i--;
			}
			System.out.print(".");//输出整数与小数之间的点
			for(int j=1;y>0;j++){
				m[j]=(int)(b*v);
				v=b*v-m[j];
				System.out.print(m[j]);
			}
			System.out.println(")_"+b);
		}else if(a<b){
			
		}else{
			System.out.println("("+x+")_"+a+"=("+x+")_"+b);
		}
		return;
	}
	public static void main(String[] args) {
		f(10,2,1.6);

	}

}
