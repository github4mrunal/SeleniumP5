package xcart.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class XcartIE {
    public static void main(String[] args) {
        String mainUrl = "https://www.x-cart.com/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(mainUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        boolean verifytab = title.equals("X-Cart");
        boolean verifyTabTitle = title.contains("The Last Ecommerce Platform you will ever need");
        System.out.println(title);
        System.out.println(verifytab);
        System.out.println(verifyTabTitle);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        driver.close();
    }
}
