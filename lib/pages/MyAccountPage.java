package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

  WebElement addressBook;

  public WebElement getAddressBook(WebDriver driver) {
    addressBook =
      driver.findElement(
        By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div[2]/ul/li[5]/a")
      );
    return addressBook;
  }
}
