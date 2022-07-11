package rpgGame;

class SuperWarrior extends Warrior {
	
	SuperWarrior(String name){
		super(name);
		setInitialPower(100,60,0);
	}
	
	@Override
	void attack(Character c){
		System.out.printf("%sは、ダブルアタックした%n",this.name);
		super.attack(c);
		super.attack(c);
	}

}
