import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar_Test {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.proswimwear.co.uk/");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Homepage homePage = new Homepage();

        helper_method help = new helper_method();
        help.Searchbar(driver);
        Thread.sleep(3000);
        help.SearchbarRecomendation(driver);
        Thread.sleep(3000);
        help.SearchBarClear(driver);

        help.Searchbar(driver);
        help.SearchbarTxt(driver);

        help.SearchBarClear(driver);

        help.SearchbarColourTxt(driver);

        help.SearchBarClear(driver);

    }
}