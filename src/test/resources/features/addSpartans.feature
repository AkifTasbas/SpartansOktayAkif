Feature: Add Spartan feature


  Scenario:The user can add a new Spartan and read the created Spartan information on the list
    Given The Spartans Webpage must be opened
    Then User clicks the Web Data link
    Then User clicks add a new spartan button
    And User fills the necessary information for new Spartan and clicks the submit button
    Then User clicks to back_to_list link
    And the total of the records have to be chanced on JDBC

