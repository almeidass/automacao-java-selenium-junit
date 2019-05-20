package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static WebDriver createChrome(String url){
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();

        browser.manage().window().maximize();
        browser.get(url);

        return browser;
    }
}
