import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_change_billing_address {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.navigate().refresh();

    // Homepage homePage = new Homepage();

    helper_method help = new helper_method();

    help.loginToAccount(driver);

    help.clickAddressBook(driver);

    Thread.sleep(1000);

    help.clickChangeBillingAddress(driver);

    Thread.sleep(3000);
    help.fillNewFirstName(driver);
    help.fillNewLastName(driver);
    help.fillNewStreetAddress(driver);
    help.selectNewDropDownForCountry(driver);
    help.selectNewDropDownForState(driver);
    help.fillNewCity(driver);
    help.fillNewPostalCode(driver);
    help.fillNewPhoneNumber(driver);

    help.clickSaveAddress(driver);
  }
}
