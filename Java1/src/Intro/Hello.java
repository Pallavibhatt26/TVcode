/**
 * 
 */
package Intro;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
/**
 * @author LENOVO
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws  InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 

		  driver.get("http://www.google.com/");    

		  Thread.sleep(5000);  // Let the user actually see something!     

		  WebElement searchBox = driver.findElement(By.name("q"));

		  searchBox.sendKeys("ChromeDriver");     

		  searchBox.submit();    

		  Thread.sleep(5000);  // Let the user actually see something!     

		  driver.quit();
		

	}

}