#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find flights in the system, using the different search options


  @FindTheCheapestFlight
  Scenario: Find the cheapest return one way
    Given go to the Travelocity homepage
    When looking for a one way flight
      | leavingFrom | goingTo   | departing        |
      | Bogota      | Cartagena | 16-December-2020 |
    And I locate the cheapest return of the airline "Avianca"
    Then the system displays the review of the flight to be booked