package sec12;

public class Radio implements Powerable{
	@SuppressWarnings("unused")
	 private boolean isPowered = false;
	 
	@Override
	 public boolean powerOn(){
		 if(! isBatteryEnabled()){
			 return false;
		 }
		 this.isPowered = true;
		 return true;
	 }
	 @Override
	 public void powerOff(){
		 this.isPowered = false;
	 }
	 private boolean isBatteryEnabled(){
		 //本来はバッテリーの状態をチェック
		 return true;
	 }
}
