package sec09;

class Dog {
	String name;//名前
	int age;    //年齢
	double weight;//体重
	String kind;//犬種
	
	Dog(String name,int age,double weight,String kind){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.kind = kind;
	}
	void print(){
		System.out.printf("%sは、犬種%sで、体重%.2fkg,年齢%d才の犬です。%n",name,kind,weight,age);
		
	}
	void call(){
		System.out.printf("%sを呼ぶと、しっぽを振って近づきます。%n",this.name);
	}

}
