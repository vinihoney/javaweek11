package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMac {
    public static void main(String[] args) {
        System.out.println("Welcome on Mac Makeup");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.maccosmetics.co.uk/");
    }
}
