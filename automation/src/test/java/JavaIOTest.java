import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import framework.ConfigurationProvider;

public class JavaIOTest {
	@Test
	public void canGtBrowserType() {
		ConfigurationProvider provider = new ConfigurationProvider();
		try {
			HashMap<String, String> properties = provider.getPropertiesFromResourceFile("config.properties");
			if(properties.containsKey("BrowserType")) {
				System.out.println(properties.get("BrowserType"));
			}
			
			assertEquals(properties.get("BrowserType"), "chrome");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	  
  @Test
  public void canGetMakesAndModels() {
	  try {
		  HashMap<String, ArrayList<String>> basses = new HashMap<String, ArrayList<String>>();
		  CSVReader bassesFile = new CSVReader(new FileReader(getClass().getResource("basses.csv").getPath()));
		  bassesFile.skip(1);
		  String[] row = null;
		  ArrayList<String> models = new ArrayList<String>();
		  
		  while((row = bassesFile.readNext()) != null) {
			  if(!basses.containsKey(row[0])) {
				  basses.put(row[0], new ArrayList<String>());
			  }
			  basses.get(row[0]).add(row[1]);
		  }
		  
		  for (String i : basses.keySet()) {
			  System.out.println("Make: " + i + " Models: " + basses.get(i));
			}
		  
		  assertTrue(basses.get("Warwick") != null);
		  assertTrue(basses.containsKey("Fender"));
	  } catch (CsvValidationException e) {
		  e.printStackTrace();
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
  	}
}
