package Homework5.steps;

import Homework4.pages.BasePage;
import Homework4.pages.ProfilePagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ProfilePageSteps {

    BasePage basePage = new BasePage();
    ProfilePagePom profilePagePom = new ProfilePagePom();

    @And("^Change name to (.*) and lastname to (.*)$")
    public void changeNameToAndLastnameTo(String firstname, String lastname) {
        profilePagePom.changeFirstAndLastName(firstname, lastname);
    }

    @And("Validate name change")
    public void validateNameChange() {
        profilePagePom.validateFirstAndLastName("test", "this is a test");
    }


    @And("Change Birth day")
    public void changeBirthDay() {
        profilePagePom.selectBirthDay("5");
    }

    @And("Validate Birth day")
    public void validateBirthDay() {
        profilePagePom.validateBirthDay("5");
    }

    @And("Change Birth month")
    public void changeBirthMonth() {
        profilePagePom.selectBirthMonth("Marts");
    }

    @And("Validate Birth month")
    public void validateBirthMonth() {
        profilePagePom.validateBirthMonth("3");
    }

    @And("Change Birth year")
    public void changeBirthYear() {
        profilePagePom.selectBirthYear("2000");
    }

    @And("Validate Birth year")
    public void validateBirthYear() {
        profilePagePom.validateBirthYear("2000");
    }

    @And("^Change Phone Number to (.*)$")
    public void changePhoneNumberTo(String phonenumber) {
        profilePagePom.changePhoneNumber(phonenumber);
    }

    @And("Validate Phone Number")
    public void validatePhoneNumber() {
        profilePagePom.validatePhoneNumber("42069");
    }

    @And("^Change Current City to (.*)$")
    public void changeCurrentCityTo(String city) {
        profilePagePom.changeCurrentCity(city);
    }

    @And("Validate Current City")
    public void validateCurrentCity() {
        profilePagePom.validateCurrentCity("Riga");
    }

    @And("Change gender")
    public void changeGender() {
        profilePagePom.pressGenderButton();
    }

    @And("Change Preferred Language")
    public void changePreferredLanguage() {
        profilePagePom.selectPreferredLanguage("Krievu");
    }

    @And("Validate Preferred Language")
    public void validatePreferredLanguage() {
        profilePagePom.validatePreferredLanguage("1004");
    }

    @Then("Close Chrome")
    public void closeChrome() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.closeChrome();
    }
}
