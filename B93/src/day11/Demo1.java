package day11;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.name("login-button"));
		File image = button.getScreenshotAs(OutputType.FILE);
		System.out.println(image.getAbsolutePath());
		Thread.sleep(17000);
		
		driver.quit();
	}

}
