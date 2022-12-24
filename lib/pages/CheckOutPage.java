package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

  WebElement proceedToCheckOut;
  WebElement itemQuantityOfFirstItem;
  WebElement trashBinOfSecondItem;
  WebElement updateShoppingCart;
  List<WebElement> itemsQuantity;
  List<WebElement> subTotals;
  WebElement estimateShippingAndTax;
  Select country;
  WebElement state;
  WebElement postalCode;
  WebElement firstRadioTaxShipping;
  WebElement shippingAndTaxes;
  WebElement orderTotal;

  public WebElement getProceedCheckOut(WebDriver driver) {
    proceedToCheckOut =
      driver.findElement(
        By.cssSelector(
          "#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li > button"
        )
      );
    return proceedToCheckOut;
  }

  public WebElement getItemQuantityOfFirstItem(WebDriver driver) {
    itemQuantityOfFirstItem =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/label/input"
        )
      );
    return itemQuantityOfFirstItem;
  }

  public WebElement getTrashBinOfSecondItem(WebDriver driver) {
    trashBinOfSecondItem =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/form/div[1]/table/tbody[2]/tr[2]/td/div/a[2]"
        )
      );
    return trashBinOfSecondItem;
  }

  public WebElement getUpdateShoppingCart(WebDriver driver) {
    updateShoppingCart =
      driver.findElement(
        By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/form/div[2]/button")
      );
    return updateShoppingCart;
  }

  public List<WebElement> getSubTotals(WebDriver driver) {
    subTotals =
      driver.findElements(
        By.cssSelector(
          "#shopping-cart-table > tbody > tr.item-info > td.col.price > span > span > span"
        )
      );
    return subTotals;
  }

  public List<WebElement> getItemsQuantity(WebDriver driver) {
    itemsQuantity =
      driver.findElements(
        By.cssSelector(
          "#shopping-cart-table > tbody > tr.item-info > td.col.qty > div > div  > label > input"
        )
      );
    return itemsQuantity;
  }

  public WebElement getEstimateShippingAndTax(WebDriver driver) {
    estimateShippingAndTax =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div[1]"
        )
      );
    return estimateShippingAndTax;
  }

  public Select getDropDownForCountry(WebDriver driver) {
    country =
      new Select(
        driver.findElement(
          By.xpath(
            "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div[2]/form[1]/fieldset/div[1]/div/select"
          )
        )
      );
    return country;
  }

  public WebElement getState(WebDriver driver) {
    state =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div[2]/form[1]/fieldset/div[3]/div/input"
        )
      );
    return state;
  }

  public WebElement getPostalCode(WebDriver driver) {
    postalCode =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div[2]/form[1]/fieldset/div[4]/div/input"
        )
      );
    return postalCode;
  }

  public WebElement getFirstRadioButtonTaxShipping(WebDriver driver) {
    firstRadioTaxShipping =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[1]/div[2]/form[2]/fieldset/dl/dd/div[1]/input"
        )
      );
    return firstRadioTaxShipping;
  }

  public WebElement getShippingAndTaxes(WebDriver driver) {
    shippingAndTaxes =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td/span"
        )
      );
    return shippingAndTaxes;
  }

  public WebElement getOrderTotal(WebDriver driver) {
    orderTotal =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span"
        )
      );
    return orderTotal;
  }
}
