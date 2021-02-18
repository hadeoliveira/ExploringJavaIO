	
package br.com.exploring.javaio.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class WriterTest2 {

	public static void main(String[] args) throws IOException {
		
		PrintStream printStream = new PrintStream("WriterTest2.txt");
		printStream.println("This is a new Test.");
		printStream.println();
		printStream.println("More one...");
		
		printStream.close();
	}

}
