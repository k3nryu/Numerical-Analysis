package matrix;

class MatrixExample2 {

	public static void main(String[] args) {
		Matrix A =new Matrix(
			new double[][]{{-6,2},{2,-1}});
		Matrix B =new Matrix(
			new double[][]{{4,2},{-1,3}});
		//行列の和
		Matrix C =A.add(B);
		C.print("C=","%5.2f");
		
		//行列の和（クラスメソッド版）
		C=Matrix.add(A,B);
		C.print("C(class method版)=", "%5.2f");
		
		//行列の和（クラスメソッド版２）
		Matrix D =new Matrix();
		Matrix.add(A,B,D);
		D.print("D=","%9.2e");
		
		//行列の積
		C=A.multiple(B);
		C.print("A×B=", "%5.2f");
		
		//行列の積（クラスメソッド版）
		//C=Matrix.multiple(A,B)
		//C.print("A×B=","%5.2f");
		
		//行列の転置
		//C=A.transpose();
		//C.print("tA=", "%5.2f");
		
		//混合計算
		//C=A.add(B).transpose();
		//C.print("t(A+B)=","%5.2f");

	}

}
