package SeleniumElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser_Back_Forward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver_106.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//Get the Window Id of the Browser
		String winid = driver.getWindowHandle();
		System.out.println(winid);
		//Get the Url from the browser
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[span[contains(text(),'Downloads')]]")).click();
		Thread.sleep(3000); //Mandatory wait for 3secs
		//simulate browser back
		driver.navigate().back();
		Thread.sleep(3000);
		//simulate browser forward
		driver.navigate().forward();
		//refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		//Goes to a respective URL info
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//Close the Current Browser
		driver.close();
		//Closes all the Browser which is invoked by Selenium
		driver.quit();
		
	}
}
