package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.homePage;
import utils.driverFactory;

public class homePageDefinitions {

    homePage homePage=new homePage(driverFactory.getDriver());

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }
}
