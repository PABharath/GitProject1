package gitRepo;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void siva() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
	Set<String> abc=	driver.getWindowHandles();
	Iterator<String>itc=abc.iterator();
		String parent=itc.next();
		String child=itc.next();
		driver.switchTo().window(child);
	 String siva=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("mentor@")[1].trim().split(".com")[0].trim();
	 driver.switchTo().window(parent);
	 driver.findElement(By.id("username")).sendKeys(siva);
	 driver.findElement(By.id("password")).sendKeys("learning");
	 
	WebElement drop= driver.findElement(By.xpath("//div[@class='form-group']/select"));
	 
	 Select ab=new Select(drop);
	 ab.selectByIndex(1);
	 
	 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	 
	 driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	 
	List<WebElement> data= driver.findElements(By.cssSelector(".col-lg-3 h4"));
	
	for(int i=0;i<data.size();i++) {
		String carddata=data.get(i).getText();
		
		if(carddata.contains("Blackberry")) {
			driver.findElement(By.cssSelector(".card-footer button")).click();
		}
	}
	
	driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']/li/a")).click();

	}

}
