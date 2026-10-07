package fireboxdriversamplebasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Website ready to launch");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

	}

}
