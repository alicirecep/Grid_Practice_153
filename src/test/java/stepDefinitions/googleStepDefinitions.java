package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class googleStepDefinitions {

	WebDriver driver = Hooks.driver;



	@Given("Kullanici URL girer")
	public void kullanici_url_girer() {

	driver.get("https://www.google.com");

	}
	@Given("Sayfa title'ni dogrular.")
	public void sayfa_title_ni_dogrular() {

	String expectedResult = "Google";
	String actualResult = driver.getTitle();

	assertEquals(actualResult,expectedResult);


	}
	@Given("Sayfayi kapatir.")
	public void sayfayi_kapatir() {

	// Hooks classinda kapatan method zaten var :)

	}




}
