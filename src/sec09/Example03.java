package sec09;

class Example03 {

	public static void main(String[] args) {
		
		Dog pochi = new Dog("ぽち",2,5.0,"豆芝");
		Cat tama = new Cat("たま",5,3.2,"三毛");
		Cat kuro = new Cat("くろ","黒毛");
		Uni manmo = new Uni("マンモ",100,500.0,"草薙");
		pochi.print();
		tama.print();
		kuro.print();
		manmo.print();
		
		pochi.call();
		tama.call();
		manmo.call();

	}

}
