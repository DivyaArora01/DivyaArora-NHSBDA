package Utils;

import Base.BasePage;
import enums.Browsers;
import enums.OS;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
        } else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
        }
        BasePage.initpage();
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

}
