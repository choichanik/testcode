import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest_spica {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_for72.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		//chromeOptions.setExperimentalOption("excludeSwitches","enable-automation");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String baseUrl = "https://mediauat.kisline.com";
		//String baseUrl = "http://localhost:8080";

		driver.get(baseUrl); //웹페이지 연결

		//검색어 입력
		WebElement id_input = driver.findElement(By.id("name"));
		id_input.click();
		id_input.sendKeys("삼성");

		Thread.sleep(500);

		//검색버튼 클릭
		WebElement pw_input = driver.findElement(By.id("search"));
		pw_input.click();

		Thread.sleep(500);

		WebElement object_no1 = driver.findElement(By.cssSelector("#container > ul > li:nth-child(1) > a"));
		object_no1.click();

		Thread.sleep(500);

		WebElement regname = driver.findElement(By.cssSelector("#container > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
		System.out.println("대표이사>>"+regname.getText());

		driver.close();
	}
}
