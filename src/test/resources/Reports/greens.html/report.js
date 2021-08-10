$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Booking.feature");
formatter.feature({
  "name": "Verify booking in adactin hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cusername\u003e\" \"\u003cpassword\u003e\" and click login button",
  "keyword": "When "
});
formatter.step({
  "name": "User should select all the fields \"\u003clocation\u003e\" \"\u003chotels\u003e\" \"\u003croomType\u003e\" \"\u003cnoofRoom\u003e\" \"\u003cindate\u003e\" \"\u003coutdate\u003e\" \"\u003cadult\u003e\" \"\u003cchild\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click hotel and click Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should select all the fields \"\u003cfname\u003e\" \"\u003clname\u003e\" \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should  enter",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "creditno",
        "cardtype",
        "expiryM",
        "expiryY",
        "cvv"
      ]
    },
    {
      "cells": [
        "1234567887654321",
        "Visa",
        "June",
        "2022",
        "789"
      ]
    },
    {
      "cells": [
        "8765432112345678",
        "Master card",
        "July",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "4321890765443321",
        "American Express",
        "August",
        "2022",
        "321"
      ]
    },
    {
      "cells": [
        "8695432112345678",
        "Master card",
        "March",
        "2022",
        "432"
      ]
    }
  ]
});
formatter.step({
  "name": "User should get Order ID",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomType",
        "noofRoom",
        "indate",
        "outdate",
        "adult",
        "child",
        "fname",
        "lname",
        "address"
      ]
    },
    {
      "cells": [
        "Arunkumar26",
        "YU8K91",
        "London",
        "Hotel Sunshine",
        "Standard",
        "1 - One",
        "06/08/2021",
        "07/08/2021",
        "2 - Two",
        "1 - One",
        "Arun",
        "kumar",
        "chennai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Arunkumar26\" \"YU8K91\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter_and_click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select all the fields \"London\" \"Hotel Sunshine\" \"Standard\" \"1 - One\" \"06/08/2021\" \"07/08/2021\" \"2 - Two\" \"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_select_all_the_fields(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click hotel and click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_click_hotel_and_click_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select all the fields \"Arun\" \"kumar\" \"chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_select_all_the_fields(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should  enter",
  "rows": [
    {
      "cells": [
        "creditno",
        "cardtype",
        "expiryM",
        "expiryY",
        "cvv"
      ]
    },
    {
      "cells": [
        "1234567887654321",
        "Visa",
        "June",
        "2022",
        "789"
      ]
    },
    {
      "cells": [
        "8765432112345678",
        "Master card",
        "July",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "4321890765443321",
        "American Express",
        "August",
        "2022",
        "321"
      ]
    },
    {
      "cells": [
        "8695432112345678",
        "Master card",
        "March",
        "2022",
        "432"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_enter(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get Order ID",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_get_Order_ID()"
});
formatter.result({
  "status": "passed"
});
});