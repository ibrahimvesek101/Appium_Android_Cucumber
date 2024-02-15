package stepDefinitions;

import io.cucumber.java.en.Then;
import utils.driverFactory;
import pages.offerPage;

public class offerPageDefinitions {

    offerPage offerPage = new offerPage(driverFactory.getDriver());

    @Then("should see Offer Page")
    public void shouldSeeOfferPage() {
        offerPage.checkOfferPage();
    }
}
