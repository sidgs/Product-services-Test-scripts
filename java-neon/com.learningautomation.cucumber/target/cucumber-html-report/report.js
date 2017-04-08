$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Applicationnew.feature");
formatter.feature({
  "line": 1,
  "name": "Test G-mail smoke scenario",
  "description": "",
  "id": "test-g-mail-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-g-mail-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter valid \"vnani@rocketmail.com\" and valid \"sathwika143\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Smoketestnew.Open_firefox_and_start_application()"
});
formatter.result({
  "duration": 25147978425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vnani@rocketmail.com",
      "offset": 15
    },
    {
      "val": "sathwika143",
      "offset": 48
    }
  ],
  "location": "Smoketestnew.I_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 540195026,
  "status": "passed"
});
formatter.match({
  "location": "Smoketestnew.user_should_able_to_login_successfully()"
});
formatter.result({
  "duration": 2507524918,
  "status": "passed"
});
});