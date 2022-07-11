package monteCarlo;

/**
 * モンテカルロ法により２つの関数に挟まれた領域の面積を求める<br><br>
 * 
 * ２次元矩形領域 {{xmin,ymin},{xmax,ymax}} において<br>
 * 領域の上限を表す関数 upper(x) と<br>
 * 領域の下限を表す関数 lower(x) の<br>
 * ２つの関数に挟まれた領域の面積を求める。<br><br>
 * 
 * 【使い方】<br>
 * <ol>
 * <li> このクラスを継承したインスタンスを作成する
 * <li> 定義矩形領域をインスタンス・メソッド {@link CalcAreaByMonteCarlo#setRange(double, double, double, double) setRange} のパラメータで設定する
 * <li> 擬似乱数発生乱数と途中経過の出力の有無をインスタンスメソッド {@link CalcAreaByMonteCarlo#setIterCount(int, boolean) setIterCount} のパラメータで設定する
 * <li> インスタンスメソッド {@link CalcAreaByMonteCarlo#start() start} を実行して、その戻り値として面積を得る
 * </ol>
 * @author 和田＠数理情報科学
 * @version 1.0
 */
public abstract class CalcAreaByMonteCarlo {
	/** 定義矩形領域の x 軸方向最小値:デフォルト値 = 0.0<br>
	 * setRange メソッドで明示設定 */
	private double xmin;
	/** 定義矩形領域の y 軸方向最小値:デフォルト値 = 0.0<br>
	 * setRange メソッドで明示設定 */
	private double ymin;
	/** 定義矩形領域の x 軸方向最大値:デフォルト値 = 1.0<br>
	 * setRange メソッドで明示設定 */
	private double xmax;
	/** 定義矩形領域の y 軸方向最大値:デフォルト値 = 1.0<br>
	 * setRange メソッドで明示設定 */
	private double ymax;
	/** 擬似乱数発生回数:デフォルト値 = 1000000<br>
	 * setIterCount メソッドで明示設定 */
	private int iter;
	/** 途中コンソールに経過出力するか否かの真偽値:デフォルト値 = false<br>
	 * setIterCount メソッドで明示設定 */
	private boolean onCheck;
	/** API Random クラスを用いた擬似乱数 */
	java.util.Random random;
	
	/** フィールドのデフォルト値の設定 */
	public CalcAreaByMonteCarlo() {
		xmin = 0;
		ymin = 0;
		xmax = 1;
		ymax = 1;
		random = new java.util.Random();
		iter = 1000000;
		onCheck = false;	
	}
	
	/** 面積を求める領域の上限となる関数<br>
	 * 継承するクラスで、オーバーライドせねばならない。 
	 */
	protected abstract double upperFunction(double x);
	
	/** 面積を求める領域の下限となる関数<br>
	 * 継承するクラスで、オーバーライドせねばならない。 
	 */
	protected abstract double lowerFunction(double x);
	
	/** 
	 * 定義矩形領域の設定
	 * @param xmin 定義矩形領域の x 軸方向最小値
	 * @param ymin 定義矩形領域の y 軸方向最小値
	 * @param xmax 定義矩形領域の x 軸方向最大値
	 * @param ymax 定義矩形領域の y 軸方向最大値
	 */
	public void setRange(double xmin, double ymin, double xmax, double ymax) {
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
	}
	
	/**
	 * 擬似乱数発生回数の設定
	 * @param itre 擬似乱数発生回数
	 * @param onCheck 実行中にコンソールに途中結果の出力をするか否かの真偽値
	 */
	public void setIterCount(int itre, boolean onCheck) {
		this.iter = itre;
		this.onCheck = onCheck;
	}
	
	/**
	 * 引数に与えられた座標が２つの関数の間に挟まっているか否かの判定
	 * @param x x座標
	 * @param y y座標
	 * @return upperFunction(x) ≧ y ≧ lowerFunction(x) の真偽値を返す
	 */
	private boolean isInner(double x, double y) {
		return (y <= upperFunction(x)) && (y >= lowerFunction(x));
	}
	
	/**
	 * モンテカルロ法による求積法の開始メソッド
	 * @return 面積の推測値を double で返す
	 */
	protected double start() {
		// 途中経過を出力するタイミング（check 毎）を設定
		int check = (int)Math.pow(10, (int)(Math.log10(iter))-1);
		int count = 0;
		for(int i=1; i<=iter; i++) {
			double x = xmin + (xmax-xmin)*random.nextDouble();
			double y = ymin + (ymax-ymin)*random.nextDouble();
			if( isInner(x, y) ) count++;
			if( onCheck && i % check == 0 ) {
				System.out.printf( "{%d,%.10f},%n", i, (xmax-xmin)*(ymax-ymin)/i*count);
			}
		}
		return (xmax-xmin)*(ymax-ymin)/iter*count;
	}
}
