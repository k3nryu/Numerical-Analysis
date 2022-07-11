package sec07;

class Example04 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		while(x<=10){
			sum += x;
			x++;
		}
		System.out.println("x="+x+",sum="+sum);
		
		x =1;
		sum =0;
		do{
		 sum +=x;
		 x++;
		}while(x<=10);
		System.out.println("x="+x+",sum="+sum);
	}
		

	}


