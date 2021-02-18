/**
 * Order to read
 * BufferedReader -> InputStreamReder -> FileInputStream: SomeContacts.txt
 * 
 */
		
package br.com.exploring.javaio.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		
		// Point to input a file. Stream point of input
		// Byte and bit Stream
		FileInputStream fileInputStream = new FileInputStream("SomeContacts.txt");
		// From the byte stream, take the chars
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		// Chars to line
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println("Reading the file...");
		String line = bufferedReader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		
		bufferedReader.close();
	}

}
