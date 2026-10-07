package fireboxdriversamplebasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazoneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Website ready to launch");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

	}

}
