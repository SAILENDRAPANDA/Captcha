package CAPTCHA_TEST.CAPTCHA_TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MatchCaptcha {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\selenium softy\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://www.chronoengine.com/faqs/55-chronoforms/cfv4/cfv4-anti-spam/2573-how-can-i-use-a-captcha-like-134");

			String s1=driver.findElement(By.xpath("//*[@class='item-page']//h2")).getText();
	 System.out.println(s1);		
		String n[]=s1.split(" ");
		String s2=n[0];
		System.out.println(s2);
		
		String s3=n[1];
		System.out.println(s3);
		
		String s4=n[2];
		System.out.println(s4);
		
		String s5=n[3];
		System.out.println(s5);
		
		String s6=n[4];
		System.out.println(s6);
		
		String s7=n[5];
		System.out.println(s7);
		
		String s8=n[6];
		System.out.println(s8);
		
		String s9=n[7];
		System.out.println(s9);
		
		String sn1=s9.substring(0, 1);
		System.out.println(sn1);
		
		String sn2=s9.substring(2,3);
		System.out.println(sn2);
		
		int i1=Integer.valueOf(sn1);
		int i2=Integer.valueOf(sn2);
		int i3=i1+i2;
		
		String mainString=String.valueOf(i3);
		System.out.println(i3);
		
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys(mainString);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 //this is for mathematical captcha only
	 
	 driver.close();
	}

}
