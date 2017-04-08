$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Application.feature");
formatter.feature({
  "line": 1,
  "name": "Test G-mail smoke scenario",
  "description": "",
  "id": "test-g-mail-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "vnani@rocketmail.com",
        "sathwika"
      ],
      "line": 11,
      "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid \"vnani@rocketmail.com\" and valid \"sathwika\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoketestnew.Open_firefox_and_start_application()"
});
formatter.result({
  "duration": 46711670294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vnani@rocketmail.com",
      "offset": 15
    },
    {
      "val": "sathwika",
      "offset": 48
    }
  ],
  "location": "Smoketestnew.I_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 3375227340,
  "status": "passed"
});
formatter.match({
  "location": "Smoketestnew.user_should_able_to_login_successfully()"
});
formatter.result({
  "duration": 8270518939,
  "status": "passed"
});
formatter.match({
  "location": "Smoketestnew.application_should_be_closed()"
});
formatter.result({
  "duration": 1625634398,
  "status": "passed"
});
});