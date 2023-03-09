package WebForm;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IngresoWeb {

	private WebDriver driver;
	
@Before
	public void setUp() {
		
		
		System.setProperty("webdriver.chorme.driver", "src/test/resources/chormeDriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
	
			
	}

@Test
	public void test() throws InterruptedException {
		WebElement webform = driver.findElement(By.xpath("/html/body/main/div/div[4]/div[1]/div/div/a[1]"));
		webform.click();
		WebElement texto =driver.findElement(By.xpath("/html/body/main/div/div[3]/div/h1"));
		System.out.println(texto);
		Thread.sleep(2000);
		WebElement textInput = driver.findElement(By.xpath("//*[@id=\"my-text-id\"]"));
		textInput.sendKeys("Hola mundo");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("/html/body/main/div/form/div/div[1]/label[2]"));
		password.sendKeys("Bogota123*");
		Thread.sleep(2000);
		WebElement checkDefault = driver.findElement(By.xpath("//*[@id=\"my-check-2\"]"));
		checkDefault.click();
		
	}
public void finish() {
	
	driver.quit();
}
	
}
