package JunkinTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {
	@Test
	public void practice()
	{
		//again changes from santosh
		WebDriver driver;
		String browser = System.getProperty("broswer");
		switch (browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}


           

		//		WebDriverManager.chromedriver().setup();
		//		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(" Testyantraaaaaa");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

		WebElement mouseover = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		Actions act = new Actions(driver);
		act.moveToElement(mouseover).perform();

		driver.findElement(By.xpath("//a[.='Sign Out']")).click();	

	}

}
