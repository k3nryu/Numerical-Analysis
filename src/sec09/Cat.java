package sec09;

class Cat {
	String name;//名前
	int age;    //年齢
	double weight;//体重
	String kind;//猫種
	
	Cat(String name,int age,double weight,String kind){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.kind = kind;
	}
	
	Cat(String name,String kind){
		//this.name = name;
		//this.age = -1;
		//this.weight = 0.0;
		//this.kind = kind;
		this(name,-1,0.0,kind);
	}
	
	void print(){
		if(age<0&&weight==0){
			System.out.printf("%sは、猫種%sで、体重不明,年齢不詳の野良猫です。%n",name,kind,weight,age);
		}else{
			
		System.out.printf("%sは、猫種%sで、体重%.2fkg,年齢%d才の猫です。%n",name,kind,weight,age);
		}
	}
	void call(){
		System.out.printf("%sを呼ぶと、面倒くさそうにこっちを見ます。%n",this.name);
	}

}
