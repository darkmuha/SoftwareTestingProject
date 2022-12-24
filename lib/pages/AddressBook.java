package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook {

  WebElement changeBillingAddress;

  public WebElement getChangeBillingAddress(WebDriver driver) {
    changeBillingAddress =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a"
        )
      );
    return changeBillingAddress;
  }
}
