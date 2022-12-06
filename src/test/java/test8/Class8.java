package test8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class8 {
	public static WebDriver driver;

	@Test
	public void MoE() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");

		List<WebElement> FaceBooklinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: " + FaceBooklinks.size());

		for (int i = 0; i < FaceBooklinks.size(); i++) {
			WebElement AllLinks = FaceBooklinks.get(i);
			System.out.println(AllLinks.getText() + "---" + AllLinks.isEnabled() + "---" + AllLinks.getAttribute("href"));

		}

		WebElement TenthLink = FaceBooklinks.get(10);
		System.out.println(TenthLink.getText() + "---" + TenthLink.isEnabled() + "---" + TenthLink.getAttribute("href"));
		System.out.println(TenthLink.getLocation());
		driver.quit();

	}
}
