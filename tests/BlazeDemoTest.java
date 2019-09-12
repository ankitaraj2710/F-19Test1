import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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

	}

}
