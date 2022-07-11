package matrix;

class VectorExample {

	public static void main(String[] args) {
		
		int[]x={1,2,3,4,5};
		int[]y={-1,2,-3,0,-3};
		
		//ベクトルの和
		int[]z=new int[x.length];
		
		for(int i =0;i<z.length;i++){
			z[i]=x[i]+y[i];
		}
		
		//結果の出力
		System.out.println("x+y=(");
		for(int i =0;i<z.length;i++){
			System.out.print(z[i]+" ");
		}
		System.out.println(")");
		
		//ベクトルの内積
		int w =0;
		
		for(int i =0;i<x.length;i++){
			w+=x[i]*y[i];     //w=w+x[i]*y[i]でもよい
		}
		//結果の出力
		System.out.println("x,yの内積="+w);
		
		//ベクトルの長さ
		double v=0;
		
		for(int i=0;i<x.length;i++){
			v+=x[i]*x[i];
		}
		double u=Math.sqrt(v);
		
		//結果の出力
		System.out.println("xの長さ="+u);
	}

}
