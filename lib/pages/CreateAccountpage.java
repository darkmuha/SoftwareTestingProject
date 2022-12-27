package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountpage {
    WebElement FirstnameField;
    WebElement LastnameField;
    WebElement email;
    WebElement password;
    WebElement createAccountButton;
  
  public WebElement getFirstnameField(WebDriver driver) {
    WebElement FirstnameField = driver.findElement(By.id("firstname"));
    return FirstnameField;
  }

  public WebElement getLastnameField(WebDriver driver) {
    WebElement LastnameField = driver.findElement(By.id("lastname"));
      return LastnameField;
  }

  public WebElement getemail(WebDriver driver) {
    WebElement email = driver.findElement(By.id("email_address"));
    return email;
  }

  public WebElement getpassword(WebDriver driver) {
    WebElement password = driver.findElement(By.id("password"));
    return password;
  }

  public WebElement getconfirmPasswordField(WebDriver driver) {
    WebElement confirmPasswordField = driver.findElement(By.id("password-confirmation"));
      return confirmPasswordField;
  }

  public WebElement getcreateAccountButton(WebDriver driver) {
    WebElement createAccountButton = driver.findElement(By.id("send2"));
      return createAccountButton;
  }
}

  