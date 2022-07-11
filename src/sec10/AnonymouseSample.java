package sec10;

class AnonymouseSample {

	public static void main(String[] args) {
		AnonymouseSample sample = new AnonymouseSample();
		sample.say();
		
	}
/*	class JapanesePerson extends Person2{
		@Override
		void hello() {
			System.out.println("こんにちは");
		}
	}*/
	void say(){
		Person2 person = new Person2(){
			@Override
			void hello() {
				System.out.println("こんにちは");
			}
		};
		person.hello();
	}
}

abstract class Person2{
	abstract void hello();
}

