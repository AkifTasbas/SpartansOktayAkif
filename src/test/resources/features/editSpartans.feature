Feature: Edit Spartan Feature

  @wip @dbConnection
Scenario:The User Edit a Spartan with UI automation and verify that Database has changed with JDBC
Given The Spartans Webpage must be opened
Then User clicks the Web Data link
Then User clicks edit spartan button
Then User clicks to back_to_list link
#And the edited Spartan of the records have to be chanced on JDBC