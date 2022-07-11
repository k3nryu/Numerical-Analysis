package sec10;

// 継承の例題
class InheritanceExample {

	public static void main(String[] args) {
		Shape[] shapes = {
				new Circle( 1.0 ),
				new Square( 1.5, 2.0 ),
		        new Triangle( 2.5 , 3.0 )
		};

		for(int i=0; i<shapes.length; i++) {
			shapes[i].printArea();
		}
	}
}

// 図形クラス
class Shape {
	String name;
	// 面積を計算して返すメソッド
	double area() { // 本来は、抽象メソッドにして、このようなことはしない！
		return 0;
	}
	// 面積の情報を出力するメソッド
	void printArea() {
		System.out.printf( "%s %s の面積は、%f %n", this.name, toString(), area() );
	}
}

// 円クラス
class Circle extends Shape {
	double hankei;

	// コンストラクタ
	Circle( double hankei ) {
		this.hankei = hankei;
		this.name = "円";
	}

	@Override
	double area() {
		return hankei * hankei * Math.PI;
	}

	@Override
	public String toString() {
		String str = "(半径 = " + hankei + ")";
		return str;
	}
}

// 四角クラス
class Square extends Shape {
	double tate;
	double yoko;
	// コンストラクタ
	Square( double tate, double yoko ) {
		this.tate = tate;
		this.yoko = yoko;
		this.name = "長方形";
	}
	@Override
	double area() {
		return tate * yoko;
	}
	@Override
	public String toString() {
		String str = "(縦 = " + tate + ", 横 = " + yoko + ")";
		return str;
	}
}

// 三角形クラス
class Triangle extends Shape {
	double tehen;
	double takasa;
	//コンストラクタ
	Triangle( double tehen, double takasa ) {
		this.tehen = tehen;
		this.takasa = takasa;
		this.name = "三角形";
	}
	@Override
	double area() {
		return tehen * takasa / 2;
	}
	@Override
	public String toString() {
		String str = "(底辺 = " + tehen + ", 高さ = " + takasa + ")";
		return str;
	}
}