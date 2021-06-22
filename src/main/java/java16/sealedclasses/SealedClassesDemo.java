package java16.sealedclasses;

public class SealedClassesDemo {

	public static void main(String[] args) {
		Person person = new Employee(); // non-sealed, can be extended

		Person person2 = new Boss(); // final

		Person person3 = new Manager(); // final
		((Manager) person3).sayHello();

	}
}
