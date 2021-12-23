import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.testng.annotations.Test;

public class JavaIOTest {
  @Test
  public void getBrowserType() throws IOException {
	  InputStream inputStream = null;
	  try {
		  String fileName = "config.properties";
		  inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		  Scanner scanner = new Scanner(inputStream);

			if(inputStream == null) {
				scanner.close();
				throw new RuntimeException(fileName + " was not found in the Resources folder.");
			}
			
			while(scanner.hasNextLine()) {
				String value = scanner.nextLine();
				if(value.equals("BrowserType=chrome")) {
					System.out.println(value.substring(value.lastIndexOf("=")+1));
				}
			}
			scanner.close();
		}
		finally {
			inputStream.close();
		}
  }
}
