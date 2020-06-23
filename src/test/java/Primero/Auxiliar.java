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
}
