package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class offerPage {
    AppiumDriver driver;
    elementHelper elementHelper;
    By yesButton= AppiumBy.id("trendyol.com:id/buttonAccept");


    public offerPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }


    public void checkOfferPage() {
        elementHelper.checkElement(yesButton);
    }
}

