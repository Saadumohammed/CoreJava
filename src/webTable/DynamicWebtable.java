package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {
	public static WebDriver driver;
	
	public static void browserLaunch() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.worldometers.info/coronavirus/");
	}

		 private static void getAllData() {
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(int i =0; i<=alldata.size();i++) {
			String text = alldata.get(i).getText();
			System.out.println(text);
		}
	}	
		 
		public static void particularData()
		{		
			List<WebElement> Population = driver.findElements(By.xpath("//table/tbody/tr[7]/td[15]"));
			for(int i =0;i<Population.size();i++) {
			String IndianPopulation = Population.get(i).getText();
			System.out.println(IndianPopulation);
			}
		}
		
	public static void particularRow() {
		List<WebElement> countryIndia = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement name : countryIndia) {
			System.out.println("No of Countries : "+name.getText());
		}
		
	}
	public static void main(String[] args) {
		browserLaunch();
		//getAllData();
		particularData();
		particularRow();
	}
}
