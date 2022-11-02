@purchase
Feature: purchase item
  As user want ot purchase item

  Scenario: User makes a purchase by name (A-Z)
    Given User open the web page
    When User input "standard_user" as username and "secret_sauce" as password
    Then User sort product by "Name (A to Z)"
    Then User Select item
    Then User get to shopping
    Then User remove one item
    Then User continou Shopping
    Then User insert name "rivan" last name "adi" and posecode "222"
    Then User get to nominal price
    Then User can see subtotal"Item total: $29.99"
    Then User can see tax"Tax: $2.40"
    Then User can see total payment"Total: $32.39"
    Then User Continou to payment
    Then User Succes shopping and will see"THANK YOU FOR YOUR ORDER"
