package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeNeasden {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://londonmandir.baps.org/");
    }
}
