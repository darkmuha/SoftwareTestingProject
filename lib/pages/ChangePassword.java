package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword {
    WebElement emailField;
    WebElement passwordField;
    WebElement SignInButton;
    WebElement currentPasswordField;
    WebElement newPasswordField;
    WebElement confirmPassword;
    WebElement saveButton;

    WebDriver driver = new ChromeDriver();

    public WebElement getemailField (WebDriver driver){
        emailField = driver.findElement(By.id("email"));
        return emailField;
    }

    public WebElement getpasswordField (WebDriver driver){
        passwordField = driver.findElement(By.id("pass"));
        return passwordField;
    }

    public WebElement getcurrentPasswordField (WebDriver driver){
        currentPasswordField = driver.findElement(By.id("current-password"));
        return currentPasswordField;
    }

    public WebElement getnewPasswordField (WebDriver driver){
        newPasswordField = driver.findElement(By.id("password"));
        return newPasswordField;
    }

    public WebElement getconfirmPassword (WebDriver driver){
        confirmPassword = driver.findElement(By.id("password-confirmation"));
        return confirmPassword;
    }

    public WebElement getsaveButton (WebDriver driver){
        saveButton = driver.findElement(By.cssSelector("button[type='submit']"));
        return saveButton;
    }
}

