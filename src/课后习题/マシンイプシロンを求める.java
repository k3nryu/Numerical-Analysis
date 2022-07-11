package 课后习题;

public class マシンイプシロンを求める {

	public static void main(String[] args) {
		System.out.println(1.0+1e-15);
		System.out.println(1.0+1e-16);
		
		//64Bit
		double ee =1.0;
		while(1.0+ee!=1.0){
			ee=ee/2.0;
		}
		System.out.println("64Bit's epesilon="+2*ee);
		
		//32Bit
		double e =1.0;
		for(int i=1;i<=23;i++){
			e=e/2.0;
		}
		System.out.println("32Bit's epsilon="+e);
		
		//32Bit
		float ef =1.0f;
		while(1.0f+ef>1.0f){
			ef = ef/2.0f;
		}
		System.out.println("32Bit's epsilon="+ef*2.0f);
		System.out.println("2^(-24)="+ef);
		

	}

}
