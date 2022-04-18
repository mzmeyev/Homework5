@forumcinema

Feature: Test forumcinema login and edit profile

  Scenario: Login to user profile and press edit profile
    Given Open HomePage
    And Press Ienakt button
    And I enter username "akdmisha" and password "Homework4Password"
    When Press Submit Button
    And Press Profile Page button
    Then Press Edit Profile button