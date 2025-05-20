import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
    WebDriver driver;
    //public static void main(String[] args) {
        //System.out.println("Hello, WebDriver!");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://skryabin.com/market/quote.html");
//        driver.quit();
       // or
    @BeforeEach
    public void before(){
        System.out.println("beforeEach1");
        driver = new ChromeDriver();
    }
    @AfterEach
    public void after() {
        System.out.println("afterEach1");
        driver.quit();
    }
    @DisplayName("Quote Test")
        @Test
        public void quoteTest() {
            System.out.println("quoteTest");
            driver.get("https://skryabin.com/market/quote.html");
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test");

        }
        @DisplayName("Another Test")
        @Test
        public void anotherTest() {
            System.out.println("anotherTest");
            driver.get("https://skryabin.com/market/quote.html");
            driver.findElement(By.id("formSubmit")).click();

        }



    }

