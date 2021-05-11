package xcart.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XcartChrome {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("X-cart");
        System.out.println(verifyTitle);
        boolean verifyTitleContians = title.contains("The Last Ecommerce Platform you will ever need");
        System.out.println(verifyTitleContians);
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        driver.close();
    }
}
