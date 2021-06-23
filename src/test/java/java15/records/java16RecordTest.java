package java15.records;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class java16RecordTest {

	@Test
	public void testRecords() {

		var name = "Asen";
		var age = 25;

		Person person = new Person(name, age); // public record Person(String name, int age) {
		assertTrue(person.name() == name);
		assertTrue(person.age() == age);

	}
}
