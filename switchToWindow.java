package testRD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		//WebElement newTab = driver.findElement(By.id("new-tab-button"));
		
		WebElement newTab1 = driver.findElement(By.xpath("//button[@id=\"new-tab-button\"]"));
		
		newTab1.click();
		
		String OriginalWindow = driver.getWindowHandle();
		
		System.out.println(OriginalWindow);
		
		System.out.println(driver.getWindowHandles());
		
		for(String handle1:driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		
		driver.switchTo().window(OriginalWindow);
		
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.accept();
		
		//driver.quit();
				
	}
	

}
