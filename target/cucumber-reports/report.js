$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CurrencyValidation.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: hanuman nadendla hanuma466@gmail.com"
    },
    {
      "line": 4,
      "value": "## one of the scenario is repeating twice."
    }
  ],
  "line": 6,
  "name": "Currency validations and calculations",
  "description": "",
  "id": "currency-validations-and-calculations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@currency"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Need to verify the right count of values appear on the screen",
  "description": "",
  "id": "currency-validations-and-calculations;need-to-verify-the-right-count-of-values-appear-on-the-screen",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@currency"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Launch test url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "table displayed",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "validate right count of values",
  "keyword": "Then "
});
formatter.match({
  "location": "Currency_Validation.launch_test_url()"
});
formatter.result({
  "duration": 402285200,
  "error_message": "",
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.table_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.validate_right_count_of_values()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Need to verify the values on the screen are greater than 0",
  "description": "",
  "id": "currency-validations-and-calculations;need-to-verify-the-values-on-the-screen-are-greater-than-0",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@currency"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Launch test url",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "table displayed",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "validate the values are greater than zero",
  "keyword": "Then "
});
formatter.match({
  "location": "Currency_Validation.launch_test_url()"
});
formatter.result({
  "duration": 5726600,
  "error_message": "",
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.table_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.validate_the_values_are_greater_than_zero()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Need to verify the total balance is correct based on the values listed on the screen    / Need to verify the total balance matches the sum of the values",
  "description": "",
  "id": "currency-validations-and-calculations;need-to-verify-the-total-balance-is-correct-based-on-the-values-listed-on-the-screen----/-need-to-verify-the-total-balance-matches-the-sum-of-the-values",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@currency"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch test url",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "table displayed",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "validate the total balence and values listed on the screen count should be same",
  "keyword": "Then "
});
formatter.match({
  "location": "Currency_Validation.launch_test_url()"
});
formatter.result({
  "duration": 5244400,
  "error_message": "",
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.table_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.validate_the_total_balence_and_values_listed_on_the_screen_count_should_be_same()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Need to verify the values are formatted as currencies",
  "description": "",
  "id": "currency-validations-and-calculations;need-to-verify-the-values-are-formatted-as-currencies",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@currency"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Launch test url",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "table displayed",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "validate the values are in  correct format or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Currency_Validation.launch_test_url()"
});
formatter.result({
  "duration": 7324400,
  "error_message": "",
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.table_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.match({
  "location": "Currency_Validation.validate_the_values_are_in_correct_format_or_not()"
});
formatter.result({
  "status": "passed"
});
});