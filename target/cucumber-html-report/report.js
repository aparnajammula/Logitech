$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PDPNew.feature");
formatter.feature({
  "line": 1,
  "name": "PDP New page",
  "description": "",
  "id": "pdp-new-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "View all elements on PDP Page",
  "description": "",
  "id": "pdp-new-page;view-all-elements-on-pdp-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on pdp Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the following elements of the \"pdp\" should be displayed",
  "rows": [
    {
      "cells": [
        "Features Portable"
      ],
      "line": 6
    },
    {
      "cells": [
        "Features Durable"
      ],
      "line": 7
    },
    {
      "cells": [
        "Features Video"
      ],
      "line": 8
    },
    {
      "cells": [
        "TechSpecs Header"
      ],
      "line": 9
    },
    {
      "cells": [
        "Support Headline"
      ],
      "line": 10
    },
    {
      "cells": [
        "Support Button"
      ],
      "line": 11
    },
    {
      "cells": [
        "Quote"
      ],
      "line": 12
    },
    {
      "cells": [
        "RelatedProducts Headline"
      ],
      "line": 13
    },
    {
      "cells": [
        "RelatedProducts Carousel"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pdp",
      "offset": 11
    }
  ],
  "location": "commonSteps.Page(String)"
});
formatter.result({
  "duration": 7278795436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdp",
      "offset": 31
    }
  ],
  "location": "commonSteps.validate_elements(String,String\u003e)"
});
formatter.result({
  "duration": 1114096751,
  "status": "passed"
});
formatter.after({
  "duration": 128468757,
  "status": "passed"
});
formatter.uri("categoryPage.feature");
formatter.feature({
  "line": 1,
  "name": "Category Page",
  "description": "",
  "id": "category-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "View all elements on category page",
  "description": "",
  "id": "category-page;view-all-elements-on-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the following elements of the \"category\" should be displayed",
  "rows": [
    {
      "cells": [
        "Header Title"
      ],
      "line": 6
    },
    {
      "cells": [
        "Header Prefix"
      ],
      "line": 7
    },
    {
      "cells": [
        "Num Showing"
      ],
      "line": 8
    },
    {
      "cells": [
        "Product Image2"
      ],
      "line": 9
    },
    {
      "cells": [
        "Product Title"
      ],
      "line": 10
    },
    {
      "cells": [
        "Learn More"
      ],
      "line": 11
    },
    {
      "cells": [
        "Pre Order"
      ],
      "line": 12
    },
    {
      "cells": [
        "Category Filter"
      ],
      "line": 13
    },
    {
      "cells": [
        "Sort Filter"
      ],
      "line": 14
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
  "duration": 5405319069,
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
  "duration": 1103773993,
  "status": "passed"
});
formatter.after({
  "duration": 130060150,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Dropdowns work",
  "description": "",
  "id": "category-page;dropdowns-work",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Verify that dropdowns are usable",
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
  "duration": 5050099888,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.Verify_that_dropdowns_are_usable()"
});
formatter.result({
  "duration": 1914162282,
  "status": "passed"
});
formatter.after({
  "duration": 136092775,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Product Grid",
  "description": "",
  "id": "category-page;product-grid",
  "type": "scenario",
  "keyword": "Scenario"
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
        "Product Swatch"
      ],
      "line": 29
    },
    {
      "cells": [
        "Product Description"
      ],
      "line": 30
    },
    {
      "cells": [
        "Product Disclaimer"
      ],
      "line": 31
    },
    {
      "cells": [
        "Compare Checkbox"
      ],
      "line": 32
    },
    {
      "cells": [
        "Compare Label1"
      ],
      "line": 33
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
  "duration": 5203186273,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.select_a_category()"
});
formatter.result({
  "duration": 483662914,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.Hover_on_product_image()"
});
formatter.result({
  "duration": 290103468,
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
  "duration": 904668143,
  "status": "passed"
});
formatter.after({
  "duration": 140561407,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Compare button is displayed",
  "description": "",
  "id": "category-page;compare-button-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
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
  "duration": 5248475705,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.select_a_category()"
});
formatter.result({
  "duration": 574812459,
  "status": "passed"
});
formatter.match({
  "location": "categoryPage.Verify_that_user_can_go_to_compare_page()"
});
formatter.result({
  "duration": 1232643168,
  "status": "passed"
});
formatter.after({
  "duration": 132788818,
  "status": "passed"
});
formatter.uri("comparePage.feature");
formatter.feature({
  "line": 1,
  "name": "Compare Page",
  "description": "",
  "id": "compare-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "View all elements on category page",
  "description": "",
  "id": "compare-page;view-all-elements-on-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on compare Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the following elements of the \"compare\" should be displayed",
  "rows": [
    {
      "cells": [
        "See All"
      ],
      "line": 6
    },
    {
      "cells": [
        "Product Name"
      ],
      "line": 7
    },
    {
      "cells": [
        "Product Price"
      ],
      "line": 8
    },
    {
      "cells": [
        "Product Disclaimer"
      ],
      "line": 9
    },
    {
      "cells": [
        "Product Image"
      ],
      "line": 10
    },
    {
      "cells": [
        "Product Close"
      ],
      "line": 11
    },
    {
      "cells": [
        "AllFeatures"
      ],
      "line": 12
    },
    {
      "cells": [
        "TechSpecs"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "compare",
      "offset": 11
    }
  ],
  "location": "commonSteps.Page(String)"
});
formatter.result({
  "duration": 5113199309,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "compare",
      "offset": 31
    }
  ],
  "location": "commonSteps.validate_elements(String,String\u003e)"
});
formatter.result({
  "duration": 947259141,
  "status": "passed"
});
formatter.after({
  "duration": 152364547,
  "status": "passed"
});
formatter.uri("navigation.feature");
formatter.feature({
  "line": 1,
  "name": "Navigation",
  "description": "",
  "id": "navigation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "View header and Footer",
  "description": "",
  "id": "navigation;view-header-and-footer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the following elements of the \"navigation\" should be displayed",
  "rows": [
    {
      "cells": [
        "Logo"
      ],
      "line": 6
    },
    {
      "cells": [
        "Utility Nav"
      ],
      "line": 7
    },
    {
      "cells": [
        "Sub Nav"
      ],
      "line": 8
    },
    {
      "cells": [
        "Social Links"
      ],
      "line": 9
    },
    {
      "cells": [
        "Links"
      ],
      "line": 10
    },
    {
      "cells": [
        "Copyright"
      ],
      "line": 11
    },
    {
      "cells": [
        "Language Selector"
      ],
      "line": 12
    },
    {
      "cells": [
        "Country Selector"
      ],
      "line": 13
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
  "duration": 5257969270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "navigation",
      "offset": 31
    }
  ],
  "location": "commonSteps.validate_elements(String,String\u003e)"
});
formatter.result({
  "duration": 958919174,
  "status": "passed"
});
formatter.after({
  "duration": 137939279,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "View hamburger nav in header",
  "description": "",
  "id": "navigation;view-hamburger-nav-in-header",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Scroll down on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify hamburger nav is displayed",
  "keyword": "And "
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
  "duration": 5381267369,
  "status": "passed"
});
formatter.match({
  "location": "navigateTest.Scroll_down_on_the_page()"
});
formatter.result({
  "duration": 1296008664,
  "status": "passed"
});
formatter.match({
  "location": "navigateTest.verify_hamburger_nav_is_displayed()"
});
formatter.result({
  "duration": 105768476,
  "status": "passed"
});
formatter.after({
  "duration": 131336864,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Able to subscribe to Newsletter",
  "description": "",
  "id": "navigation;able-to-subscribe-to-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "verify user is able to successfully subscribe to newsletter",
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
  "duration": 5033072797,
  "status": "passed"
});
formatter.match({
  "location": "navigateTest.verify_user_is_able_to_successfully_subscribe_to_newsletter()"
});
formatter.result({
  "duration": 604439589,
  "status": "passed"
});
formatter.after({
  "duration": 132131527,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Newsletter Error",
  "description": "",
  "id": "navigation;newsletter-error",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on Category Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Error is displayed on entering an invalid email",
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
  "duration": 5121995265,
  "status": "passed"
});
formatter.match({
  "location": "navigateTest.Error_is_displayed_on_entering_an_invalid_email()"
});
formatter.result({
  "duration": 594671342,
  "status": "passed"
});
formatter.after({
  "duration": 129763663,
  "status": "passed"
});
});