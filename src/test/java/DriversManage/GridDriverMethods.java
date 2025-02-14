package DriversManage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverMethods {

	static WebDriver driver;

	DesiredCapabilities capabilities = new DesiredCapabilities();


	public WebDriver setUpChromeDriver(){

		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		capabilities.setVersion("133.0.6943.99");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(capabilities);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.178:4444"), chromeOptions);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		return driver;
	}


	public WebDriver setUpFirefoxTest(){

		capabilities.setPlatform(Platform.WIN11);
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("135.0");

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.merge(capabilities);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.178:4444"), firefoxOptions);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		return driver;
	}


	public WebDriver setUpEdgeTest(){

		capabilities.setPlatform(Platform.WIN11);
		capabilities.setBrowserName("edge");
		capabilities.setVersion("133.0.3065.59");

		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.merge(capabilities);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.178:4444"), edgeOptions);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		return driver;
	}



}
