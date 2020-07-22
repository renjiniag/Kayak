$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("kayak.feature");
formatter.feature({
  "line": 1,
  "name": "functionality of application",
  "description": "",
  "id": "functionality-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Origin and Destination",
  "description": "",
  "id": "functionality-of-application;verify-origin-and-destination",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open  browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter \"\u003cOrigin\u003e\" and \"\u003cDestination\u003e\" Cities",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Departure and Return dates are selected",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify \"\u003cOrigin\u003e\" and \"\u003cDestination\u003e\" Details",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "functionality-of-application;verify-origin-and-destination;",
  "rows": [
    {
      "cells": [
        "Origin",
        "Destination"
      ],
      "line": 11,
      "id": "functionality-of-application;verify-origin-and-destination;;1"
    },
    {
      "cells": [
        "LAX",
        "SFO"
      ],
      "line": 12,
      "id": "functionality-of-application;verify-origin-and-destination;;2"
    },
    {
      "cells": [
        "LAX",
        "BUF"
      ],
      "line": 13,
      "id": "functionality-of-application;verify-origin-and-destination;;3"
    },
    {
      "cells": [
        "SFO",
        "BUF"
      ],
      "line": 14,
      "id": "functionality-of-application;verify-origin-and-destination;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify Origin and Destination",
  "description": "",
  "id": "functionality-of-application;verify-origin-and-destination;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open  browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter \"LAX\" and \"SFO\" Cities",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Departure and Return dates are selected",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify \"LAX\" and \"SFO\" Details",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.open_browser_and_enter_url()"
});
formatter.result({
  "duration": 14159208100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAX",
      "offset": 7
    },
    {
      "val": "SFO",
      "offset": 17
    }
  ],
  "location": "HomePage.enter_and_Cities(String,String)"
});
formatter.result({
  "duration": 4773272200,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.departure_and_Return_dates_are_selected()"
});
formatter.result({
  "duration": 86900,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.click_Search()"
});
formatter.result({
  "duration": 5382814100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAX",
      "offset": 8
    },
    {
      "val": "SFO",
      "offset": 18
    }
  ],
  "location": "HomePage.verify_and_Details(String,String)"
});
formatter.result({
  "duration": 958652900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Origin and Destination",
  "description": "",
  "id": "functionality-of-application;verify-origin-and-destination;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open  browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter \"LAX\" and \"BUF\" Cities",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Departure and Return dates are selected",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify \"LAX\" and \"BUF\" Details",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.open_browser_and_enter_url()"
});
formatter.result({
  "duration": 11615295400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAX",
      "offset": 7
    },
    {
      "val": "BUF",
      "offset": 17
    }
  ],
  "location": "HomePage.enter_and_Cities(String,String)"
});
formatter.result({
  "duration": 5168526600,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.departure_and_Return_dates_are_selected()"
});
formatter.result({
  "duration": 62100,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.click_Search()"
});
formatter.result({
  "duration": 6227890400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LAX",
      "offset": 8
    },
    {
      "val": "BUF",
      "offset": 18
    }
  ],
  "location": "HomePage.verify_and_Details(String,String)"
});
formatter.result({
  "duration": 275418100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Origin and Destination",
  "description": "",
  "id": "functionality-of-application;verify-origin-and-destination;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open  browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter \"SFO\" and \"BUF\" Cities",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Departure and Return dates are selected",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify \"SFO\" and \"BUF\" Details",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.open_browser_and_enter_url()"
});
formatter.result({
  "duration": 12038674700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SFO",
      "offset": 7
    },
    {
      "val": "BUF",
      "offset": 17
    }
  ],
  "location": "HomePage.enter_and_Cities(String,String)"
});
formatter.result({
  "duration": 5287383100,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.departure_and_Return_dates_are_selected()"
});
formatter.result({
  "duration": 69600,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.click_Search()"
});
formatter.result({
  "duration": 3860962500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SFO",
      "offset": 8
    },
    {
      "val": "BUF",
      "offset": 18
    }
  ],
  "location": "HomePage.verify_and_Details(String,String)"
});
formatter.result({
  "duration": 3660381900,
  "status": "passed"
});
});