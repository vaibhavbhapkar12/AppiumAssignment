@tag
Feature: Verify theme feature of the mobile app
  
  @tag1
  Scenario: Change current app theme to Dark
    Given I have sudoku app installed and open on my android device
	  When I tap on the theme icon
    Then I can change the theme from white to Dark 
   

  