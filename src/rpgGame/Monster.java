package rpgGame;

class Monster extends Character {
	Monster(String name){
		super(name);
		setInitialPower(300,10,20);
	}

	@Override
	void attack(Character c) {
		System.out.println("モンスターの攻撃は未定義");
		
	}
}
