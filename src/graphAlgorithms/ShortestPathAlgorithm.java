package graphAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 最短経路問題の Dijkstra 法による解法
 * 
 * @author 和田雅美＠数理情報科学科.理学部.東京理科大学
 * 
 * グラフのデータファイルは、次のフォーマットで設定：
 * 　１レコード目：点の個数
 * 　２レコード目から：各点の名前を点番号順に文字列で（点の個数分）
 * 　始点の名前を文字列で
 * 　グラフが有向グラフ direct か無向グラフ undirect かを文字列で
 * 　各辺の情報を以下のようにカンマ区切りの３整数値で
 *  　　その辺の始点番号, 終点番号, その辺のコスト
 *
 *　　注）無向グラフの場合、各辺を１回だけデータ化
 * ----------------------------------------
 * 　例）３点が相互につながっている無向グラフ
 * 　3 　　：点の個数
 * 　v0　　：点番号 0 の点の名前
 * 　v1　　：点番号 1 の点の名前
 * 　v2　　：点番号 2 の点の名前
 * 　v0	　　　： 始点は v0
 * 　undirect： 有向グラフか無向グラフかを文字列で
 * 　0,1,1　　： v0 から v1 へコスト １
 * 　0,2,3　　： v0 から v2 へコスト ３
 * 　1,2,2　　： v1 から v2 へコスト ２
 * 
 *  注:Warshall-Floyd 法のデータファイルとの違いは、始点情報があること！ 
 */
public class ShortestPathAlgorithm {
	int countNodes; // 点の個数
	int countEdges; // 辺の個数
	String startNodeName; // 出発点の名前
	NetworkNode[] nodes; // 点の情報の配列
	int[][] adjMat; // 隣接行列
	boolean isDirectGraph; // 有効グラフか否かの判定値

	static final int INFTY = Integer.MAX_VALUE; // 整数値の最大値（∞の代わり）
	
	public static void main(String[] args) {
		ShortestPathAlgorithm graph = new ShortestPathAlgorithm();
		try {
			graph.getGraphData( "src/graphAlgorithms/graphData.txt" );
		} catch( FileNotFoundException exp ) {
			System.out.println("指定したデータファイルが存在しません！");
			System.exit(1);
		}
		graph.dijkstra(); // Dijkstra 法による全点対最短経路問題の解法
		graph.print(); // 計算結果の標準出力（Dijkstra 法用）
	}
	
	// ファイルよりグラフデータを読み込む（Dijkstra法用）
	void getGraphData( String fileName ) throws FileNotFoundException {
		Scanner scan = new Scanner(new File( fileName ));
		// \r\n= Windows
		// \n= UNIX, MacOS X
		// \n\r= old Mac
		// u2028= Line Separator
		// u2029= Paragraph Separator
		// u0085= Next Line
		// System.getProperty("line.separator")
		scan.useDelimiter(",|\r\n|[\n\r\u2028\u2029\u0085]"); // データ区切り記号の設定
		countNodes = scan.nextInt();//点の個数の入力
		
		nodes = new NetworkNode[countNodes];//配列の大きさを決定
		
		for(int i=0; i<countNodes; i++) {
			String nodeName = scan.next();//点の名前を入力
			nodes[i] = new NetworkNode( i, nodeName );//点のインスタンス配列を生成
		}
		
		startNodeName = scan.next();//出発点の名前を入力
		
		adjMat = new int[countNodes][countNodes];//隣接行列の設定
		for(int i=0; i<countNodes; i++) {
			for(int j=0; j<countNodes; j++) {
				adjMat[i][j] = INFTY;//とりあえず、すべてに∞を入れておく
			}
		}
		
		isDirectGraph = scan.next().equals("direct");//グラフが有向グラフか否かを真偽値で与える
		countEdges = 0;//辺の個数を初期化
		while( scan.hasNext() ) {//まだ読むデータがあるかを真偽値で返してくれる
			int from = scan.nextInt();//その辺の出発点番号
			int to = scan.nextInt();//その辺の終着点番号
			int dist = scan.nextInt();//その辺のコスト
			adjMat[from][to] = dist;//隣接行列にコストを代入
			countEdges++;//辺の数をカウント
			if( ! isDirectGraph ) {//無向グラフの時、同じ２点間の逆向きのデータを作成
				adjMat[to][from] = dist;
			}
		}
		scan.close();//Scannerを閉じる（ファイルも閉じられる）
	}
	
