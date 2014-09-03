import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.firefox.internal.*;
public class TestProkarma {

	@Test
	public void homeScreen(){
		
		
		WebDriver driver = new FirefoxDriver(); 
		

		driver.manage().window().maximize();  
		driver.get("http://www.prokarma.com"); 	 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		WebElement services = driver.findElement(By.className("menu-832"));
		Actions action = new Actions(driver);	   	
		action.clickAndHold(services).perform();//Clicks and holds the mouse pointer for the given amount of time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement analytics = driver.findElement(By.className("menu-1032"));
		analytics.click();
		
		WebElement bigdata = driver.findElement(By.className("content"));
		bigdata.click();

		WebElement industriesweserve = driver.findElement(By.className("boxSec2"));
		List<WebElement> servedind = industriesweserve.findElements(By.tagName("li"));
		System.out.println("\n The total number of elements present are :" +servedind.size());
		System.out.println("\n The elements present are : \n" +industriesweserve.getText());
		
		for(int i=0;i<servedind.size();i++)
		{   
			WebElement industry = driver.findElement(By.className("boxSec2"));
			
		    industry.findElements(By.tagName("li")).get(i).click();
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.navigate().back();	    
	}}
	public static void main(String[] args) {
		      TestProkarma tobj=new TestProkarma();
       tobj.homeScreen();
	}

}
