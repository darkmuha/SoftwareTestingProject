import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class review_test {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proswimwear.co.uk/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Homepage homePage = new Homepage();

        helper_method help = new helper_method();
        help.scrollToHomePageProducts(driver);
        help.clickFirstAddToCart(driver);
        help.scrollToHomePageProducts(driver);
        help.ReviewBtn(driver);
        help.Quality(driver);
        help.generalScroll(driver);
        help.NickNameTxt(driver);
        help.SummaryTxt(driver);
        help.ReviewTxt(driver);
        help.SubmitReviewBtn(driver);
    }
}