import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class valid_login_test {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proswimwear.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();

        helper_method help = new helper_method();

        help.clickOnTheLogin(driver);
        help.fillUsername(driver);
        help.fillPassword(driver);
        help.clickOnSignIn(driver);

    }
}
