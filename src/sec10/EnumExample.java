package sec10;

class EnumExample {

	static enum Month {
		JANUARY("睦月",31), FEBRUARY("如月",28),
		MARCH("弥生",31), APRIL("卯月",30),
		MAY("皐月",31), JUNE("水無月",30),
		JULY("文月",31), AUGUST("葉月",31),
		SEPTEMBAR("長月",30), OCTOBER("神無月",31),
		NOVEMBER("霜月",30), DECEMBER("師走",31);

		private String name; // フィールド
		private int days; // フィールド
		// コンストラクタ
		Month( String name, int days) {
			this.name = name;
			this.days = days;
		}
		String getName() { return name; } // メソッド
		int getDays() { return days; } // メソッド
	}

	public static void main(String[] args) {
		for( Month m : Month.values() ) {
			System.out.println(
					m.toString() + "(" + m.getName() + "):" +
			        m.getDays() + "日");
		}
	}
}