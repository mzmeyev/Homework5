package Homework5.steps;

import Homework4.pages.BasePage;
import Homework4.pages.LoginPagePom;
import Homework4.pages.ProfilePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps {

    BasePage basePage = new BasePage();
    LoginPagePom loginPagePom = new LoginPagePom();
    ProfilePagePom profilePagePom = new ProfilePagePom();

    @Given("Open HomePage")
    public void openHomePage() {
        basePage.openChromeByUrl("https://www.forumcinemas.lv/");
    }

    @And("Press Ienakt button")
    public void pressIenaktButton() {
        loginPagePom.pressIenaktButton();
    }

    @And("^I enter username (.*) and password (.*)$")
    public void enterUsernameAndPassword(String username, String password) {
        loginPagePom.enterUsernameAndPassword("akdmisha", "Homework4Password");
    }

    @When("Press Submit Button")
    public void pressSubmitButton() {
        loginPagePom.pressSubmitButton();
    }

    @And("Press Profile Page button")
    public void pressProfilePageButton() {
        loginPagePom.pressProfilePageButton();
    }

    @Then("Press Edit Profile button")
    public void pressEditProfileButton() {
        loginPagePom.pressEditProfileButton();
    }
}
