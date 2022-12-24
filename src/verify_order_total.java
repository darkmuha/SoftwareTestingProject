import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_order_total {

  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/");
    driver.manage().window().maximize();

    Thread.sleep(3000);
    driver.navigate().refresh();

    helper_method help = new helper_method();
    help.getItemsInShoppingCart(driver);

    double CalculatedOrderTotal = help.calculateOrderTotal(driver);

    help.clickEstimateShippingAndTax(driver);
    Thread.sleep(2000);

    help.selectTaxCountryDropDown(driver);
    Thread.sleep(1000);

    help.fillTaxState(driver);
    help.fillTaxPostalCode(driver);
    Thread.sleep(8000);

    help.clickFirstRadioButtonTaxShipping(driver);
    Thread.sleep(8000);

    double shippingAndTaxes = help.getShippingAndTaxesDouble(driver);
    double orderTotal = help.getOrderTotalDouble(driver);
    System.out.println("############################################");
    if (
      CalculatedOrderTotal + shippingAndTaxes == orderTotal
    ) System.out.println("Success!");
    // System.out.println(OrderTotal.getText());
    else System.out.println("Failed!");

    System.out.println("############################################");
  }
}
