#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find hotels in the system, using the different search options


  @FindTheCheapestHotel
  Scenario: Find the cheapest hotel
    Given go to the Travelocity homepage
    When looking for a hotel
      | goinTo | checkIn          | checkOut         | travelerAdults | travelerChildren |
      | Neira  | 16-December-2020 | 28-December-2020 | 1              | 0                |
    And locate the cheapest hotel
    Then the system displays the reservation details on the screen


  @manual
  Scenario: Reserve a hotel
    Given Given I log in to the system
    When looking for a hotel with more stars
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a hotel with car
    Given Given I log in to the system
    When looking for a hotel with car
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen

  @manual
  Scenario: Reserve a hotel with car and flight
    Given Given I log in to the system
    When looking for a hotel with car and flight
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen