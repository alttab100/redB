package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPageObjects {

	public static WebElement element;
	public static List<WebElement> elements;
	public static WebDriverWait wait;
	
	public static WebElement From(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='src']"));
		return element;
	}
	
	public static WebElement To(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='dest']"));
		return element;
	}
	

	public static WebElement Onward1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[3]"));
		return element;
	}
	
	
	
	public static WebElement Onward(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='onward_cal']"));
		return element;
	}
	
	public static WebElement OnwardDate(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[2]"));
		return element;
	}
	public static WebElement Return(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[5]"));
		return element;
	}
	
	public static WebElement ReturnDate(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[3]"));
		return element;
	}
	
	public static WebElement Search(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='search_btn']"));
		return element;
	}
	
	public static WebElement Viewseats(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='buses_viewonward']/div/ul/li[2]/div[1]/div/div[1]/div[7]/div[2]/button"));
		return element;
	}
	

	public static WebElement seat(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='buses_viewonward']/div/ul/li[2]/div[2]/div[1]/div[1]/div/div/div/div[3]/div[2]/div[2]/canvas"));
		return element;
	}
}



