package Week5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSortable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
	    List<WebElement> Item=driver.findElements(By.xpath("//div[@id='mydiv']//li"));
	    WebElement Item2=Item.get(1);
	    WebElement Item7=Item.get(6);
	    Actions build=new Actions(driver);
	    build.clickAndHold(Item2).moveToElement(Item7).release().perform();
	    
	}

}
