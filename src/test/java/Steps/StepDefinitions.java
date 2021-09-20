package Steps;

import Base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class StepDefinitions {
    @Given("User navigate to URL {string}")
    public void user_navigate_to_url(String URL) {
        BasePage.driverUtils.navigateToUrl(URL);
    }

    @Then("user is navigated to NHS page -Check what help you could get to pay for NHS costs - NHSBSA")
    public void user_is_navigated_to_nhs_page_check_what_help_you_could_get_to_pay_for_nhs_costs_nhsbsa() {
        BasePage.check_for_help_paying_nhs_cost.clickacceptcookies();

    }

    @When("User click on Start Now")
    public void user_click_on_start_now() {
        BasePage.check_for_help_paying_nhs_cost.clickstartnowbutton();

    }

    @When("user Select the country as Wales")
    public void user_select_the_country_as_wales() {
        BasePage.check_for_help_paying_nhs_cost.selectcountryname();

    }

    /* @When("user click on Next Button")
     public void user_click_on_next_button(){
         BasePage.check_for_help_paying_nhs_cost.clicknextbutton();

     }*/
    @Then("user is navigated to What is your date of birth? -Check what help you could get to pay for NHS costs - NHSBSA\" page.")
    public void user_is_navigated_to_what_is_your_date_of_birth_check_what_help_you_could_get_to_pay_for_nhs_costs_nhsbsa_page() {


    }

    @When("user enter day as {string}")
    public void user_enter_day_as(String date) {
        BasePage.check_for_help_paying_nhs_cost.enterdate(date);

    }

    @When("user enter month as {string}")
    public void user_enter_month_as(String month) {
        BasePage.check_for_help_paying_nhs_cost.entermonth(month);

    }

    @When("user enter year as {string}")
    public void user_enter_year_as(String year) {
        BasePage.check_for_help_paying_nhs_cost.enteryear(year);

    }

    @When("user click on Next Button")
    public void user_click_on_next_button() {
        BasePage.check_for_help_paying_nhs_cost.clicknextbutton1();

    }

    @Then("user see the success message - Based on what you've told us, You get help with NHS costs")
    public void user_see_the_success_message_based_on_what_you_ve_told_us_you_get_help_with_nhs_costs() {
        BasePage.check_for_help_paying_nhs_cost.successmsg();

    }

    @Then("he can view list of all the free benefits he is eligible for.")
    public void he_can_view_list_of_all_the_free_benefits_he_is_eligible_for() {

    }

    @When("user enter day, month and year as")
    public void user_enter_day_month_and_year_as(io.cucumber.datatable.DataTable dataTable) {
        BasePage.check_for_help_paying_nhs_cost.enterdate(dataTable.cell(1, 0));
        BasePage.check_for_help_paying_nhs_cost.entermonth(dataTable.cell(1, 1));
        BasePage.check_for_help_paying_nhs_cost.enteryear(dataTable.cell(1, 2));

    }

    @Then("user is navigated to next page to select appr")
    public void user_is_navigated_to_next_page_to_select_appr() {


    }

    @When("user yes for - Do you live with a partner?")
    public void user_yes_for_do_you_live_with_a_partner() {

        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @Then("User is navigated to next page.")
    public void user_is_navigated_to_next_page() {

    }

    @When("user select yes for- Do you or your partner claim any benefits or tax credits?")
    public void user_select_yes_for_do_you_or_your_partner_claim_any_benefits_or_tax_credits() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select yes for - Do you or your partner get paid Universal Credit?")
    public void user_select_yes_for_do_you_or_your_partner_get_paid_universal_credit() {
        BasePage.check_for_help_paying_nhs_cost.clickyesuniversalcredit();
    }

    @When("user select yes for - As part of your joint Universal Credit, do you have any of these?")
    public void user_select_yes_for_as_part_of_your_joint_universal_credit_do_you_have_any_of_these() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }


    @When("user select yes for - Did you and your partner have a combined take-home pay of {string} or less in your last Universal Credit period?")
    public void userSelectYesForDidYouAndYourPartnerHaveACombinedTakeHomePayOfOrLessInYourLastUniversalCreditPeriod(String A) {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user enter the day, month and year as")
    public void user_enter_the_day_month_and_year_as(io.cucumber.datatable.DataTable dataTable) {
        BasePage.check_for_help_paying_nhs_cost.enterdate(dataTable.cell(1, 0));
        BasePage.check_for_help_paying_nhs_cost.entermonth(dataTable.cell(1, 1));
        BasePage.check_for_help_paying_nhs_cost.enteryear(dataTable.cell(1, 2));

    }

    @When("user click yes for - Are you in full-time education?")
    public void user_click_yes_for_are_you_in_full_time_education() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();

    }

    @When("user select No for - Do you live with a partner?")
    public void user_select_no_for_do_you_live_with_a_partner() {
        BasePage.check_for_help_paying_nhs_cost.clickselectno();
    }

    @When("user select yes for - Do you claim any benefits or tax credits?")
    public void user_select_yes_for_do_you_claim_any_benefits_or_tax_credits() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select No for - Do you get paid Universal Credit?")
    public void user_select_no_for_do_you_get_paid_universal_credit() {
        BasePage.check_for_help_paying_nhs_cost.clicknouniversalcredit();
    }

    @When("user read the given information")
    public void user_read_the_given_information() {

    }

    @When("user select All benefits \\(Tax, Income, ESA, JSA, Pension) for - Do you or your partner get any of these benefits?")
    public void userSelectAllBenefitsTaxIncomeESAJSAPensionForDoYouOrYourPartnerGetAnyOfTheseBenefits() {
        BasePage.check_for_help_paying_nhs_cost.clickIncomeSupport();
        BasePage.check_for_help_paying_nhs_cost.clickESA();
        BasePage.check_for_help_paying_nhs_cost.clickJSA();
        BasePage.check_for_help_paying_nhs_cost.clickpensioncredit();
        BasePage.check_for_help_paying_nhs_cost.clicktaxcredits();
    }

    @Then("User gets an error message -ESA and JSA cannot be claimed together. Select which benefit you get or select no.")
    public void userGetsAnErrorMessageESAAndJSACannotBeClaimedTogetherSelectWhichBenefitYouGetOrSelectNo() {
        BasePage.check_for_help_paying_nhs_cost.geterrormsgforESAandJSA();
    }

    @When("user select tax credits for - Do you or your partner get any of these benefits?")
    public void userSelectTaxCreditsForDoYouOrYourPartnerGetAnyOfTheseBenefits() {
        BasePage.check_for_help_paying_nhs_cost.clicktaxcredits();

    }

    @When("User select Working Tax Credit and Child Tax Credit together for - Which type of tax credits do you get?")
    public void userSelectWorkingTaxCreditAndChildTaxCreditTogetherForWhichTypeOfTaxCreditsDoYouGet() {
        BasePage.check_for_help_paying_nhs_cost.clickworkingandchildtaxcredit();
    }

    @When("User select yes for -Is your household income {string} or less?")
    public void userSelectYesForIsYourHouseholdIncomeOrLess(String S) {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select income support for - Do you or your partner get any of these benefits?")
    public void userSelectIncomeSupportForDoYouOrYourPartnerGetAnyOfTheseBenefits() {
        BasePage.check_for_help_paying_nhs_cost.clickIncomeSupport();
    }

    @When("user select Employment and Support Allowance \\(ESA) for - Do you or your partner get any of these benefits?")
    public void userSelectEmploymentAndSupportAllowanceESAForDoYouOrYourPartnerGetAnyOfTheseBenefits() {
        BasePage.check_for_help_paying_nhs_cost.clickESA();

    }

    @When("user select Income-related ESA for -Which type of Employment and Support Allowance \\(ESA) do you get?")
    public void userSelectIncomeRelatedESAForWhichTypeOfEmploymentAndSupportAllowanceESADoYouGet() {
        BasePage.check_for_help_paying_nhs_cost.clickincomeesa();
    }

    @When("user select Contribution-based ESA for -Which type of Employment and Support Allowance \\(ESA) do you get?")
    public void userSelectContributionBasedESAForWhichTypeOfEmploymentAndSupportAllowanceESADoYouGet() {
        BasePage.check_for_help_paying_nhs_cost.clickcontributionesa();
    }


    @When("user select yes for - Do you have an injury or illness caused by serving in the armed forces?")
    public void userSelectYesForDoYouHaveAnInjuryOrIllnessCausedByServingInTheArmedForces() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select yes for - Do you have diabetes?")
    public void userSelectYesForDoYouHaveDiabetes() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();


    }

    @When("user select yes for - Do you have glaucoma?")
    public void userSelectYesForDoYouHaveGlaucoma() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select yes for - Do you live permanently in a care home?")
    public void userSelectYesForDoYouLivePermanentlyInACareHome() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();

    }

    @When("user select yes for - Do you get help to pay for your care home from your local council?")
    public void userSelectYesForDoYouGetHelpToPayForYourCareHomeFromYourLocalCouncil() {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select yes for - Are you pregnant or have you given birth in the last {string} months?")
    public void userSelectYesForAreYouPregnantOrHaveYouGivenBirthInTheLastMonths(String A) {
        BasePage.check_for_help_paying_nhs_cost.clickselectyes();
    }

    @When("user select Pension Credit for - Do you or your partner get any of these benefits?")
    public void userSelectPensionCreditForDoYouOrYourPartnerGetAnyOfTheseBenefits() {
        BasePage.check_for_help_paying_nhs_cost.clickpensioncredit();

    }

    @When("user select Guarantee Credit with Savings Credit for - What type of Pension Credit do you get?")
    public void userSelectGuaranteeCreditWithSavingsCreditForWhatTypeOfPensionCreditDoYouGet() {
        BasePage.check_for_help_paying_nhs_cost.clickguranteecreditwithsavingc();
    }


    @Then("user should get error message - There is a problem Enter your date of Birth")
    public void user_should_get_error_message_there_is_a_problem_enter_your_date_of_birth() {

        BasePage.check_for_help_paying_nhs_cost.geterrormsg();
    }


    @Given("user enter {string},{string} and {string}")
    public void userEnterAnd(String dt, String yr, String mn) {

        BasePage.check_for_help_paying_nhs_cost.enterdate(dt);
        BasePage.check_for_help_paying_nhs_cost.enteryear(yr);
        BasePage.check_for_help_paying_nhs_cost.entermonth(mn);

    }

    @When("user do not select any option for - Do you live with a partner?")
    public void user_do_not_select_any_option_for_do_you_live_with_a_partner() {

    }


    @Then("user shall get error message - There is a problem, Select yes if you live with a partner")
    public void userShallGetErrorMessageThereIsAProblemSelectYesIfYouLiveWithAPartner() {
        BasePage.check_for_help_paying_nhs_cost.geterrormsg();
    }


}