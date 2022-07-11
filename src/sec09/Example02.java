package sec09;

class Example02 {

	public static void main(String[] args) {
		Point p =new Point(1,2);
		//p.setX(1);
		//p.setY(2);
		p.print();
		
		double length = p.length();
		System.out.println("原点からの距離は、"+length);
		
		Point q = new Point(1.5);
		//Point q = new Point();
		//q.setX(1.5);
		//q.setY(-1.0);
		q.print();
		System.out.println("原点からの距離は、"+q.length());
		
		Point r = new Point();
		r.setX(4.0);
		r.setY(3.0);
		r.print();
		System.out.println("原点からの距離は、"+r.length());
	}

}
