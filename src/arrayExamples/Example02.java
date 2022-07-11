package arrayExamples;

class Example02 {

	public static void main(String[] args) {
		int[]x={1,2,3,4,5};
		int[]y=new int[x.length];
		
		//配列のコピー
		for(int i=0;i<x.length;i++){//x.lengthはy.lengthでもＯＫ
			y[i]=x[i];
		}

		
		//出力
		for(int i=0;i<y.length;i++){
			System.out.printf("%3d",y[i]);
		}
		System.out.println();//改行
		
		y[0]=0;
		int[]z=new int[y.length];
		System.arraycopy(y,2,z,0,y.length-2);
		
		//出力
		System.out.println("z=");
		for(int i=0;i<z.length;i++){
			System.out.printf("%3d",z[i]);
		}
		System.out.println();//改行
		
		System.arraycopy(x,2,x,0,x.length-2);
		
		//出力
		System.out.println("x=");
		for(int i=0;i<x.length;i++){
			System.out.printf("%3d",x[i]);
		}
		System.out.println();//改行
		
		//要素を１つずつコピー
		for(int i =1;i<y.length;i++){
			y[i-1]=y[i];
		}
		//System.arraycopy(y,1,y,0,y.length-1);でもよい
		
		//出力
		System.out.print("y=");
		for(int i=0;i<y.length;i++){
			System.out.printf("%3d",y[i]);
		}
		System.out.println();//改行
		
		//要素を１つずつ右にコピー
		for(int i =y.length-1;i>0;i--){
			y[i]=y[i-1];
		}
		//System.arraycopy(y,0,y,1.,y.length-1);でもよい
		
		//出力
		System.out.print("y=");
		for(int i=0; i<y.length; i++) {
			System.out.printf( "%3d", y[i] );
		}
		System.out.println(); // 改行

		
	}

}
