Feature: Put Request

Scenario: User wants to Update the data 
Given user wants to upadate the existing the data
When User wants to update the data using api "http://localhost:8080/supplier/10"
Then Verify the Status code is 200