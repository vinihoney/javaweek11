package SeleniumHW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args){
        System.out.println("Hi");
        WebDriver driver=new EdgeDriver();
        driver.get("http://mac.com");
    }

}
