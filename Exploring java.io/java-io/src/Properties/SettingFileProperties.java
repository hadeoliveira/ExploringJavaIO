package Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SettingFileProperties {
	public static void main(String[] args) throws IOException{
		Properties properties = new Properties();
		
		properties.setProperty("login","joaozinho");
		properties.setProperty("senha","joaozinhoteste123");
		properties.setProperty("Github", "joaotestegithub");
		
		properties.store(new FileWriter("config.properties"), "Properties example");
	}
}
