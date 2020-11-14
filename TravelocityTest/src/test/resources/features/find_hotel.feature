#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find hotels in the system, using the different search options


  @FindTheCheapestHotel
  Scenario: Find the cheapest hotel
    Given go to the Travelocity homepage
    When looking for a hotel
      | goinTo | checkIn          | checkOut         | travelerAdults | travelerChildren |
      | Neira  | 20-November-2020 | 15-December-2020 | 1              | 0                |
    And locate the cheapest hotel
    Then the system displays the reservation details on the screen