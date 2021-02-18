	
package br.com.exploring.javaio.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		
		// Point to write a file. Stream point of out
		// Byte and bit Stream
		OutputStream outputStream = new FileOutputStream("ContactsInWriter.txt");
		// From the byte stream, take the chars
		Writer writer = new OutputStreamWriter(outputStream);
		// Chars to line
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		bufferedWriter.write("Henrique Augusto de Oliveira");
		bufferedWriter.newLine();
		bufferedWriter.write("Github: https://github.com/");
		bufferedWriter.newLine();
		bufferedWriter.write("LinkedIn: https://www.linkedin.com/");

		bufferedWriter.close();
	}

}
