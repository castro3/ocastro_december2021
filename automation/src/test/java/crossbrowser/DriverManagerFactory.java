package crossbrowser;

public class DriverManagerFactory {

	public DriverManager getManager(String browserType) {
		if(browserType.equals("chrome")) {
			return new ChromeDriverManager();
		}else if(browserType.equals("edge")) {
			return new EdgeDriverManager();
		}else
			return null;
	}
}
