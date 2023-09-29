package seleniumscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('datepicker').value='11/12/2024'");

	}

}