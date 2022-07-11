package sec07;

class Example05 {

	public static void main(String[] args) {
		int sum =0;
		for(int i = 1; i<=10; i+=2){
			sum +=i;
		}
		System.out.println("sum="+sum);
		
		sum = 0;
		for(int i =1;i<=10;i+=2){
		 sum +=i*i;
	   }
		System.out.println("sum="+ sum); 
	}
}

