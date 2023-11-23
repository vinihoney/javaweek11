package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBBC {
public static void  main(String[] args){
    WebDriver driver = new ChromeDriver();
    driver.get("http://bbc.co.uk");
}
}
