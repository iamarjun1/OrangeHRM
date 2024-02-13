package new1.new1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
    public static void main(String[] args) throws Exception {
    
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewAdminModule");
        driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[2]")).sendKeys("Arjun001");
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='oxd-select-option' ])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("sha");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='fgasgrndahfsnhrfw  snnjtfc ']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='oxd-select-option'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
    }
    
    
    
}