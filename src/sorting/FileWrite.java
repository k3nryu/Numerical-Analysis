package sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class FileWrite {

	public static void main(String[] args) throws IOException {
		int n = 51200;//要素の個数
		int max = 1000000;//要素の最大数　最小値は１
		
		File file=new File("src/sorting/SortData_n"+n+"max"+max+".txt");
		
		//乱数データのファイル書き込み
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pw.println(n);
		pw.println(max);
		for(int i =0;i<n;i++){
			pw.println((int)(1+max*Math.random()));
		}
		pw.close();

	}

}
