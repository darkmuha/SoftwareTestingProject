package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDown {
    WebElement sizeBox;

    public WebElement getsizeBox (WebDriver driver){
        sizeBox = driver.findElement(By.id("option-label-clothing_size-1494-item-6039"));
        return sizeBox;
    }
           
}

