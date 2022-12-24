package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

  WebElement username;
  WebElement password;
  WebElement signin;

  public WebElement getUsername(WebDriver driver) {
    username =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[2]/form/fieldset/div[2]/div/input"
        )
      );
    return username;
  }

  public WebElement getPassword(WebDriver driver) {
    password =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[2]/form/fieldset/div[3]/div/input"
        )
      );
    return password;
  }

  public WebElement getSignin(WebDriver driver) {
    signin =
      driver.findElement(
        By.xpath(
          "/html/body/div[2]/main/div[2]/div/div[2]/div[1]/div[2]/form/fieldset/div[7]/div[1]/button"
        )
      );
    return signin;
  }
}
