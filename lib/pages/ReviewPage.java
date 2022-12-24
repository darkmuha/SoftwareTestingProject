package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReviewPage {

    WebElement ReviewBtn;
    WebElement Quality;
    WebElement NickNameTxt;
    WebElement SummaryTxt;
    WebElement ReviewTxt;
    WebElement SubmitReviewBtn;

    public WebElement getReviewBtn(WebDriver driver) {
        ReviewBtn = driver.findElement(
                By.xpath(
                        "/html/body/div[2]/main/div[2]/div/div[3]/div/ul/li[2]/a"));
        return ReviewBtn;
    }

    public WebElement getQuality(WebDriver driver) {
        Quality = driver.findElement(
                By.cssSelector(
                        "#Quality_1_label"));
        new Actions(driver).moveToElement(Quality).click().perform();

        return Quality;
    }

    public WebElement getNickName(WebDriver driver) {
        NickNameTxt = driver.findElement(
                By.id(
                        "nickname_field"));
        return NickNameTxt;
    }

    public WebElement getSummary(WebDriver driver) {
        SummaryTxt = driver.findElement(
                By.id(
                        "summary_field"));
        return SummaryTxt;
    }

    public WebElement getReview(WebDriver driver) {
        ReviewTxt = driver.findElement(
                By.id(
                        "review_field"));
        return ReviewTxt;
    }

    public WebElement getSubmitReviewBtn(WebDriver driver) {
        SubmitReviewBtn = driver.findElement(
                By.xpath(
                        "/html/body/div[2]/main/div[2]/div/div[3]/div/div[4]/div[2]/div[2]/form/div[2]/div/button"));
        return SubmitReviewBtn;
    }
}
