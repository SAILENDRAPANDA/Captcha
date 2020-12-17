package CAPTCHA_TEST.CAPTCHA_TEST;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.asprise.ocr.Ocr;
import com.asprise.ocr.sample.*;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captcha {

	public static void main(String[] args) throws TesseractException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\selenium softy\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	//driver.get("https://captcha.com/doc/php/howto/wp/wordpress-login-captcha.html");
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
//	WebElement ele=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
//	new WebDriverWait(driver,20 ).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(ele));
//	
	
	driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'LOGIN')]")).click();

	
	
	driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("12354");
//	driver.switchTo().frame(0);
File screenshot=driver.findElement(By.xpath("//*[@id='nlpImgContainer']")).getScreenshotAs(OutputType.FILE);
//	
File screenshotLocation = new File("C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\New7.png");
FileUtils.copyFile(screenshot, screenshotLocation);
ITesseract img= new Tesseract();
img.setDatapath("C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\tessdata");

String imgtxt=img.doOCR(screenshotLocation);
//
System.out.println(imgtxt);

//String s1[]=imgtxt.split("below");
//
//String s3=s1[0];
//String s2=s1[1];
//
//System.out.println(s2);


	
//File scr=driver.findElement(By.xpath("//*[@src='../../../../images/captcha/180/botdetect-captcha-rough.jpg']")).getScreenshotAs(OutputType.FILE);
//String path="C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\New6.png";
////
//String url=driver.findElement(By.xpath("//*[@id='image_examples']//div[1]//img")).getAttribute("src");
//System.out.println(url);
//
//URL imglg=new URL(url);
//BufferedImage svimg=ImageIO.read(imglg);
//ImageIO.write(svimg, "png", new File(path));
//
////JOptionPane.showInputDialog("goos to go");
//
////FileUtils.copyFile(scr2, new File(path));
//ITesseract img=new Tesseract();
//img.setDatapath("C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\tessdata");
//String imgtxt=img.doOCR(new File(path));
//
//	System.out.println(imgtxt);
	driver.close();
	}}