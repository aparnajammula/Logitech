$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("categoryPage.feature");
formatter.feature({
  "line": 1,
  "name": "Category Page",
  "description": "",
  "id": "category-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Product Grid",
  "description": "",
  "id": "category-page;product-grid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Failure"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "select a category",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Hover on product image",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "the following elements of the \"category\" should be displayed",
  "rows": [
    {
      "cells": [
        "Product Title"
      ],
      "line": 27
    },
    {
      "cells": [
        "Product MSRP"
      ],
      "line": 28
    },
    {
      "cells": [
        "Product Description"
      ],
      "line": 29
    },
    {
      "cells": [
        "Product Disclaimer"
      ],
      "line": 30
    },
    {
      "cells": [
        "Compare Checkbox"
      ],
      "line": 31
    },
    {
      "cells": [
        "Compare Label1"
      ],
      "line": 32
    }
  ],
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
  "duration": 19556353025,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.select_a_category()"
});
formatter.result({
  "duration": 785105159,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.Hover_on_product_image()"
});
formatter.result({
  "duration": 322904565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "category",
      "offset": 31
    }
  ],
  "location": "commonSteps.validate_elements(String,String\u003e)"
});
formatter.result({
  "duration": 1001692436,
  "status": "passed"
});
formatter.after({
  "duration": 10238009027,
  "status": "passed"
});
});