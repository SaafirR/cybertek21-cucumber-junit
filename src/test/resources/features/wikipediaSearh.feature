Feature: Wikepedia feature
  As a user, I should be able to search items ans see related results

  @wiki
  Scenario: Wikipedia search title verification
     Given User is on Wikepedia home page
     When User types Steve Jobs in the wiki search box
     And User clicks wiki search button
     Then User sees "Steve Jobs" is  in the wiki title

