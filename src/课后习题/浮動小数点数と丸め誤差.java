package 课后习题;

public class 浮動小数点数と丸め誤差 {
/*IEEE754が定める倍精度浮動小数点数は，符号部 1bit，指数部 11 bit，仮数部 52bit で
表現される．与えられた実数が倍精度浮動小数点数で厳密に表せない場合，上記の bit 数で値を
近似するしかない．このときに生じる誤差を[丸め誤差]という．

値が非常に近い 2 つの浮動小数点数同士の減算を行うと，有効桁数が大幅に減ってしまうこと
がある．この現象を[桁落ち]という．

絶対値の大きさが著しく異なる 2 つの浮動小数点数を足すとき，絶対値の小さい方の値が計算
結果に反映されないことがある．この現象を[情報落ち]という．*/

	public static void main(String[] args) {
		double x=1.5;
		double X=1.0;
		double en=0.0;
		double en_old=-1.0;
		double n=0.0;
		double N=1.0;
		while(en!=en_old){
			System.out.println("n="+n);
			en_old=en;//把en的数值储存到en_old里面
			X=Math.pow(x, n);
			for(int i=1;i<n;i++){
				int j = i-1;
				int k = i;
				while(j>1){
					k = k*j;
					j--;
				}
				N = N + 1.0/k;
			}
			en+=(X/N);
			n++;
			System.out.println("X="+X);
			System.out.println("N="+N);
			System.out.println("en="+en);
			System.out.println();
		}
		System.out.println("n="+n+"の時等しい");
	}

}
