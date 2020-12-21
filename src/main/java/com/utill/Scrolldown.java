package com.utill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown {
	@JiraPolicy(logTicketReady=true)

	@Test
	public void scroll() {
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
		js.executeScript("windo.scrollTo(0,document.body.scrollHeight)");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	//sucessfully loaded to github
	}
}
