package day11;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//how to run JS using selenium in the browser?
public class Demo5 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) driver; //type casting
		//scroll down
		for(int i=1;i<=7;i++)
		{
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		
		//scroll up
		for(int i=1;i<=7;i++)
		{
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
		
		driver.quit();
	}

}
