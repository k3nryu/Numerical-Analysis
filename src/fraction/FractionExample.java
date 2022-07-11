package fraction;

class FractionExample {

	public static void main(String[] args) {
		Fraction f1=new Fraction(1,2);
		Fraction f2=new Fraction(2,3);
		Fraction f3=new Fraction(3,5);
		Fraction f6=new Fraction(1,7);
		
		Fraction f4=f1.add(f2).multiple(f3);
		f4.print("(f1+f2)*f3=");
		
		Fraction f5=f2.multiple(2);
		f5.print("2*f2=");
		
		Fraction f7=f6.multiple(f1);
		f7.print("f6*f1=");
		
		Fraction f8=f3.minus(f1);
		f8.print("f3-f1=");

	}

}
