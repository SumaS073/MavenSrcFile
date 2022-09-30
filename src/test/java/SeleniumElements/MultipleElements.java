package SeleniumElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class MultipleElements {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\chromedriver_106.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/cisco/login.do");
	
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("e#%5Bh44");
				driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
				driver.findElement(By.xpath("//a[@id='loginButton']")).click();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='List of Users']"))));
				List<WebElement> module= driver.findElements(By.xpath("//table[@class='navTable']//td[contains(@class,'navItem')]//div[@class='label']"));
				for(WebElement mod:module) {
					System.out.println(mod.getText());
				}
				System.out.println("=====");


		

	}

}
