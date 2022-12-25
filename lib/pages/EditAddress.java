package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAddress {

  WebElement firstName;
  WebElement lastName;
  WebElement streetAddress;
  Select country;
  Select state;
  WebElement city;
  WebElement postalCode;
  WebElement phoneNumber;
  WebElement save;

  public WebElement getInputForFirstName(WebDriver driver) {
    firstName = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[1]/div[1]/div/input"));
    return firstName;
  }

  public WebElement getInputForLastName(WebDriver driver) {
    lastName = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[1]/div[2]/div/input"));

    return lastName;
  }

  public WebElement getInputForStreetAddress(WebDriver driver) {
    streetAddress = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[1]/div/input"));

    return streetAddress;
  }

  public Select getDropDownForCountry(WebDriver driver) {
    country = new Select(
        driver.findElement(
            By.xpath(
                "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[2]/div/select")));

    return country;
  }

  public Select getDropDownForState(WebDriver driver) {
    state = new Select(
        driver.findElement(
            By.xpath(
                "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[3]/div/select")));

    return state;
  }

  public WebElement getInputForCity(WebDriver driver) {
    city = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[4]/div/input"));

    return city;
  }

  public WebElement getInputForPostalCode(WebDriver driver) {
    postalCode = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[5]/div/input"));

    return postalCode;
  }

  public WebElement getInputForPhoneNumber(WebDriver driver) {
    phoneNumber = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[1]/div[4]/div/input"));

    return phoneNumber;
  }

  public WebElement getSaveAddress(WebDriver driver) {
    save = driver.findElement(
        By.xpath(
            "/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button/span"));

    return save;
  }
}
