package common;

import static org.junit.Assert.*;

import java.util.Base64;

import org.junit.Test;

public class base64demoTest {

	@Test
	public void testEncode() {
		String stringValueForEncoding = "Asen";
		String encoded = base64demo.encode(stringValueForEncoding);
		String test = Base64.getEncoder().encodeToString(stringValueForEncoding.getBytes());
		assertTrue(encoded.equals(test));
	}

	@Test
	public void testDecode() {
		String stringValueForTheTest = "Asen";
		String encoded = base64demo.encode(stringValueForTheTest);
		String decoded = base64demo.decode(encoded);
		assertTrue(decoded.equals(stringValueForTheTest));
	}

}
