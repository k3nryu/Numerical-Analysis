package sec10;

class Person {
	/* 名前 */
	@SuppressWarnings("unused")
	private String name;
	private static int count = 0;

	/* コンストラクタ */
	Person( String name ) {
		// ここに super(); が隠れている
		this.name = name;
		Person.count += 1;
	}
	/* デフォルトコンストラクタ */
	Person() {
		super();
		Person.count += 1;
	}
	/* インスタンスメソッド */
	void setName( String name ) {
		this.name = name;
	}
	/* クラスメソッド */
	static int count() {
		return Person.count;
	}

	static Person createInstance() {
		Person person =  new Person();
		return person;
	}
}