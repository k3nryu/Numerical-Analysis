package fraction;

class Fraction {
	int bunsi;
	int bunbo;
	
	Fraction(int bunsi,int bunbo){
		this.bunsi=bunsi;
		this.bunbo=bunbo;
	}
	
	Fraction add(Fraction other){
		int s=this.bunsi*other.bunbo+this.bunbo*other.bunsi;
		int b=this.bunbo*other.bunbo;
		Fraction result =new Fraction(s,b);
		result.reduction();
		return result;
	}
	
	Fraction multiple(Fraction other){
		int s=this.bunsi*other.bunsi;
		int b=this.bunbo*other.bunbo;
		Fraction result = new Fraction(s,b);
		return result;
	}
	
	Fraction minus(Fraction other){
		int s =this.bunsi*other.bunbo-this.bunbo*other.bunsi;
		int b =this.bunbo*other.bunbo;
		Fraction result =new Fraction(s,b);
		return result;
	}
	
	Fraction multiple(int a){
		Fraction result =new Fraction(bunsi*a,bunbo);
		result.reduction();
		return result;
	}
	void print(String mess){
		System.out.printf("%s%d/%d%n", mess,bunsi,bunbo);
}
	
	//自分自身の分子分母を通分するメソッド
	void reduction(){
		int r=gcd(bunsi,bunbo);
		bunsi/=r;
		bunbo/=r;
	}
	
	//Euclidの互除法を用いて最大公約数を求めるメソッド
	int gcd(int a,int b){
		int r =a%b;
		if(r==0){
			return b;
		}else{
			return gcd(b,r);
		}
	}

	

}