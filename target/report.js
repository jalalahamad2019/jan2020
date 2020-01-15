$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Jenkin.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SampleTest.open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "load url",
  "keyword": "And "
});
formatter.match({
  "location": "SampleTest.load_url()"
});
formatter.result({
  "status": "passed"
});
});