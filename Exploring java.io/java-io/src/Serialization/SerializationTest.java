package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		String name = "Henrique Augusto de Oliveira";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("name.bin"));
//		oos.writeObject(name);
//		oos.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("name.bin"));
		Object object = ois.readObject();
		ois.close();
		System.out.println(object);
		
	}
}
