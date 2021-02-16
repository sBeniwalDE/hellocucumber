Feature: Browse and Validate
  As a test user, I want to browse various pages of a particular website and validates the following:
  - There are no console errors on page loads
  - The response code from the page (200, 302, 404, etc.)
  - All links on the page go to another live (non 4xx) page (no need to actually parse
  the linked page/image).

  @smoke
  Scenario Outline: Navigate 4 WebPages and validate the response code
    When the user navigate to "<Webpage>"
#    Then user gets following "<ResponseCode>" Need to be done by creating a testresponse class
#    And  there are no console errors on loading

    Examples:
      |Webpage                                           |ResponseCode|
      |http://www.kraken.com                             |    200     |
#      |http://www.kraken.com/prices                      |    200     |
#      |http://www.kraken.com/doesntexist                 |    404     |
#      |http://www.kraken.com/en-us/features/security/pgp |    200     |