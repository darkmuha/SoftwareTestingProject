package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {

  WebElement email;
  WebElement firstName;
  WebElement lastName;
  WebElement streetAddress;
  Select country;
  WebElement city;
  WebElement postalCode;
  WebElement phoneNumber;
  WebElement next;

  public WebElement getInputForEmail(WebDriver driver) {
    email =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input"
        )
      );
    return email;
  }

  public WebElement getInputForFirstName(WebDriver driver) {
    firstName =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input"
        )
      );
    return firstName;
  }

  public WebElement getInputForLastName(WebDriver driver) {
    lastName =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"
        )
      );

    return lastName;
  }

  public WebElement getInputForStreetAddress(WebDriver driver) {
    streetAddress =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input"
        )
      );

    return streetAddress;
  }

  public Select getDropDownForCountry(WebDriver driver) {
    country =
      new Select(
        driver.findElement(
          By.xpath(
            "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/select"
          )
        )
      );

    return country;
  }

  public WebElement getInputForCity(WebDriver driver) {
    city =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input"
        )
      );

    return city;
  }

  public WebElement getInputForPostalCode(WebDriver driver) {
    postalCode =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/input"
        )
      );

    return postalCode;
  }

  public WebElement getInputForPhoneNumber(WebDriver driver) {
    phoneNumber =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input"
        )
      );

    return phoneNumber;
  }

  public WebElement getNextButton(WebDriver driver) {
    next =
      driver.findElement(
        By.xpath(
          "/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"
        )
      );

    return next;
  }
}
