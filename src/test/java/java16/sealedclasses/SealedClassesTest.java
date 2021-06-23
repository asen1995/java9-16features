package java16.sealedclasses;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SealedClassesTest {

	@Test
	public void testSealedClassPerson() {

		Person person = new Employee(); // non-sealed, can be extended

		Person person2 = new Boss(); // final

		Person person3 = new Manager(); // final
		((Manager) person3).sayHello();

		assertTrue(person instanceof Employee);
		assertTrue(person2 instanceof Boss);
		assertTrue(person3 instanceof Manager);

	}

	@Test
	public void testSealedClsassPerson() {

		Person person = new ExtendSealedandnoSealed(); // ExtendSealedandnoSealed <- Employee -< Person

		// extends non-sealed final Employee who extend sealed Person who give him
		// permission

		assertTrue(person instanceof ExtendSealedandnoSealed);
		assertTrue(person instanceof Employee);
		assertTrue(person instanceof Person);

	}

}
