Feature: Delete Request

Scenario: Delete Request to delete a user details by using ID in the Database
When I hit the api with delete request and end point as  "http://localhost:8080/supplier?id=5"
Then To checking the Status code as 200 and status line as "HTTP/1.1 200"
