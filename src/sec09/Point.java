package sec09;

class Point {
	private double x;
	private double y;
	
	//コンストラクタ
	Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	Point(double x){
		//this.x=x;
		//this.y=0;
		this(x,0);
	}
	
	//デフォルトコンストラクタ
	Point(){
		super();
	}
	
	void setX(double x){
		this.x=x;
	}
	
	void setY(double y){
		this.y=y;
	}
	
	//原点からの距離を返すメソッド
	double length(){
		double length = Math.sqrt(this.x*this.x+this.y*this.y);
		return length;
	}
	
	void print(){
		System.out.printf("(%f,%f)%n",this.x,this.y);
	}

}
