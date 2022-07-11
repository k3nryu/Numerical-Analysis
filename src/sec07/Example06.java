package sec07;

//sinとcos
class Example06 {

	public static void main(String[] args) {
		System.out.printf("%6s|%8s|%8s%n","θ","SINθ","COSθ");
		System.out.println("-----+-----+-----");		
		for(int k=0;k<=12;k++){
			double theta =k*Math.PI/12;
			System.out.printf("%6s|%8.5f|%8.5f%n",(k+"π/12"),
					Math.sin(theta),Math.cos(theta));
		}

	}

}
