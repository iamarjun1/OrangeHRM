package new1.new1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*
		 * List<WebElement> huhu = driver.findElements(By.tagName("a")); int count =
		 * huhu.size(); System.out.println(count); for (int i=1; i<count;i++)
		 * System.out.println(huhu.get(i).getAttribute("href"));
		 */
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewAdminModule");
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[2]")).sendKeys("Arjun001");
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input' and contains(text(),'Admin')]")).click();
		
	}
	
	
	
}
