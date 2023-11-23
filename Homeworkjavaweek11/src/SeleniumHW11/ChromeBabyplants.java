package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBabyplants {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://plnts.com/");
    }
}

