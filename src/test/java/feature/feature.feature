Feature: Search

Scenario: Google search
Given user opens Google URL
When user enter search criteria
Then user click on search
And result is populated

@smoke
Scenario: Amazon search
Given user opens Amazon URL
When user enter search criteria
Then user click on search
And result is populated

Scenario: Box search
Given user opens Box URL
When user enter search criteria
Then user click on search
And result is populated

Scenario: Flipkart search
Given user opens Flipkart URL
When user enter search criteria
Then user click on search
And result is populated



