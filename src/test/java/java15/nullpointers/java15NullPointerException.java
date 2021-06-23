package java15.nullpointers;

import org.junit.Test;

import java16.sealedclasses.Employee;

public class java15NullPointerException {

	@Test(expected = NullPointerException.class)
	public void testNullPointerNewMessageLogging() {

		Employee employee = null; // non-sealed, can be extended

		employee.getRang();
		// java.lang.NullPointerException: Cannot invoke
		// "java16.sealedclasses.Employee.getRang()"
		// because "employee" is null

	}
}
