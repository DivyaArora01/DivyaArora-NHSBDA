Feature:Check NHS costs for person from Wales
  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need


  Background:
    Given User navigate to URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    Then user is navigated to NHS page -Check what help you could get to pay for NHS costs - NHSBSA
    When User click on Start Now
    And  user Select the country as Wales
    And user click on Next Button
    Then user is navigated to What is your date of birth? -Check what help you could get to pay for NHS costs - NHSBSA" page.


  Scenario: Verify if user is below 16 years old, he must get help with NHS Costs

    When user enter day as "20"
    And user enter month as "05"
    And user enter year as "2010"
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs
    And he can view list of all the free benefits he is eligible for.


  Scenario: Verify user aged 19 and above get help with NHS costs  if he and/or his partner get Universal Credit and their combined take-home pay is less than £935.
    When user enter day, month and year as
      | day | month | year |
      | 25  | 08    | 1987 |
    And user click on Next Button
    Then user is navigated to next page to select appr
    When user yes for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for- Do you or your partner claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you or your partner get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - As part of your joint Universal Credit, do you have any of these?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Did you and your partner have a combined take-home pay of '"£935"' or less in your last Universal Credit period?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs
    And he can view list of all the free benefits he is eligible for.


  Scenario: Verify user get help with NHS costs if he is 16, 17 or 18 years old and in full-time education.
    When user enter the day, month and year as
      | day | month | year |
      | 10  | 09    | 2003 |
    And user click on Next Button
    Then User is navigated to next page.
    When user click yes for - Are you in full-time education?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs
    And he can view list of all the free benefits he is eligible for.


  Scenario: Verify user aged 19 and above get help with NHS costs if he gets qualifying tax credits and have a household income of £15,276 or less.
    Given user enter day, month and year as
      | day | month | year |
      | 22  | 08    | 1972 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select tax credits for - Do you or your partner get any of these benefits?
    And user click on Next Button
    Then User is navigated to next page.
    When User select Working Tax Credit and Child Tax Credit together for - Which type of tax credits do you get?
    And user click on Next Button
    Then User is navigated to next page.
    When User select yes for -Is your household income "£15,276" or less?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs

  Scenario: Verify user aged 19 and above, get help with NHS costs if he gets Income Support

    Given user enter day, month and year as
      | day | month | year |
      | 2  | 08    | 1963 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select income support for - Do you or your partner get any of these benefits?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs

  Scenario: Verify user aged 19 and above, get help with NHS costs if he get income-related Employment and Support Allowance (ESA)
    Given user enter day, month and year as
      | day | month | year |
      | 22  | 08    | 1970 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select Employment and Support Allowance (ESA) for - Do you or your partner get any of these benefits?
    And user click on Next Button
    When user select Income-related ESA for -Which type of Employment and Support Allowance (ESA) do you get?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs

  Scenario: Verify user aged 19 and above, get help with NHS costs if he get help from local council to pay for his care home
    Given user enter day, month and year as
      | day | month | year |
      | 21  | 08    | 1988 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select Employment and Support Allowance (ESA) for - Do you or your partner get any of these benefits?
    And user click on Next Button
    When user select Contribution-based ESA for -Which type of Employment and Support Allowance (ESA) do you get?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Are you pregnant or have you given birth in the last "12" months?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you have an injury or illness caused by serving in the armed forces?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you have diabetes?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you have glaucoma?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you live permanently in a care home?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you get help to pay for your care home from your local council?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs

  Scenario: Verify user aged 19 and above, get help with NHS costs if he get Pension Credit Guarantee Credit
    Given user enter day, month and year as
      | day | month | year |
      | 26  | 08    | 1947 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select Pension Credit for - Do you or your partner get any of these benefits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select Guarantee Credit with Savings Credit for - What type of Pension Credit do you get?
    And user click on Next Button
    Then user see the success message - Based on what you've told us, You get help with NHS costs


  @negative_cases
  Scenario: Verify error message if he user select both ESA and JSA for- what benefits he gets.
    Given user enter day, month and year as
      | day | month | year |
      | 02  | 08    | 1983 |
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you live with a partner?
    And user click on Next Button
    Then User is navigated to next page.
    When user select yes for - Do you claim any benefits or tax credits?
    And user click on Next Button
    Then User is navigated to next page.
    When user select No for - Do you get paid Universal Credit?
    And user click on Next Button
    Then User is navigated to next page.
    When user read the given information
    And user click on Next Button
    Then User is navigated to next page.
    When user select All benefits (Tax, Income, ESA, JSA, Pension) for - Do you or your partner get any of these benefits?
    And user click on Next Button
    Then User gets an error message -ESA and JSA cannot be claimed together. Select which benefit you get or select no.

  Scenario Outline: Verify user get error message if DOB field is blank or incomplete
    Given user enter "<day>","<month>" and "<year>"
    And user click on Next Button
    Then user should get error message - There is a problem Enter your date of Birth

    Examples: | day | month | year |
    |     |       |      |
    | 12  |       |      |
    |     | 06    |      |
    |     |       | 2010 |

  Scenario: Verify user get error message if he do not select yes or no option.
    Given user enter day, month and year as
      | day | month | year |
      | 2   | 08    | 1967 |
    And user click on Next Button
    Then User is navigated to next page.
    When user do not select any option for - Do you live with a partner?
    And  user click on Next Button
    Then user shall get error message - There is a problem, Select yes if you live with a partner








