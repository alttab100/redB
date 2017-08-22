package TestModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import ConfigFiles.Constants;
import ConfigFiles.ScreencastCapturing;
import ConfigFiles.XLHandlingMethods;


public class BookingActions {
	
	public static String FromLocation;
	public static String ToLocation;
	
	public static void execute(WebDriver driver)
	{
		// Entering the values in the Registration form using XLS file
				try {
					Reporter.log("Enter values in all the fields and clicked on search button successfully");

					int rowcount = XLHandlingMethods.rowcount();
					System.out.println("rowcount" + rowcount);
					for (int k = 1; k < rowcount + 1; k++) {

						FromLocation = XLHandlingMethods.readdata(k, 0);
						PageObjects.BookingPageObjects.From(driver).click();
						PageObjects.BookingPageObjects.From(driver).sendKeys(FromLocation);
						Thread.sleep(2000);
						ScreencastCapturing.Snapshot(driver, "From");
						
						ToLocation = XLHandlingMethods.readdata(k, 1);
						PageObjects.BookingPageObjects.To(driver).click();
						PageObjects.BookingPageObjects.To(driver).sendKeys(ToLocation);
						Thread.sleep(2000);
						ScreencastCapturing.Snapshot(driver, "To");
						Thread.sleep(3000);
						PageObjects.BookingPageObjects.To(driver).sendKeys(Keys.ENTER);
						
						
						Thread.sleep(2000);
						PageObjects.BookingPageObjects.Onward1(driver).click();
						Thread.sleep(1000);
						ScreencastCapturing.Snapshot(driver, "Onwarddate is selected");
						//PageObjects.BookingPageObjects.Onward1(driver).sendKeys(Keys.TAB);
						Thread.sleep(2000);
						
						//PageObjects.BookingPageObjects.Return(driver).click();
						//Thread.sleep(3000);
						//ScreencastCapturing.Snapshot(driver, "Returndate is selected");
						//PageObjects.BookingPageObjects.ReturnDate(driver).click();
						//Thread.sleep(2000);
						//ScreencastCapturing.Snapshot(driver, "searchpage");
						PageObjects.BookingPageObjects.Search(driver).click();
						Thread.sleep(2000);
						ScreencastCapturing.Snapshot(driver, "Buses");
						PageObjects.BookingPageObjects.Viewseats(driver).click();
						Thread.sleep(2000);
						PageObjects.BookingPageObjects.seat(driver).click();
						
						
	}
				} catch (Exception e) {
					Reporter.log("Registration Not done successfully" + e);
					}

				}}
