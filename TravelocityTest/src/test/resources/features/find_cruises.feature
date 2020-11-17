#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find cruises in the system, using the different search options


  @FindTheCheapestCruise
  Scenario: Find the cheapest cruise
    Given go to the Travelocity homepage
    When I looking for a cruise
      | goingTo   | traveles | departsAsEarlyAs | departsAslateAs |
      | Caribbean | 2        | 1-June-2021      | 30-June-2021    |
    And I select a cruise with all its properties
    Then the system displays the review of the cruise to be booked