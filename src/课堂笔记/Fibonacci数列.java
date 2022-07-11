package 课堂笔记;

public class Fibonacci数列 {
	public static void main(String[] args) {
		long F0=0,F1=1,Fn;
        System.out.println("F0="+F0);
        System.out.println("F1="+F1);
        int n=70;//输入n
        for(int i=1;i<n;i++) {
            Fn=F0+F1;
            System.out.println("F"+(i+1)+"="+Fn);
            F0=F1;
            F1=Fn;
        }
	}
}
