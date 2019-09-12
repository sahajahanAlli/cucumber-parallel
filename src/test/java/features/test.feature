
@tag
Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario Outline: Login as a authenticated user
    Given user is  on homepage as <url>
    When user navigates to Login Page
    And user enters <username> and <Password>
    Then success message is displayed as <expectedmsg>
    Examples:
      | url  | username | Password | expectedmsg |
      | http://automationpractice.com/index.php | blog.cucumber@gmail.com | Cucumber@blog | Welcome to your account. Here you can manage all of your personal information and orders. |

  Scenario Outline: Login as a authenticated user
    Given user is  on homepage as <url>
    When user navigates to Login Page
    And user enters <username> and <Password>
    Then Error message is displayed as <expectedmsg>
    Examples:
      | url  | username | Password | expectedmsg |
      | http://automationpractice.com/index.php | blog.cucumber1@gmail.com | Cucumber1@blog | Authentication failed. |