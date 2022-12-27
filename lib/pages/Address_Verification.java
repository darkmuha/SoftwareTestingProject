package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Address_Verification {
    WebElement sizeBox;
    WebElement addToCartButton;
    WebElement ProceedToCheckout;
    WebElement emailAddressElement;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement streetAddress;
    WebElement countrySelect;
    WebElement cityField;
    WebElement stateField;
    WebElement zipCodeField;
    WebElement phoneNumberField;
    WebElement radioButton;
    WebElement nextButton;
    
    // Select the size dropdown element
    public WebElement getsizeBox (WebDriver driver){
        sizeBox = driver.findElement(By.id("option-label-womens_size-700-item-1478"));
        return sizeBox;
    }

    // Locate the add to cart button
    public WebElement getaddToCartButton (WebDriver driver){
        addToCartButton = driver.findElement(By.id("product-addtocart-button"));
        return addToCartButton;
    }
    
    // Click the add to cart button
    public WebElement getProceedToCheckout (WebDriver driver){
        ProceedToCheckout = driver.findElement(By.xpath("//*[@class='action primary checkout']/div[2]/div/div[2]/div[1]/ul/li/button"));
        return ProceedToCheckout;
    } 
    
    public WebElement getemailAddressElement(WebDriver driver) {
        emailAddressElement = driver.findElement(By.id("customer-email"));
        return emailAddressElement;
    } 

    public WebElement getfirstNameField (WebDriver driver){
        firstNameField = driver.findElement(By.id("TCCXRBN"));
        return firstNameField;
    }  
    
    public WebElement getlastNameField (WebDriver driver){
        lastNameField = driver.findElement(By.id("FGK8TYH"));
        return lastNameField;
    }

    public WebElement getstreetAddress (WebDriver driver){
        streetAddress = driver.findElement(By.id("PP2BBH6"));
        return streetAddress;
    }

    public WebElement getcountrySelect (WebDriver driver){
        countrySelect = driver.findElement(By.id("G3O88TB"));
        return countrySelect;
    }

    public WebElement getcityField (WebDriver driver){
        cityField = driver.findElement(By.id("YTS8HRN"));
        return cityField;
    }

    public WebElement getstateField(WebDriver driver){
        stateField = driver.findElement(By.id("D0CJAJR"));
        return stateField;
    }

    public WebElement getzipCodeField(WebDriver driver){
        zipCodeField = driver.findElement(By.id("CVPCY7D"));
        return zipCodeField;
    }
    
    public WebElement getphoneNumberField(WebDriver driver){
        phoneNumberField = driver.findElement(By.id("CVPCY7D"));
        return phoneNumberField;
    }

    public WebElement getradioButton(WebDriver driver){
        radioButton = driver.findElement(By.xpath("//*/table/tbody/tr[1]/td[1]/input"));
        return radioButton;
    }

    // Submit the form
    public WebElement getnextButton(WebDriver driver){
        nextButton = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        return nextButton;
    }
}



