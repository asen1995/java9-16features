package common;

import java.util.Base64;

public class base64demo {

	public static void main(String[] args) {

		String stringValueForEncoding = "Asen";

		String encode = Base64.getEncoder().encodeToString(stringValueForEncoding.getBytes());
		System.out.println("encoded " + stringValueForEncoding + " : " + encode);

		String decodedString = new String(Base64.getDecoder().decode(encode.getBytes()));
		System.out.println("decodedString : " + decodedString);

	}
}
