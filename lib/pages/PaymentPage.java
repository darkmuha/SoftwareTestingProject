package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

  WebElement paypal;

  public WebElement getPaypal(WebDriver driver) {
    paypal =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[6]"
        )
      );
    return paypal;
  }
}
