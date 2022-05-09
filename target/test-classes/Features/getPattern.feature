Feature: Get Patterns from Colour lover

  Scenario Outline: Number of Views should be greater than a specific value for all patterns.
    Given I send a request to get all Patterns using <EndPoint>
    Then I should Receive a response body of patterns
    And Number of views Should be greater than <value>

    Examples:
    |EndPoint||value|
    |"api/patterns"||4000|

