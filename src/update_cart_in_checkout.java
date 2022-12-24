import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class update_cart_in_checkout {

  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/");
    driver.manage().window().maximize();

    Thread.sleep(3000);
    driver.navigate().refresh();

    helper_method help = new helper_method();
    help.getItemsInShoppingCart(driver);

    help.clickTrashBinOfSecondItem(driver);
    help.changeFirstItemQuantityToTwo(driver);
    help.clickUpdateShoppingCart(driver);
  }
}
