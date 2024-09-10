package gitRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bharath1 {
	@Test
	public  void om() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		
	List<WebElement>names=	driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	System.out.println(names.size());
	Thread.sleep(3000);
	
	for(WebElement country:names) {
		String text=country.getText();
		if(text.equals("India")) {
			country.click();
		}
	}	
	}

}
