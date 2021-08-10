Feature: Verify booking in adactin hotel

Scenario Outline: Verifying adactin hotel login with valid credentials
Given User is on the login page
When  User should enter "<username>" "<password>" and click login button
And   User should select all the fields "<location>" "<hotels>" "<roomType>" "<noofRoom>" "<indate>" "<outdate>" "<adult>" "<child>"
And   User should click hotel and click Continue button
And   User should select all the fields "<fname>" "<lname>" "<address>" 
And   User should  enter
 |     creditno   | cardtype  |expiryM|expiryY|cvv|  
 |1234567887654321|   Visa    |  June |  2022 |789|
 |8765432112345678|Master card|  July |  2022 |123|
 |4321890765443321|American Express|August|2022|321|
 |8695432112345678|Master card|  March |  2022 |432|
Then  User should get Order ID



Examples: 
|username   |password|location |hotels        |roomType|noofRoom|indate    |outdate   |adult  |child  |fname|lname|address|
|Arunkumar26|YU8K91  |London   |Hotel Sunshine|Standard|1 - One |06/08/2021|07/08/2021|2 - Two|1 - One|Arun |kumar|chennai|
 