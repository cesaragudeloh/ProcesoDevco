#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find cars in the system, using the different search options


  @ReserveARentalCar
  Scenario: Find a rental car
    Given go to the Travelocity homepage
    When looking for a rental car
      | pickUp | dropOff | pickUpDate       | dropOffDate      | pickUpTime | dropOffTime | carType | specification |
      | Bogotá | Bogotá  | 16-December-2020 | 28-December-2020 | 08:00      | 23:00       | SUV     | Automatic     |
    And I locate the cheapest car and enter the reservation data
      | name         | country  | phone      | email            | password   | carProtection |
      | Camila Lopez | Colombia | 3124789589 | camila@gmail.com | camila123* | NOT           |
    Then the reservation is made and the message "Thank you! Your trip is booked." is displayed