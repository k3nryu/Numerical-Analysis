package 课堂笔记;

class 十进制换n进制 {

	public static void main(String[] args) {
		int n=2;//変換後の基数
		
		double z = 0.1;//変換したい実数(10進数)
		int x = (int)z;//ｚの整数部分
		double y =z-x;//またはｚ％ｘ；ｚの小数部分
		System.out.println(x+y+"の"+n+"進数を変換した結果は：");
		
		int[]a=new int[100];
		int[]b=new int[100];
		
//		for(int i=0;x>0;i++){
//			a[i]=x%n;
//			x=x/n;			
//			System.out.print(a[i]);
//		}
		int i =0;
		while(x !=0){
			a[i]=x%n;
			x=x/n;
			i++;
		}
		i--;
		while(i>=0){
			System.out.print(a[i]);//输出整除部分
			i--;
		}
		System.out.print(".");//输出整数与小数之间的点
		for(int j=1;y>0;j++){
			b[j]=(int)(n*y);
			y=n*y-b[j];
			System.out.print(b[j]);
		}
		

	}

}
