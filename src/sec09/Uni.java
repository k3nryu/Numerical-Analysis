package sec09;

class Uni {
	String name;
	int age;
	double weight;
	String kind;
	
	Uni(String name,int age,double weight,String kind){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.kind=kind;
	}
	void print(){
		System.out.printf("%sは、%s科の怪獣で、体重%.2fkg,年齢%d才の寄生虫です。%n",name,kind,weight,age);
	}
	void call(){
		System.out.printf("%sが怒ると、-1000℃のスペリウムで日本は壊滅する。%n",this.name);
	}

}
