#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find flights in the system, using the different search options


  @FindAFlight
  Scenario: Find a one way flight
    Given go to the Travelocity homepage
    When looking for a one way flight
      | leavingFrom | goingTo   | departing        | adults | children | airline |
      | Bogota      | Cartagena | 16-December-2020 | 2      | 0        | Avianca |
    And I locate the flight of the airline
    Then the system displays the review of the flight to be booked


  @manual
  Scenario: Reserve a multi city flight
    Given Given I log in to the system
    When looking for a multi city flight
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a roundtrip flight
    Given Given I log in to the system
    When looking for a roudtrip city flight
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a roundtrip flight with car
    Given Given I log in to the system
    When looking for a roudtrip city flight and a car
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a flight with car and place to stay
    Given Given I log in to the system
    When looking for a flight with car and place to stay
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen