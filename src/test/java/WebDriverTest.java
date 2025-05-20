import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;

    @BeforeEach
    public void before() {
        System.out.println("beforeEach");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void after() {
        System.out.println("afterEach");
        driver.quit();
    }

    @DisplayName("Quote Test")
    @Test
    public void quoteTest() {
        System.out.println("quoteTest");
        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jdoe");
    }

    @DisplayName("Another Test")
    @Test
    public void anotherTest() {
        System.out.println("anotherTest");
        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.id("formSubmit")).click();
    }

    @DisplayName("And Yet Another Test")
    @Test
    public void andYetAnotherTest() {
        System.out.println("Yet AnotherTest");
        driver.get("https://skryabin.com/market/another-quote.html");
        driver.findElement(By.id("formSubmit2")).click();
    }
}
