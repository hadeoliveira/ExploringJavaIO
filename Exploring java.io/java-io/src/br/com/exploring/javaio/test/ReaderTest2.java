/**
 * To use String.format, see doc: 
 * https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 */

package br.com.exploring.javaio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ReaderTest2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("Teste.csv"));
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			
			
			Scanner scannerLine = new Scanner(line);
			scannerLine.useLocale(Locale.US);
			scannerLine.useDelimiter(",");
			
			String typeAccount = scannerLine.next();
			int bankAgency = scannerLine.nextInt();
			int bankAccount = scannerLine.nextInt();
			String name = scannerLine.next();
			double accountBalance = scannerLine.nextDouble();
			
			String formatValue = String.format(new Locale("pt","BR"), 
					"%s - %05d/%06d - %s - %.2f %n", 
					typeAccount, bankAgency, bankAccount, name, 
					accountBalance);
			System.out.println(formatValue);
			
			scannerLine.close();
			
			/*
			 * String[] values = line.split(",");
			 * System.out.println(Arrays.toString(values));
			 */		
		}
		
		scanner.close();
	}
}
