package sec06;

class Example02 {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		a = 2;
		System.out.println( "(a,b) = (" + a + "," + b + ")" );

		int[] c = {1};
		int[] d = c;
		c[0] = 2;
		System.out.println( "(c[0],d[0]) = (" + c[0] + "," + d[0] + ")" );

		int[] e = new int[1];
		e[0] = c[0];
		c[0] = 3;
		System.out.println( "(c[0],e[0]) = (" + c[0] + "," + e[0] + ")" );

		int f = 1;
		int g = 2;
		// f  と ｇ の中身を交換！
		int h = f;
		f = g;
		g = h;
		System.out.println("f = " + f + ", g = " + g );

		int[] k = {1,2,3};
		int[] m = {4,5};
		// k と m を入れ替えたい！
		int[] n = k;
		k = m;
		m = n;
		System.out.println( "k[1] = " + k[1] + ", m[2] = " + m[2] );

		int[][] p = {{1,2,3},{4,5,6}};
		int q = p[0][0];
		p[0][0] = p[1][0];
		p[1][0] = q;
		System.out.println( "p[0][0] = " + p[0][0] + ", p[1][0] = " + p[1][0] );

		int[] r = p[0];
		p[0] = p[1];
		p[1] = r;
		System.out.println( "p[0][1] = " + p[0][1] + ", p[1][1] = " + p[1][1] );
		
//		int[] s = {1,2,3};
//		s = new int[]{4,5,6,7,8};

//		String t = "abc";
//		t = "def";

	}
}