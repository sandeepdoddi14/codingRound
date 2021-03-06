import com.sun.javafx.PlatformUtil;

import PageObjects.HotelBookingPageObject;
import Utils.DriverFactoy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends HotelBookingPageObject {

	@Test
	public void shouldBeAbleToSearchForHotels() {
		String locality = "Indiranagar, Bangalore";
		String travellerSection = "1 room, 2 adults";

		clickHotelLink();
		sendLocalityTextBox(locality);
		selectTravellerSection(travellerSection);
		clickonSearch();
	}

}
