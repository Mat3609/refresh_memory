package ui.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import ui.util.TestListener;


@Listeners({TestListener.class})
public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void configurationBrowser() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.fastSetValue = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.headless = false;

    }

    @AfterMethod(alwaysRun = true)
    public void browserClose() {
        Selenide.closeWebDriver();
    }
}
