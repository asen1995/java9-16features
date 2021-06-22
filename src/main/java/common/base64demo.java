package common;

import java.util.Base64;

public class base64demo {

	public static String encode(String stringValueForEncoding) {
		String encode = Base64.getEncoder().encodeToString(stringValueForEncoding.getBytes());
		System.out.println("encoded " + stringValueForEncoding + " : " + encode);
		return encode;
	}

	public static String decode(String stringValueForDecoding) { 
		String decodedString = new String(Base64.getDecoder().decode(stringValueForDecoding.getBytes()));
		System.out.println("decodedString : " + decodedString);
		return decodedString;
	}
}
