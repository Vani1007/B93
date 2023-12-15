package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample8.html");
		//get the text present in text box --> value present in text box
		String v = driver.findElement(By.id("A1")).getAttribute("value");
		System.out.println(v);
		driver.quit();
		

	}

}
