package Excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram {
	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.edge.driver","C:\\Users\\kanch\\eclipse-workspace\\FileOperation\\target\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		String url = "https://www.instagram.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement username = driver.findElement(By.name("username"));
        Actions actions = new Actions(driver);
        actions.sendKeys(username, "Kanchana").perform();
        actions.doubleClick(username).perform();
        actions.contextClick(username).perform();

        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(300);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
          actions.sendKeys("password").perform();

        Thread.sleep(3000);
        driver.quit();
    }

}