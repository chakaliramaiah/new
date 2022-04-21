package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copyedbaseclass {

	
	public class BaseClass {
		WebDriver driver;
	public  void getDriver() {
	WebDriverManager.chromedriver().setup();
	    }
	//1
	public void LoadUrl(String Url) {
		driver.get(Url);
	    }
	//2
	public void sendkeys(WebElement element,String data) {
	    element.sendKeys(data);
	    }
	//3
	public void Click(WebElement element) {
		element.click();
	    }
	//4
	public  WebElement findElementById( String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
	    return element;
	    }
	//5
	public  WebElement findElementByName( String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
	    return element;
	    }
	//6
	public  WebElement findElementClassName( String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
	    return element;
	    }
	//7
	public String Attribute(WebElement element,String attributeName) {
	     String attribute = element.getAttribute(attributeName);
	     return attribute;	
	     }
	//8
	public void Maximize() {
	    driver.manage().window().maximize();
	    }
	//9
	public void Quit() {
		driver.quit();
	    }
	//10
	public void Close() {
		driver.close();
	    }
	//11
	public WebElement Xpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;	
	    }	
	//12
	public String GetText(WebElement element) {
	   String text = element.getText();
	   return text;
	   }
	//13
	public void MouseOverAction(WebElement s) {
		Actions actions =new Actions(driver);
		actions.moveToElement(s).perform();
	    }
	//14
	public void DargAndDrop(WebElement source,WebElement tar) 
	Actions actions = new Actions(driver);
		actions.dragAndDrop(source, tar ).perform();
	    }
	//15
	public void DoubleClick(WebElement data) {
		Actions actions =new Actions(driver);
		actions.contextClick(data).perform();
	    }
	//16
	public void RobotKeyPress(int keycode) throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(keycode);
	    }
	//17
	public void RobotKeyRelease(int keycode) throws AWTException {
		Robot robot=new Robot();
		robot.keyRelease(keycode);
	    }
	//18
	public void AlertAccept() {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
	    }
	//19
	public void AlertDismiss() {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.dismiss();
	    }
	//20
	public String AlertGetText(WebElement element) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	    }
	//21
	public void AlertSendKeys(String data) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	    }
	//22
	public File TakesScreen( ) {
		TakesScreenshot screen =(TakesScreenshot )driver;
		File ss = screen.getScreenshotAs(OutputType.FILE);
		return ss;
	    }
	//23
	public void SelectOptionByText(WebElement element, String text) {
		Select select =new Select(element);
		select.deselectByVisibleText(text);
	    }
	//24
	public void SelectOptionByAttribute(WebElement element, String text) {
		Select select =new Select(element);
		select.deselectByValue(text);
	}
	//25
	public void SelectOptionByIndex(WebElement element, int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
		}
	//26
	public List<WebElement> GetOption(WebElement element) {
		Select select =new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
		}
	//27
	public List<WebElement> GetAll(WebElement element) {
		Select select =new Select(element);
		List<WebElement> allSelected = select.getAllSelectedOptions();
		return allSelected;
		}
	//28
	public WebElement GetFirst(WebElement element) {
		Select select =new Select(element);
		WebElement Option = select.getFirstSelectedOption();
		return Option;
		}
	//29	
	public boolean IsMultiple(WebElement element) {
		Select select =new Select(element);
		boolean multiple = select.isMultiple(); 
		return multiple;
	    }
	//30
	public void DeselectByIndex(WebElement element, int index) {
		Select select =new Select(element);
		select.deselectByIndex(index);
		}
	//31
	public void DeselectByValue(WebElement element,  String value) {
		Select select =new Select(element);
		select.deselectByValue(value);
		}
	//32
	public void DeselectByVisibileText(WebElement element,String text) {
		Select select =new Select(element);
		select.deselectByVisibleText(text);
		}
	//33
	public void DeselectAll(WebElement element) {
		Select select =new Select(element);
		select.deselectAll();
		}
	//34
	public void GetWindowHandle() {
			 driver.getWindowHandle();
		}
	//35
	public void GetWindowHandles() {
		 driver.getWindowHandles();
		}
	//36
	public void Frame(WebElement element ) {
		 driver.switchTo().frame(element);
		}
	//37
	public void Frame(int index ) {
	     driver.switchTo().frame(index);
			}
	//38
	public void Frame(String id ) {
	    driver.switchTo().frame(id);
	}
	//39
	public void Frame2(String name ) {
	    driver.switchTo().frame(name);
	}

	//40
	public void TypeJs(WebElement element,String data) {
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('Values','"+data+"')",element);
		}
	//41
	public void NavigateTO(String url) {
		driver.navigate().to(url);	
		}
	//42
	public void NavigateBack( ) {
		driver.navigate().back();
		}
	//43
	public void NavigateForward( ) {
		driver.navigate().forward();
		}
	//44
	public void NavigateRefresh( ) {
		driver.navigate().refresh();
		}
	//45
	public void SetUpSytem(String key,String path) {
		System.setProperty(key, path);
	    }
	//46
	public void Actions(WebElement element,String data) {
		Actions actions =new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, "reference").keyUp(Keys.SHIFT).perform();
		}

	//47
	public void JsGetAttribute(WebElement element) {
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].getAttribute('Values')",element);
			}
	//48
	public void Thread(int sec) throws InterruptedException {
			Thread.sleep(sec);
			}
	//49
	public void ParentFrame() {
			driver.switchTo().parentFrame();
			}

	//50
	public List<WebElement> AllOptions(WebElement element) {
		    Select select =new Select(element);
		    List<WebElement> options = select.getOptions();
		    return options;
		    }
	//51
	public void ChildWindow(String Win) {
		    driver.switchTo().window(Win);
		     }




	}

}
