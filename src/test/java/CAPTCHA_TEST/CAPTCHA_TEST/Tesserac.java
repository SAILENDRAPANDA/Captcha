package CAPTCHA_TEST.CAPTCHA_TEST;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Tesserac {
	 public static void main(String[] args) 
	    { 
	        ITesseract tesseract = new Tesseract(); 
	        try { 
	  
	            tesseract.setDatapath("C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\tessdata"); 
	  
	            // the path of your tess data folder 
	            // inside the extracted file 
	            String text 
	                = tesseract.doOCR(new File("C:\\Users\\Public\\Documents\\IDENEW\\CAPTCHA_TEST\\src\\test\\java\\CAPTCHA_TEST\\CAPTCHA_TEST\\New1.png")); 
	  
	            // path of your image file 
	            System.out.print(text); 
	            String t=text.replaceAll(" ","");
	            System.out.println(t);
	        } 
	        catch (TesseractException e) { 
	            e.printStackTrace(); 
	        } 
	    } 
}