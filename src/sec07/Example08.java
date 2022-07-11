package sec07;

class Example08 {

	public static void main(String[] args) {
		double[] x ={1.5,1.6,1.7};
		double sum = 0; //これをint sum = 0,に変えると！？
		//方法１
		for(int i =0; i<x.length;i++){
			sum = sum +x[i];
		}
		System.out.println(sum);
		
		//方法２
		sum = 0;
		for(int i =0;i<x.length;i++){
			sum += x[i];
		}
		System.out.println(sum);

	}

}
