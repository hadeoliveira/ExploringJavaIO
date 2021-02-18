package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Client client = new Client();
//		client.setName("Joaquin Ramos da Silva");
//		client.setCpf("1234567890");
//		client.setProfession("SRE");
//		
//		ObjectOutputStream oos = 
//				new ObjectOutputStream(new FileOutputStream("client.bin"));
//		oos.writeObject(client);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.bin"));
		Client clientSerial = (Client) ois.readObject();
		ois.close();
		System.out.println(clientSerial + ", "+ clientSerial.getName() + ", "+
				clientSerial.getCpf() + ", "+ clientSerial.getProfession());
		
	}
}
