package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        System.out.println("with firefox");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://tesco.com");

        String titleofpage = driver.getTitle();
        System.out.println(titleofpage);
        driver.manage().window().getSize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
    }
}
