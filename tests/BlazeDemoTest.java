import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver = new ChromeDriver();

		driver.get("http://blazedemo.com/");
		WebElement inputBox;
		//to check number of cities
		
	WebElement selectButton = driver.findElement(
				By.cssSelector("form-inline"));

	}
	@Test
	public void test2() {
		//select the fligt
		WebElement selectFlight = driver.findElement(
				By.cssSelector("btn btn-small"));
		WebElement virginFligt = driver.findElement(
				By.cssSelector("table+tr td"));
	}
	

}
