package Week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mensfashion {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		driver.findElement(By.name("keyword")).sendKeys("Sports Shoes");
		driver.findElement(By.className("searchTextSpan")).click();
		String ele=driver.findElement(By.xpath("//div[@class='sub-cat-count ']")).getText();
		System.out.println(ele);
	    String title=driver.getTitle();
	    System.out.println(title);
		
	}

		
}
