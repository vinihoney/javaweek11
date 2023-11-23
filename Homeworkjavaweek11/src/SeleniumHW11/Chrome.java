package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

   public class Chrome {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            WebDriver driver = new ChromeDriver();
            driver.get("http://nopcommerce.com/");
            String titleofpage = driver.getTitle();
            System.out.println(titleofpage);
            driver.manage().window().getSize();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
        }
    }
