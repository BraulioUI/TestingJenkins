package Primero;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Auxiliar {

	@Test
	
	public void HtmlUnitTest() {
		
		HtmlUnitDriver Htddriver = new HtmlUnitDriver();
		Htddriver.get("https://www.google.com/");
		String pagetitle = Htddriver.getTitle();
		System.out.println(pagetitle);
		
	}
@Test
	
	public void HtmlUnitTest2() {
		
		HtmlUnitDriver Htddriver2 = new HtmlUnitDriver();
		Htddriver2.get("https://www.facebook.com/");
		String pagetitle2 = Htddriver2.getTitle();
		System.out.println(pagetitle2);
		
	}
}
