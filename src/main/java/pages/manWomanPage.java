package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class manWomanPage {
    AppiumDriver driver;
    elementHelper elementHelper;
    By image = AppiumBy.xpath("//android.widget.LinearLayout/android.widget.ImageView");
    By closeButton = AppiumBy.id("trendyol.com:id/buttonDismiss");
    By text = AppiumBy.xpath("//android.widget.LinearLayout/android.widget.TextView");
    By manButton = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By womanButton = AppiumBy.id("trendyol.com:id/buttonSelectGenderWoman");

    public manWomanPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkManWomenPage() {
        elementHelper.checkElement(image);
    }

    public void checkImage() {
        elementHelper.checkElement(image);

    }

    public void checkCloseButton() {
        elementHelper.checkElement(closeButton);

    }

    public String getTextText() {
        return elementHelper.getText(text);
    }

    public String getTextManButton() {
        return elementHelper.getText(manButton);
    }


    public String getTextWomenButton() {

        return elementHelper.getText(womanButton);

    }

    public void clickManButton() {
        elementHelper.click(manButton);
    }

    public void clickWomenButton() {
        elementHelper.click(womanButton);

    }

    public void clickCloseButton() {
        elementHelper.click(closeButton);

    }
}

