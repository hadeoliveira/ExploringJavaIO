package Properties;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadingProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("config.properties"));
		
		String github = prop.getProperty("Github");
		String login = prop.getProperty("login");
		String senha = prop.getProperty("senha");
		
		System.out.println("Login: "+ login +", senha: "+ senha +
				", Github: "+ github);
	}
}
