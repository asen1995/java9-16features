package java16.records;

public class java16Main {

	
	public static void main(String[] args) {
		
		Person person = new Person("ds", 3);
		System.out.print(person.age());
		System.out.print(person.name());
	}
}
