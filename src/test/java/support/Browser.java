package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void init(String  browserName){
        switch(browserName) {
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
        }
    }

    public static void teardown(){
        driver.quit();
    }
}
