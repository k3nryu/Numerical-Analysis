package sec10;

class StaticExample {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName( "瀬尾" );
		// person1.name = "石渡"; はできない！
		// person1.count = 1; これはあまりお勧めでない

		@SuppressWarnings("unused")
		Person person2 = new Person( "柳田" );

		System.out.printf( "現在先生の数は、 %d 人です。%n", Person.count() );

		@SuppressWarnings("unused")
		Person person3 = Person.createInstance();
		System.out.printf( "現在先生の数は、 %d 人です。%n", Person.count() );

	}

}