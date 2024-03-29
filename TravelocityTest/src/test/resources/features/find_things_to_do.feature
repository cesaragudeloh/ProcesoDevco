#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find things to do in the system, using the different search options


  @FindTheHistoricalCityTour
  Scenario: Find the historical city tour
    Given go to the Travelocity homepage
    When I looking for a things to do
      | origin    | from             | to               |
      | Cartagena | 16-December-2020 | 26-December-2020 |
    And search for an activity "Historic Cartagena City Tour"
    Then the system displays the review of the activity to be booked


  @manual
  Scenario: Reserve an activity to do
    Given Given I log in to the system
    When looking for an activity to do
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen