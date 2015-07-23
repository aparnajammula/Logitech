$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("categoryPage.feature");
formatter.feature({
  "line": 1,
  "name": "Category Page",
  "description": "",
  "id": "category-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 37,
  "name": "Compare button is displayed",
  "description": "",
  "id": "category-page;compare-button-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Failure"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "select a category",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Verify that user can go to compare page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Category",
      "offset": 11
    }
  ],
  "location": "commonSteps.Page(String)"
});
formatter.result({
  "duration": 13493709909,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.select_a_category()"
});
formatter.result({
  "duration": 766505626,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.Verify_that_user_can_go_to_compare_page()"
});
formatter.result({
  "duration": 1866355858,
  "status": "passed"
});
formatter.after({
  "duration": 16564498129,
  "status": "passed"
});
});