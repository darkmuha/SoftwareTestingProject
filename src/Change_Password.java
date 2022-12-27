
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Password {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://www.proswimwear.co.uk/customer/account/login/referer/aHR0cHM6Ly93d3cucHJvc3dpbXdlYXIuY28udWsvY3VzdG9tZXIvYWNjb3VudC9pbmRleC8%2C/");

        // Find the username and password elements and enter the login credentials
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement passwordElement = driver.findElement(By.id("pass"));
        emailElement.sendKeys("soundhu@gmail.com");
        passwordElement.sendKeys("Riya@123");

        // Find the login button and click it
        WebElement signinButton = driver.findElement(By.id("send2"));
        signinButton.click();

        //Change Password
        // Navigate to the change password page
        driver.get("https://www.proswimwear.co.uk/customer/account/edit/changepass/1/");

        WebElement currentPasswordField = driver.findElement(By.id("current-password"));
        currentPasswordField.sendKeys("riya!123");

        WebElement newPasswordField = driver.findElement(By.id("password"));
        newPasswordField.sendKeys("Riya@123");

        WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
        confirmPassword.sendKeys("Riya@123");
        
        WebElement saveButton = driver.findElement(By.cssSelector("button[type='submit']"));
        saveButton.click();
    }
}
  
 