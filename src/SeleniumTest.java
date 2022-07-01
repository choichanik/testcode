import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_for72.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://uat.rm1.co.kr";
		//String baseUrl = "http://localhost:8080/p00/A0001M000.nice";

		driver.get(baseUrl); //웹페이지 연결

		String mainpage = driver.getWindowHandle(); //부모창 구하기
		for (String handle : driver.getWindowHandles()) { //팝업창이 열릴 경우 부모창의 ID와 비교하여 전부 닫아버림
			if( !handle.equals(mainpage)) {
				driver.switchTo().window(handle).close();
			}
		}

		driver.switchTo().window(mainpage); //부모창으로 다시 포커싱
		driver.switchTo().frame(0); //rm1의 경우 frame으로 감싸서 사용하므로 frame의 첫번째(0)으로 지정해주어야함

		//ID입력
		WebElement id_input = driver.findElement(By.id("user_id"));
		id_input.sendKeys("abc2185");

		Thread.sleep(500);

		//비밀번호 입력
		WebElement pw_input = driver.findElement(By.id("user_pw"));
		pw_input.sendKeys("a963852&");

		Thread.sleep(500);

		//로그인버튼 클릭
		WebElement lgn_vtn = driver.findElement(By.id("submit"));
		lgn_vtn.click();

		Thread.sleep(500);

		//driver.switchTo().frame(""); //rm1의 경우 frame으로 감싸서 사용하므로 frame의 첫번째(0)으로 지정해주어야함

		//Thread.sleep(500);

		//기업검색
		WebElement searchTxt_input = driver.findElement(By.id("searchTxt"));
		searchTxt_input.sendKeys("삼성전자");

		//기업검색 실행
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();

		//검색 결과 확인 (갯수)
		WebElement eprcnt = driver.findElement(By.xpath("//*[@id=\"schResultCmpName\"]/table/tbody/tr"));
		System.out.println("eprcnt>>"+eprcnt.getText());
		System.out.println("eprcnt>>"+eprcnt.getSize());

		WebElement eprcnt2 = driver.findElement(By.cssSelector("#schResultCmpName > table > tbody > tr"));
		System.out.println("eprcnt>>"+eprcnt2.getText());
		System.out.println("eprcnt>>"+eprcnt2.getSize());
		//driver.close();
	}
}
