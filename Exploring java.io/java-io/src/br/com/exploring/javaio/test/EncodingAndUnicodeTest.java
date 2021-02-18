package br.com.exploring.javaio.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingAndUnicodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
		System.out.println(s.codePointAt(0));
		
		System.out.println("Charset default: "+Charset.defaultCharset());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		
		bytes=s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");

		bytes=s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", ASCII");
	}
}
