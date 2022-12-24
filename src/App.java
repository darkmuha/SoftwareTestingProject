import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// import pages.Homepage;

public class App {

  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.proswimwear.co.uk/");
    driver.manage().window().maximize();
  }
}
