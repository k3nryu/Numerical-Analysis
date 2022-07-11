package complexNumber;

class Complex {
 private double real;//実部
 private double imag;//虚部
 
 Complex(double real,double imag){
	 this.real=real;
	 this.imag=imag;
 }
 
 //複素数の異符号化
 Complex minus(){
	 return new Complex(-real,-imag);
 }
 /*こちらにしたバージョンも考えうる
 void minus(){
	 real*=-1;
	 imag*=-1;
 }
 */
 //複素数の足し算（インスタンスメソッド版）
 Complex add(Complex other){
	 double real = this.real+other.real;
	 double imag = this.imag+other.imag;
	 //Complex z =new Complex(real,imag);
	 //return z;
	 return new Complex(real,imag);
 }
 
 //複素数の足し算（クラスメソッド版）
 static Complex add(Complex z1,Complex z2){
	 double real = z1.real+z2.real;
	 double imag = z1.imag+z2.imag;
	 return new Complex(real,imag);
 }
 
 //複素数の掛け算（インスタンスメソッド版）
 Complex multiply(Complex other){
	 double real=this.real*other.real-this.imag*other.imag;
	 double imag=this.real*other.imag+this.imag*other.real;
	 return new Complex(real,imag);
 }
 
 //複素数の掛け算（クラスメソッド版）
 static Complex multiply(Complex z1,Complex z2){
	 double real = z1.real*z2.real-z1.imag*z2.imag;
	 double imag = z1.real*z2.imag+z1.imag*z2.real;
	 return new Complex(real,imag);
 }
 
 //情報の入力
 void print(String mess){
	 System.out.print(mess);
	 System.out.printf("(%f+%fi)%n",real,imag);
 }
}