	// グラフデータをコンソールに出力する（Dijkstra法用）
	void print() {
		System.out.println("Dijkstra 法による最短経路問題の解法\n");
		System.out.printf("number of points = %d%n", countNodes);
		System.out.printf("number of edges = %d%n", countEdges);
		System.out.printf("start point = %s%n", startNodeName);
		System.out.printf("graph is %s %n%n" , ((isDirectGraph)?"direct":"undirect") );
		System.out.print("              ");
		printMatrix();
		for(int i=0; i<nodes.length; i++) {
			System.out.printf("%3s", nodes[i].name);
		}
		System.out.println();
		for(int i=0; i<countNodes; i++) {
			System.out.printf("%3s ", nodes[i].name);
			if( nodes[i].distance < INFTY ) {
				System.out.printf("(%3d)",nodes[i].distance);
			} else {
				System.out.printf("(%3s)","∞");
			}
			if(nodes[i].prev != null) {
				System.out.printf(" %3s",nodes[i].prev.name);
			} else {
				System.out.print("  - ");
			}
			System.out.print(":");
			for(int j=0; j<countNodes; j++) {
				if( adjMat[i][j] == INFTY) {
					System.out.printf("%3s","∞");
				} else {
					System.out.printf("%3d", adjMat[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	private void printMatrix() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	// Dijkstra 法
	void dijkstra() {
		int s = 0;
		for(int i=0; i<nodes.length; i++) {
			if( nodes[i].name.equals(startNodeName) ) {
				s = i;
				break;
			}
		}//出発点の番号が判明
		//点の個数分の優先度付ききゅーを作成
		PriorityQueue<NetworkNode> queue = new PriorityQueue<NetworkNode>(countNodes);
		nodes[s].setDistance(0);//出発点の距離を０に
		queue.add( nodes[s] );//出発点をキューに加える
		while( !queue.isEmpty() ) {//キューが空でない限り繰り返す
			System.out.println("queue="+queue);
			printMatrix();
			NetworkNode min_node = queue.remove();//キューから１つ点を取り出す
			for(int j=0; j<nodes.length; j++) {
				if( adjMat[min_node.no][j] != INFTY ) {//取り出した点と直接つながっている点を見つける
					int dist = min_node.distance + adjMat[min_node.no][j];//min_nodeを経由したコストを計算
					if( nodes[j].distance == INFTY || nodes[j].distance > dist ) {//それまでのコストより小さければ
						nodes[j].setDistance(dist);//点jの更新
						queue.remove(nodes[j]);//点jをキューから削除
						queue.add( nodes[j] );//点jのキューに追加
						nodes[j].prev = min_node;//点jの１つ前の点としてmin_nodeを設定
					}
					if( nodes[j].distance > dist ) {
						nodes[j].setDistance(dist);
						queue.add(nodes[j]);
						nodes[j].prev = min_node;
					}
				}
			}
		}
	}
	//内部クラス
	//優先度付きキューでの比較が可能になるようにComparableインタフェースを実装
	class NetworkNode implements Comparable<NetworkNode>{
		int no;//点番号
		String name;//点の名前
		int distance;//出発点からの距離
		NetworkNode prev;//出発点からのパスでの１つ前の点
		
		//コンストラクタ
		NetworkNode(int no, String name) {
			this.no = no;
			this.name = name;
			this.setDistance( INFTY);//最初は出発点からの距離は∞
			prev = null;//最初は１つ前の点はわからず
		}

		//距離設定メソッド
		void setDistance( int d ) {
			distance = d;
		}
		
		@Override
		public String toString(){
			return name;
		}
		
		//優先度付きキューの中での順序設定:-1だと優先度が高い
		@Override
		public int compareTo(NetworkNode p) {
			if( this.distance > p.distance ) return 1;
			if( this.distance < p.distance ) return -1;
			return 0;
		}
	}
}

