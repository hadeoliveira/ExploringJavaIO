	
package br.com.exploring.javaio.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterTest3 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream outputStream = new FileOutputStream("ContactsInWriter.txt");
//		Writer writer = new OutputStreamWriter(outputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	
		FileWriter writerFile = new FileWriter("WriterTest3.txt");
//		You could create a BufferedWriter that it receive a FileWriter
		
		writerFile.write("Henrique Augusto de Oliveira");
		writerFile.write(System.lineSeparator());
		writerFile.write("Github: https://github.com/");
		writerFile.write(System.lineSeparator());
		writerFile.write("LinkedIn: https://www.linkedin.com/");

		writerFile.close();
	}

}
