
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownFunc {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proswimwear.co.uk/");
        driver.manage().window().maximize();

    // Cast the driver to a JavascriptExecutor
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll down the page 4000 pixels
    js.executeScript("window.scrollBy(0, 4000)");

    // Perform any verifications here to ensure that the page functions correctly when scrolled

    // Navigate to the login page
    driver.get("https://www.proswimwear.co.uk/customer/account/login/referer/aHR0cHM6Ly93d3cucHJvc3dpbXdlYXIuY28udWsvY3VzdG9tZXIvYWNjb3VudC9pbmRleC8%2C/");

    // Find the username and password elements and enter the login credentials
    WebElement emailElement = driver.findElement(By.id("email"));
    WebElement passwordElement = driver.findElement(By.id("pass"));
    emailElement.sendKeys("chinnu@gmail.com");
    passwordElement.sendKeys("riya!123");

    // Find the login button and click it
    WebElement signinButton = driver.findElement(By.id("send2"));
    signinButton.click();
    }
}
