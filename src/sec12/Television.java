package sec12;

class Television implements Powerable,VolumeChangeable{
	@SuppressWarnings("unused")
 private boolean isPowered = false;
 private int volume =0;
 
 @Override
 public boolean powerOn(){
	 if(! isPlugged()){
		 return false;
	 }
	 this.isPowered = true;
	 return true;
 }
 @Override
 public void powerOff(){
	 this.isPowered = false;
 }
 private boolean isPlugged(){
	 //本来はコンセントが刺さっているのかをチェック
	 return true;
 }
@Override
public void volumeUp() {
	if(this.volume<100){
		volume++;
	}
	
}
@Override
public void volumeDown() {
	if(this.volume>0){
		volume--;
	}
	
}
}
