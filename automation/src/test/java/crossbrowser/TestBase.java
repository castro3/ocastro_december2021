package crossbrowser;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import framework.ConfigurationProvider;

public abstract class TestBase {
	
	DriverManagerFactory driverManagerFactory;
	HashMap<String, String> properties;
	DriverManager driverManager;

	protected void setup() {
		driverManagerFactory = new DriverManagerFactory();
		readConfigFile();
		launchDriver();
	}

	protected void cleanup() {
		this.driverManager.quitDriver();
	}

	private void launchDriver() {
		this.driverManager = driverManagerFactory.getManager(getBrowserType());
		this.driverManager.createDriver();
		long pageLoadTimeout = 60;
		this.driverManager.getDriver().manage().timeouts().implicitlyWait(pageLoadTimeout, TimeUnit.SECONDS);
		this.driverManager.getDriver().navigate().to(properties.get("Url"));
	}

	private void readConfigFile() {
		ConfigurationProvider provider = new ConfigurationProvider();
		try {
			properties = provider.getPropertiesFromResourceFile("config.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowserType() {
		return properties.get("BrowserType");
	}
}
