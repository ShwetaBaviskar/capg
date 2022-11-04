Feature: Post Request

Scenario: User should be able to add the data into database.
Given User want to provide data
When User post the data by using api is "http://localhost:8080/supplier"
Then User want to checks the Status code is 200