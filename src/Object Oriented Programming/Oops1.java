
public class Oops1 {
	public static class Person {
		int age;
		String name;

		void sayHi() {
			System.out.println(name + "[" + age + "] says hi");
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "A";
//		p1.sayHi();

		Person p2 = new Person();
		p2.age = 20;
		p2.name = "B";
//		p2.sayHi();

		p1.sayHi();
		p2.sayHi();
		swap3(p1, p2);
		p1.sayHi();
		p2.sayHi();
	}

	public static void swap1(Person psn1, Person psn2) {
		Person temp = psn1;
		psn1 = psn2;
		psn2 = temp;
	}

	public static void swap2(Person psn1, Person psn2) {
		int age = psn1.age;
		psn1.age = psn2.age;
		psn2.age = age;

		String name = psn1.name;
		psn1.name = psn2.name;
		psn2.name = name;
	}

	public static void swap3(Person psn1, Person psn2) {
		psn1 = new Person();

		int age = psn1.age;
		psn1.age = psn2.age;
		psn2.age = age;

		psn2 = new Person();

		String name = psn1.name;
		psn1.name = psn2.name;
		psn2.name = name;
	}
}
