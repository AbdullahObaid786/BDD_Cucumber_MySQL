$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios billing Login Functionality Validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@obaid_regression"
    }
  ]
});
formatter.before({
  "duration": 3130026500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1318422200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User Should be able to Login with valid credentials from Database",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials-from-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TechfiosLogin2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enters \"username\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters \"password\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User Should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_database(String)"
});
formatter.result({
  "duration": 3587325600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_database(String)"
});
formatter.result({
  "duration": 3150785200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 3981331800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_Should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 352860400,
  "status": "passed"
});
formatter.after({
  "duration": 833124900,
  "status": "passed"
});
});