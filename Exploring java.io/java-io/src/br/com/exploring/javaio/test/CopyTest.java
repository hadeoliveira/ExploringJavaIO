/**
 * Order to read
 * BufferedReader -> InputStreamReder -> FileInputStream: SomeContacts.txt
 * 
 */
		
package br.com.exploring.javaio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CopyTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("SomeContacts.txt");
	// To use keyboard input, do:
	//	FileInputStream keyboardInput = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream outputStream = new FileOutputStream("CopyFileTest.txt");
	// To use keyboard out, do the next line and add flush() on while():
	//	OutputStream keyboardOut = System.out;
		Writer writer = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		String line = bufferedReader.readLine();
		
		while(line != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			line = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}

}
