package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class homePage {
    AppiumDriver driver;
    elementHelper elementHelper;
    By popupTitle = AppiumBy.id("trendyol.com:id/textViewTooltipTitle");


    public homePage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }


    public void checkHomePage() {
        elementHelper.checkElement(popupTitle);
    }
}

