package rpgGame;

class Warrior extends Character {

	Warrior(String name){
		super(name);
		setInitialPower(50,30,0);
		mat[countMat++]=new Bat("こん棒");
	}
	
	void attack(Character c){
		int damage =(int)((this.ap + plusAp())*(Math.random())/2);
		c.hp  = Math.max(0, c.hp-damage);
		System.out.printf("%sは%sに%dのダメージを与えた%n", this.name,c.name,damage);
		System.out.printf("%sのＨＰは%dとなった%n",c.name,c.hp);
	}
	
	SuperWarrior levelUp(){
		System.out.printf("戦士は%sは、スーパー戦士になった%n",this.name);
		return new SuperWarrior(name);
	}
}
