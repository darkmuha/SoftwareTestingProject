package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

  WebElement firstAddToCart;
  WebElement secondAddToCart;

  public WebElement getFirstAddToCart(WebDriver driver) {
    firstAddToCart =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[4]/div[2]/div/ol/div/div[1]/div/div[5]/li/div/div[1]/div/div[1]/form/button/span"
        )
      );
    return firstAddToCart;
  }

  public WebElement getSecondAddToCart(WebDriver driver) {
    secondAddToCart =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[4]/div[2]/div/ol/div/div[1]/div/div[6]/li/div/div[1]/div/div[1]/form/button/span"
        )
      );
    return secondAddToCart;
  }
}
