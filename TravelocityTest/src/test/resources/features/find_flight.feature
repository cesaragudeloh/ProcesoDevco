#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find flights in the system, using the different search options


  @FindTheCheapestFlight
  Scenario: Find the cheapest return one way
    Given go to the Travelocity homepage
    When looking for a one way flight
      | leavingFrom | goingTo   | departing        | adults | children | airline |
      | Bogota      | Cartagena | 16-December-2020 | 2      | 0        | Avianca |
    And I locate the flight of the airline
    Then the system displays the review of the flight to be booked