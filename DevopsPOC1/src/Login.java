import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ravi_Old_Backup\\ravik\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.name("email")).sendKeys("testuser901@test.com");
		driver.findElement(By.id("passwd")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		Myaddress m = new Myaddress();
		m.newaddress();
	    }
	
	}


