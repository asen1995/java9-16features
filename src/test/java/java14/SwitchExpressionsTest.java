package java14;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SwitchExpressionsTest {

	@Test
	public void testSwitchExpression() {

		assertFalse(SwitchExpressions.isTodayHoliday("MONDAY"));

		assertFalse(SwitchExpressions.isTodayHoliday("THURSDAY"));

		assertTrue(SwitchExpressions.isTodayHoliday("SATURDAY"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSwitchExpressionDefaultExceptionThrown() {

		assertTrue(SwitchExpressions.isTodayHoliday("NOTREAL DAY OF NAME"));

	}
}
