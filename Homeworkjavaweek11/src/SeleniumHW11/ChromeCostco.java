package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeCostco {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.costco.co.uk");
    }
}
