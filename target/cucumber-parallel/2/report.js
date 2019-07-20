$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/src/test/java/features/test2.feature");
formatter.feature({
  "line": 3,
  "name": "Login Feature 1",
  "description": "Verify if user is able to Login in to the site",
  "id": "login-feature-1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "login-feature-1;login-as-a-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "test.user_is_on_homepage()"
});
formatter.result({
  "duration": 19073313869,
  "status": "passed"
});
formatter.match({
  "location": "test.user_navigates_to_Login_Page()"
});
formatter.result({
  "duration": 7663339425,
  "status": "passed"
});
formatter.match({
  "location": "test.user_enters_username_and_Password()"
});
formatter.result({
  "duration": 5096911388,
  "status": "passed"
});
formatter.match({
  "location": "test.success_message_is_displayed()"
});
formatter.result({
  "duration": 5445083433,
  "status": "passed"
});
});