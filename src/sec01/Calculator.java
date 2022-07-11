package sec01;
/*
 * Javaプログラムの例です
 */
class Calculator {

	public static void main(String[] args) {
//		/* 計算する */
//		int a = 1;
//		int b = 2;
//		int c = a + b;
//		
//		/* 計算した結果を表示する */
//		System.out.println("1+2="+c);
		
		// 字符型
//        boolean a = 100>10;
//        boolean b = 100<10;
//        System.out.println("100>10 = " + a);
//        System.out.println("100<10 = " + b);
//       
//        if(a){
//            System.out.println("100<10是对的");
//        }else{
//            System.out.println("100<10是错的");
//        }
//        int x;
//        double y;
//        x = (int)34.56 + (int)11.2;  // 丢失精度
//        y = (double)x + (double)10 + 1;  // 提高精度
//        double z = 1 + 3 / 2;
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        System.out.println("z=" + z);
		 int i, j;
	        for(i=1; i<=9; i++){
	            for(j=1; j<=9; j++){
	            	if(i>j){
	            		System.out.print("       ");
	            	}else{
	            		System.out.printf("%d+%d=%2d ",i,j,i*j);
	            	}
//	                while(j==9){
//	                	System.out.println();
//	                }
	                
	            }
	            System.out.println();		
	            
	        }




	}

}
