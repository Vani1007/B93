package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//close specific browser ---> example Swara
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample9.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
				
		for(String w:allWHS)
		{
			driver.switchTo().window(w);
			String title=driver.getTitle();
			if(title.equalsIgnoreCase("swara")) {
				driver.close();
				break;
			}
		}
		
		System.out.println("Done");
		
	
	}
}
