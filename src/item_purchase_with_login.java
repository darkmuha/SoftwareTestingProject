import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class item_purchase_with_login {
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
        help.clickOnTheLogo(driver);

        // login: complete
        help.scrollToHomePageProducts(driver);

        help.clickFirstAddToCart(driver);

        help.selectFirstProductFirstSize(driver);

        help.clickFirstProductAddToCart(driver);

        Thread.sleep(10000);
        help.clickProceedToCheckOut(driver);
        Thread.sleep(3000);

        // help.fillEmail(driver);
        // help.fillFirstName(driver);
        // help.fillLastName(driver);
        help.generalScroll(driver);
        help.LoginfillStreetAddress(driver);
        help.LoginselectDropDownForCountry(driver);
        help.LoginfillCity(driver);
        help.LoginfillPostalCode(driver);
        help.LoginfillPhoneNumber(driver);

        Thread.sleep(10000);

        help.clickNextInShipping(driver);

        Thread.sleep(10000);

        help.selectCredit(driver);
        // help.generalScroll(driver);
    }

}
