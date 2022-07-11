package rpgGame;

class Wizard extends Character {
	
	Wizard(String name){
		super(name);
		setInitialPower(100,10,100);
	}
	
	void attack(Character c){
		int damage = (int)(this.mp*Math.random());
		c.hp = Math.max(0, c.hp-damage);
		System.out.printf("%sは%sに%dの魔法を掛けた%n",this.name,c.name,damage);
		System.out.printf("%sのＨＰは%dとなった%n",c.name,c.hp);
		System.out.printf("%sのＭＰは%dとなった%n",this.name,this.mp);
	}

}
