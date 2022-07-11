package sec06;

class Example01 {

	public static void main(String[] args) {
		
		int[] x = new int[5];
		x[0]= 46;
		x[1]= 19;
		x[2]= -78;
		x[3]= 2;
		x[4]= -10;
		
		int[] y = {46,19,-78,2,-10};
		
		System.out.println("x[0]="+ x[0]);
		System.out.println("y[0]="+ y[0]);
		
		int[]a = {10,11};
		int[]b = {20,21,22};
		int[]c = {30,31,32,33};
		int[][]d= new int[3][];
		d[0]= a;
		d[1]= b;
		d[2]= c;
		
		System.out.println("d[1][2]="+d[1][2]);
		
		int[]e = d[2];
		System.out.println("e[2]="+e[2]);
		
		int[][]f = new int[2][3];
		f[0][0]= 10;
		f[0][1]= 11;
		f[0][2]= 12;
		f[1][0]= 20;
		f[1][1]= 21;
		f[1][2]= 22;
		
		int[][]g={{10,11,12},
				   {20,21,22}};
				
				System.out.println("f[1][1]="+f[1][1]);
				System.out.println("g[1][1]="+g[1][1]);
				
		
		
		
	
		

	}

}
