package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstProductpage {

  WebElement firstSize;
  WebElement addToCart;
  WebElement plus;

  public WebElement getFirstSize(WebDriver driver) {
    firstSize =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div/div/div[1]"
        )
      );
    return firstSize;
  }

  public WebElement getQuantityPlus(WebDriver driver) {
    plus =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[1]/div/div/button[2]/img"
        )
      );
    return plus;
  }

  public WebElement getAddToCart(WebDriver driver) {
    addToCart =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[2]/button/span"
        )
      );
    return addToCart;
  }
}
