package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarItems {

  WebElement logo;
  WebElement login;
  WebElement miniCart;
  WebElement trashBinButtonInMiniCart;
  WebElement okForremoveItemPopUp;

  public WebElement getLogo(WebDriver driver) {
    logo =
      driver.findElement(
        By.xpath("/html/body/div[2]/header/div[2]/div/div/div[1]/a")
      );
    return logo;
  }

  public WebElement getLogin(WebDriver driver) {
    login =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/header/div[2]/div/div/div[3]/div/a[2]/span[2]"
        )
      );
    return login;
  }

  public WebElement getMiniCart(WebDriver driver) {
    miniCart =
      driver.findElement(
        By.xpath("/html/body/div[2]/header/div[2]/div/div/div[3]/span/div")
      );
    return miniCart;
  }

  public WebElement getTrashBinButtonInMiniCart(WebDriver driver) {
    trashBinButtonInMiniCart =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/header/div[2]/div/div/div[3]/span/div/div/div/div/div[2]/div[4]/ol/li/div/div/div[3]/div[2]/a"
        )
      );
    return trashBinButtonInMiniCart;
  }

  public WebElement getOkForRemoveItemPopUp(WebDriver driver) {
    okForremoveItemPopUp =
      driver.findElement(
        By.xpath("/html/body/div[6]/aside[2]/div[2]/footer/button[2]/span")
      );
    return okForremoveItemPopUp;
  }
}
