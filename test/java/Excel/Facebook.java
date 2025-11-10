package Excel;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","C:\\Users\\kanch\\eclipse-workspace\\FileOperation\\target\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		//driver.get("https://www.facebook.com/");//only url passing
		//driver.manage().window().maximize();
	
		
		
		String name= "https://www.facebook.com/";//it wont wait
		driver.get(name);
		driver.switchTo().newWindow(WindowType.TAB);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(name.equals(currentUrl));
		     System.out.println("url is matched");
	}
	    
		
	
	}

