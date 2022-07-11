package arrayExamples;

class Example03 {

	public static void main(String[] args) {
		int[]x={1,2,3,4,5};
		
		int i=1;
		int j=3;
		
		//値の交換
		int y =x[i];
		x[i]=x[j];
		x[j]=y;
		
		System.out.println("x["+i+"]="+x[i]+",x["+j+"]="+x[j]);
		System.out.printf("x[%d]=%d,x[%d]=%d%n",i,x[i],j,x[j]);

	}

}
