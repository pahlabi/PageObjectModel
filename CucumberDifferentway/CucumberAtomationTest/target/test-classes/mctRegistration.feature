Feature: User Registration mechenism
  in order to benefit all user to open cmt ecommerce 
  I want to register myself

  Scenario: Successful registration
    Given I open browser chrome 
    And  i land on multicart landining page
    When I complete registration as Mr Raz
    Then i expect to see profile name Mr Raz
  
    

    
