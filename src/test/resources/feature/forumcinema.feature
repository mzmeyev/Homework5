@forumcinema

Feature: Test forumcinema login and edit profile

  Scenario: Login to user profile and press edit profile
    Given Open HomePage
    And Press Ienakt button
    And I enter username "akdmisha" and password "Homework4Password"
    When Press Submit Button
    And Press Profile Page button
    Then Press Edit Profile button
    And Scroll the page down
    And Change name to test and lastname to this is a test
    And Validate name change
    And Change Birth day
    And Validate Birth day
    And Change Birth month
    And Validate Birth month
    And Change Birth year
    And Validate Birth year
    And Scroll the page down
    And Change Phone Number to 42069
    And Validate Phone Number
    And Change Current City to Riga
    And Validate Current City
    And Change gender
    And Change Preferred Language
    And Validate Preferred Language
    Then Close Chrome

