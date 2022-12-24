import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class payment_type_change {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proswimwear.co.uk/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Homepage homePage = new Homepage();

        helper_method help = new helper_method();
        help.scrollToHomePageProducts(driver);

        help.clickFirstAddToCart(driver);

        help.selectFirstProductFirstSize(driver);

        help.clickFirstProductAddToCart(driver);

        Thread.sleep(10000);
        help.clickProceedToCheckOut(driver);
        Thread.sleep(3000);

        help.fillEmail(driver);
        help.fillFirstName(driver);
        help.fillLastName(driver);
        help.fillStreetAddress(driver);
        help.selectDropDownForCountry(driver);
        help.fillCity(driver);
        help.fillPostalCode(driver);
        help.fillPhoneNumber(driver);

        Thread.sleep(10000);

        help.clickNextInShipping(driver);

        Thread.sleep(10000);

        help.selectCredit(driver);
        help.generalScroll(driver);
        Thread.sleep(10000);
        help.selectAlipay(driver);
    }
}
