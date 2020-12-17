package ScrollDownTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.TesseractException;

public class Scrolldown {
	public static void main(String[] args) throws TesseractException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\selenium softy\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://captcha.com/doc/php/howto/wp/wordpress-login-captcha.html");

	//scrolling by using javascriptexecuter
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
	  
//		
//		//by using find elemnet
//		WebElement el=driver.findElement(By.xpath("//*[contains(text(),'Contact Form 7 CAPTCHA')]"));
//		js.executeScript("arguments[0].scrollIntoView();", el);
		
		//by bottom pf page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(4000);
		driver.close();
	//sucessfully loaded to github
		//uploaded to new branch
	}
}
