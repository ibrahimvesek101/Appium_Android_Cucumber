package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.manWomanPage;
import utils.driverFactory;

public class manWomanPageDefinitions {
    manWomanPage manWomenPage = new manWomanPage(driverFactory.getDriver());


    @Given("user is on the Man Women Page")
    public void userIsOnTheManWomenPage() {
        manWomenPage.checkManWomenPage();
    }

    @Then("should see Image on the Man Women Page")
    public void shouldSeeImageOnTheManWomenPage() {
        manWomenPage.checkImage();
    }

    @Then("should see Close Button on the Man Women Page")
    public void shouldSeeCloseButtonOnTheManWomenPage() {
        manWomenPage.checkCloseButton();

    }

    @Then("should see Text {string} on the Man Women Page")
    public void shouldSeeTextOnTheManWomenPage(String expectedText) {
        String actualText = manWomenPage.getTextText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("should see Man Button: {string} on the Man Women Page")
    public void shouldSeeManButtonOnTheManWomenPage(String expectedText) {
        String actualText = manWomenPage.getTextManButton();
        Assert.assertEquals(actualText, expectedText);

    }

    @Then("should see Women Button: {string} on the Man Women Page")
    public void shouldSeeWomenButtonOnTheManWomenPage(String expectedText) {
        String actualText = manWomenPage.getTextWomenButton();
        Assert.assertEquals(actualText, expectedText);
    }

    @When("click Man Button on the Man Women Page")
    public void clickManButtonOnTheManWomenPage() {
        manWomenPage.clickManButton();
    }

    @When("click Women Button on the Man Women Page")
    public void clickWomenButtonOnTheManWomenPage() {
        manWomenPage.clickWomenButton();
    }

    @When("click Close Button on the Man Women Page")
    public void clickCloseButtonOnTheManWomenPage() {
        manWomenPage.clickCloseButton();

    }
}
