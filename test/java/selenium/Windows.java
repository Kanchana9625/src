package selenium;
import java.util.*;
    
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import java.util.List;

	public class Windows {
		
	    public static void main(String[] args) {                              // this is Set path for EdgeDriver
	    
	        System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\kanch\\\\eclipse-workspace\\\\FileOperation\\\\target\\\\msedgedriver.exe");

	        WebDriver driver = new EdgeDriver();                               // we are Initialize the EdgeDriver

	        driver.get("https://demo.guru99.com/test/web-table-element.php");                 // Open the demo web table

	        
	        WebElement table = driver.findElement(By.tagName("table"));                        // Locate the table
	        WebElement tbody = table.findElement(By.tagName("tbody"));

	        List<WebElement> trows = tbody.findElements(By.tagName("tr"));

	        for (int i = 0; i < trows.size(); i++) {
	            WebElement row = trows.get(i);
	            List<WebElement> tdata = row.findElements(By.tagName("td"));

	            for (int j = 0; j < tdata.size(); j++) {
	                String text = tdata.get(j).getText();
	                
	                System.out.println(text); 
	            }}}
	}

	
	
	

