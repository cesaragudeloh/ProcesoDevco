#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find cars in the system, using the different search options


  @ReserveARentalCar
  Scenario: Reserve a rental car
    Given go to the Travelocity homepage
    When looking for a rental car
      | pickUp | dropOff | pickUpDate       | dropOffDate      | pickUpTime | dropOffTime | carType | specification |
      | Bogotá | Bogotá  | 16-December-2020 | 28-December-2020 | 08:00      | 23:00       | SUV     | Automatic     |
    And I locate the cheapest car and enter the reservation data
      | name         | country  | phone      | email            | password   | carProtection |
      | Camila Lopez | Colombia | 3124789589 | camila@gmail.com | camila123* | NOT           |
    Then the reservation is made and the message "Thank you! Your trip is booked." is displayed


  @manual
  Scenario: Reserve an Airport Transportation
    Given I log in to the system and looking for an Airport Transportation
    When I locate the cheapest airport transportation car and enter the reservation data
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a rental car with preferred brand but without discount code
    Given I log in to the system
    When looking for a rental car with preferred brand but without discount code
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Reserve a rental car with preferred brand and discount type corporate
    Given I log in to the system
    When looking for a rental car with preferred brand and discount type corporate
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen

  @manual
  Scenario: Reserve a rental car with preferred brand and discount type corporate
    Given I log in to the system
    When looking for a rental car with preferred brand and discount type corporate
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen