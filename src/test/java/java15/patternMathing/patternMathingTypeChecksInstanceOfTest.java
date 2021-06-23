package java15.patternMathing;

import static org.junit.Assert.fail;

import org.junit.Test;

import java16.sealedclasses.Employee;
import java16.sealedclasses.Person;

public class patternMathingTypeChecksInstanceOfTest {

	@Test
	public void testPatternMathingTypeChecks() {

		Person person = new Employee(); // non-sealed, can be extended

		if (person instanceof Employee employee) {
			employee.setRang(Employee.class.getCanonicalName());
		}

		if (person instanceof Employee employeePatternMatchingValue
				&& employeePatternMatchingValue.getRang().equalsIgnoreCase(Employee.class.getCanonicalName())) {
			// passed
		} else {
			fail("Pattern Matching Type Checks don't work");
		}

	}

}
