package taskday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazan {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaka\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
WebElement mouseover = driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(mouseover).perform();
	
	
	
	actions.moveToElement(mouseover).perform();
	
	
	
	//simple alert
	
               //due to frame its not compleated	

		
		
		
		
		
	}

}
