package complexNumber;

class ComplexExample {

	public static void main(String[] args) {
		Complex z1 = new Complex(1,2);
		z1.print("z1=");
		Complex z2 = new Complex(3,5);
		z2.print("z2=");
		//インスタンスメソッドによる足し算
		Complex z3 =z1.add(z2);
		z3.print("(i)z1+z2=");
		//クラスメソッドによる足し算
		Complex z4 =Complex.add(z1, z2);
		z4.print("(c)z1+z2=");
		//インスタンスメソッドによる掛け算
		Complex z5 =z1.multiply(z2);
		z5.print("(i)z1*z2=");
		//クラスメソッドによる掛け算
		Complex z6 =Complex.multiply(z1, z2);
		z6.print("(c)z1*z2=");
		
		Complex z7 =(z1.add(z2)).multiply(z1.add(z2.minus()));
		z7.print("(z1+z2)*(z1-z2)=");

	}

}
