package 课堂笔记;

public class 进制转换 {

	public static void main(String[] args) {
		
//----------------10进制转2，8，16进制-------------------
//		double x=10.1;//*注意*：并不能转换double型
		int x=11;
		String binStr=Integer.toBinaryString(x);//转2进制  
		String otcStr=Integer.toOctalString(x);//转8进制	  
		String hexStr=Integer.toHexString(x);//转16进制		  
		System.out.println("("+x+")10=("+binStr+")2");  //输出2进制
		System.out.println("("+x+")10=("+otcStr+")8");  //输出8进制
		System.out.println("("+x+")10=("+hexStr+")16");  //输出16进制	
//----------------2，4，8，16进制转10进制-------------------
//		二进制转十进制   
		System.out.println(Integer.valueOf("101",2).toString()); 
//		四进制转十进制   
		System.out.println(Integer.valueOf("13",4).toString()); 
//		八进制转成十进制   
		System.out.println(Integer.valueOf("567",8).toString());   
//		十六进制转成十进制   
		System.out.println(Integer.valueOf("F",16).toString());

	}

}
