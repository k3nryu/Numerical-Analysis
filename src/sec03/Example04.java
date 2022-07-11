package sec03;

class Example04 {

	public static void main(String[] args) {
		int x =1;
		x +=2;//x=x+2;
		x *=4;//x=x*4;
		System.out.println("x="+x);
		int y =1;
		y++;//y=y+1;y+=1;++y;
		System.out.println("y="+y);
		
		int a =2;
		int b =(a+=3);
		System.out.println("a="+a+",b="+b);
		
		x =3;
		y =x++;
		System.out.println("x="+x+",y="+y);
		x =3;
		y =++x;
		System.out.println("x="+x+",y="+y);


	}

}
