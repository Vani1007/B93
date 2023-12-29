package day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//How do u handle alert pop-up in POM
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample9.html?");
		driver.findElement(By.id("A1")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
	}

}
