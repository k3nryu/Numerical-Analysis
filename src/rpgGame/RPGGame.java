package rpgGame;

class RPGGame {

	public static void main(String[] args) {
		Warrior tidus = new Warrior("ディーダ");
		Wizard yuna = new Wizard("ユウナ");
		Monster slime01 = new Monster("スライム#01");
		
		tidus.attack(slime01);
		tidus=tidus.levelUp();
		tidus.attack(slime01);
		yuna.attack(slime01);
	}

}
