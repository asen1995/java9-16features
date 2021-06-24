package java14;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TextBlocksTest {

	@Test
	public void testSwitchExpression() {

		String multilineBlock = TextBlocks.getMultilineBlock();

		assertTrue(multilineBlock.contains("\\"));

	}
}
