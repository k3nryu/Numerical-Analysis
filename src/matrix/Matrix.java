package matrix;

class Matrix {
double[][]m;

//デフォルトコンストラクタ
Matrix(){
	super();
}
Matrix(double[][]m){
	this.m=m;
}

//インスタンスメソッドによる行列の和
Matrix add(Matrix other ){
	double[][]r=new double[m.length][m[0].length];
	for(int i=0;i<m.length;i++){
		for(int j=0;j<m[0].length;j++){
			r[i][j]=this.m[i][j]+other.m[i][j];
		}
	}
	Matrix C =new Matrix(r);
	return C;
	
}

//クラスメソッドによる行列の和
static Matrix add(Matrix A,Matrix B){
	double[][]r=new double[A.m.length][A.m[0].length];
	for(int i=0;i<r.length;i++){
		for(int j=0;j<r[0].length;j++){
			r[i][j]=A.m[i][j]+B.m[i][j];
		}
	}
	Matrix C =new Matrix(r);
	return C;
	
}

//クラスメソッドによる行列の和２
static void add(Matrix A,Matrix B,Matrix C){
	C.m=new double[A.m.length][A.m[0].length];
	for(int i=0;i<A.m.length;i++){
		for(int j=0;j<A.m[0].length;j++){
			C.m[i][j]=A.m[i][j]+B.m[i][j];
		}
	}

	
}

//インスタンスメソッドによる行列の積
Matrix multiple(Matrix other){
	double[][]r=new double[m.length][other.m[0].length];
	for(int i=0;i<r.length;i++){
		for(int j=0;j<r[0].length;j++){
			r[i][j]=0;
			for(int k=0;k<m[0].length;k++){
				r[i][j]+=this.m[i][k]*other.m[k][j];
			}
		}
	}
	Matrix C=new Matrix(r);
	return C;
}
//行列の情報を出力する（インスタンスメソッド）
void print(String mess,String format){
	System.out.println(mess);
	for(int i=0;i<m.length;i++){
		for(int j=0;j<m[0].length;j++){
			System.out.printf(format,m[i][j]);
		}
		System.out.println();
	}
}
}
