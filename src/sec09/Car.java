package sec09;

class Car {
  private int speed=0;
  
  /*コンストラクタ*/
  Car(int speed){
	  this.speed=speed;
  }
  
  /*デフォルトコンストラクタ*/
  Car(){
	  super();
  }
 
 /*スピードを上げるメソッド*/
  int speedUP(int value){
	  value=(value>=0?value:0);/*負のvalueは0にする*/
	 this.speed +=value;
	 /*安全装置（最高速度）*/
	 if(this.speed>=180){
		 this.speed=180;
	 }
	 return this.speed;
 }
 
 /*スピードを下げるメソッド*/
  int speedDown(int value){
	 value=(value>=0?value:0);/*負のvalueは0にする*/
	 this.speed -=value;
	 /*安全装置（バック時）*/
	 if(this.speed<=-15){
		 this.speed=-15;
	 }
	 return this.speed;
 }
 
 /*現在のスピードを表示する*/
 void printSpeed(){
	 System.out.printf("現在のスピードは、時速%dkmです。%n",this.speed);
 }
}
