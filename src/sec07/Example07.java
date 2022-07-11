package sec07;

class Example07 {

	public static void main(String[] args) {
		int[]x = {12,-4,5,8,20,-10,0,3};
		
		//要素の総和
		int sum = 0;
		for(int i =0;i<x.length; i++){
			sum+=x[i];
		}
		//System.out.println("要素の総和は、"+sum);
		//System>out.println("要素の平均は、"+(double)sum/x.length);
		System.out.println("要素の総和は、"+sum);
		
		sum = 0;
		for(int element:x){
			sum += element;
		}
		System.out.println("要素の総和は、"+sum);
		
		double average =(double)sum/x.length;
		System.out.println("要素の平均は、"+(double)sum/x.length);
		//System.out.printf("要素の総和は、%6d%n",sum);
		//System.out.printf("要素の平均は、%6.3f%n",average);
		
		double sum2 = 0;
		for(int i =0;i<x.length;i++){
			sum2 +=(x[i]-average)*(x[i]-average);
			//sum2 += Math.pow(x[i]-average,2);でも良い
		}
		double variance = sum2/x.length;
		System.out.println("要素の分散は"+variance);

	}

}
