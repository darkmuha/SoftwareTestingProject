
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
  public static void main(String[] args) throws Exception {
    //System.out.println("Hello, World!");
    // Set up the web driver and navigate to the account creation page
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/customer/account/create/");

      // Enter the user's information into the appropriate fields
      WebElement FirstnameField = driver.findElement(By.id("firstname"));
      FirstnameField.sendKeys("Aishu");

      WebElement LastnameField = driver.findElement(By.id("lastname"));
      LastnameField.sendKeys("P");
      
      WebElement emailField = driver.findElement(By.id("email_address"));
      emailField.sendKeys("Aishu@gmail.com");

      WebElement passwordField = driver.findElement(By.id("password"));
      passwordField.sendKeys("aishu@123");

      WebElement confirmPasswordField = driver.findElement(By.id("password-confirmation"));
      confirmPasswordField.sendKeys("aishu@123");

      // Click the "Create Account" button
      WebElement createAccountButton = driver.findElement(By.id("send2"));
      createAccountButton.click();

    //driver.quit();   
  }
}

