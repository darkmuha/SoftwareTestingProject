import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class remove_item_from_cart {

  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.navigate().refresh();

    helper_method help = new helper_method();
    help.getItemsInShoppingCart(driver);

    help.clickOnTheLogo(driver);

    help.clickOnTheMiniCart(driver);
    Thread.sleep(2000);
    help.clickOnMiniCartTrash(driver);

    List<WebElement> ItemsBeforeItemDeleted = driver.findElements(
      By.cssSelector("#mini-cart > li.item.product.product-item")
    );
    Thread.sleep(1000);

    help.clickOkToRemoveItemPopUp(driver);

    Thread.sleep(15000);
    List<WebElement> ItemsAfterItemDeleted = driver.findElements(
      By.cssSelector("#mini-cart > li.item.product.product-item")
    );
    System.out.println("############################################");
    if (
      ItemsAfterItemDeleted.size() == ItemsBeforeItemDeleted.size() - 1
    ) System.out.println("Item Deleted"); else System.out.println(
      "Item Not Deleted"
    );
    System.out.println("############################################");
  }
}
