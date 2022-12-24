package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Search_Bar {
    WebElement Searchbar;
    WebElement SearchbarRecomendation;
    WebElement SearchbarTxt;
    WebElement SearchbarColourTxt;
    WebElement SearchXBtn;
    WebElement SearchBarClear;

    public WebElement getSearchbar(WebDriver driver) {
        Searchbar = driver.findElement(By.id("search"));
        return Searchbar;

    }

    public WebElement getSearchbarClear(WebDriver driver) {
        SearchBarClear = driver.findElement(By.id("search"));
        return SearchBarClear;

    }

    public WebElement getSearchXBtn(WebDriver driver) {
        SearchXBtn = driver.findElement(By.xpath("/html/body/div[4]/div/button"));
        return SearchXBtn;

    }

    public WebElement getSearchbarRecomendation(WebDriver driver) {
        SearchbarRecomendation = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[8]/button"));
        new Actions(driver).moveToElement(SearchbarRecomendation).click().perform();
        return SearchbarRecomendation;

    }

    public WebElement getSearchbarTxt(WebDriver driver) {
        SearchbarTxt = driver.findElement(By.id("search"));
        return SearchbarTxt;

    }

    public WebElement getSearchbarColourTxt(WebDriver driver) {
        SearchbarColourTxt = driver.findElement(By.id("search"));
        return Searchbar;

    }

}
