import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address_Verification {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://www.proswimwear.co.uk/blueseventy-nerotx2-kneeskin-black.html");

        WebElement sizeBox = driver.findElement(By.id("option-label-brand_sizing-608-item-2298"));
        sizeBox.click();

        WebElement addToCartButton = driver.findElement(By.id("product-addtocart-button"));
        addToCartButton.click();
        
         // Navigate to the Proceed To Checkout
        driver.get("https://www.proswimwear.co.uk/checkout/#shipping");
        WebElement ProceedToCheckout = driver.findElement(By.xpath("maincontent"));
        ProceedToCheckout.click();

        WebElement emailAddressElement = driver.findElement(By.id("TCCXRBN"));
        emailAddressElement.click();

        WebElement firstNameField = driver.findElement(By.id("FGK8TYH"));
        firstNameField.sendKeys("Chinnu");

        WebElement lastNameField = driver.findElement(By.id("FGK8TYH"));
        lastNameField.sendKeys("P");

        WebElement streetAddress = driver.findElement(By.id("PP2BBH6"));
        streetAddress.click();

        // WebElement countrySelect = driver.findElement(By.id("G3O88TB"));
        // countrySelect.selectByVisibleText("United States");

        WebElement cityField = driver.findElement(By.id("YTS8HRN"));
        cityField.sendKeys("New York");

        WebElement stateField = driver.findElement(By.id("D0CJAJR"));
        stateField.sendKeys("NY");

        WebElement zipCodeField = driver.findElement(By.id("CVPCY7D"));
        zipCodeField.sendKeys("10001");

        WebElement phoneNumberField = driver.findElement(By.id("CVPCY7D"));
        phoneNumberField.sendKeys("+123 456 789");

        WebElement radioButton = driver.findElement(By.xpath("//*/table/tbody/tr[1]/td[1]/input"));
        radioButton.click();

        WebElement nextButton = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        nextButton.click();
    }

}

    
