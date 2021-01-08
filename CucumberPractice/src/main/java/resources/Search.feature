Feature: Amazon Search

Scenario: Search a product
Given the search is there on Amazon page
When I search "Apple Mac book" with price $2000
Then product with name is displayed
