package PageObject;


import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check_for_help_paying_NHS_cost {

    WebDriverWait wait;
    WebDriver driver;

    //Locators
    @FindBy(id = "nhsuk-cookie-banner__link_accept_analytics")
    public WebElement acceptcookies;
    @FindBy(xpath = ("//input[@value=\"Start now\"]"))
    public WebElement startnowbutton;
    @FindBy(id = "label-wales")
    public WebElement countryname;
    @FindBy(id = "next-button")
    public WebElement nextbutton;
    @FindBy(id = "dob-day")
    public WebElement selectday;
    @FindBy(id = "dob-month")
    public WebElement selectmonth;
    @FindBy(id = "dob-year")
    public WebElement selectyear;
    @FindBy(id = "next-button")
    public WebElement nextbutton1;
    @FindBy(xpath = "//span[@class='heading-secondary']")
    public WebElement success;
    @FindBy(id = "label-no")
    public WebElement selectno;
    @FindBy(id = "label-yes")
    public WebElement selectyes;
    @FindBy(xpath = "//label[@for=\"yes-universal\"]")
    public WebElement yes_universal_credit;
    @FindBy(xpath = "//label[@for=\"not-yet\"]")
    public WebElement no_universal_credit;
    @FindBy(xpath = "//label[@for=\"different-benefit\"]")
    public WebElement get_different_benefit;
    @FindBy(xpath = "//label[@for=\"taxCredit\"]")
    public WebElement taxcredits;
    @FindBy(xpath = "//label[@for=\"incSupport\"]")
    public WebElement IncomeSupport;
    @FindBy(xpath = "//label[@for=\"esa\"]")
    public WebElement ESA;
    @FindBy(xpath = "//label[@for=\"jsa\"]")
    public WebElement JSA;
    @FindBy(xpath = "//label[@for=\"penCredit\"]")
    public WebElement pensioncredit;
    @FindBy(id = "error-summary-heading")
    public WebElement errormsgforESAandJSA;
    @FindBy(xpath = "//label[@for=\"workingChildTaxCredit\"]")
    public WebElement workingandchildtaxcredit;
    @FindBy(xpath = "//label[@for=\"income-esa\"]")
    public WebElement incomeesa;
    @FindBy(xpath = "//label[@for=\"contribution-esa\"]")
    public WebElement contributionesa;
    @FindBy(xpath = "//label[@for=\"guaranteecreditwithsavingcredit\"]")
    public WebElement guranteecreditwithsaving;
    @FindBy(id = "error-summary-heading")
    public WebElement error;


    //constructor
    public Check_for_help_paying_NHS_cost(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //actions
    public void clickacceptcookies() {
        acceptcookies.click();

    }

    public void clickstartnowbutton() {
        wait = new WebDriverWait(DriverFactory.driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(startnowbutton));

        startnowbutton.click();
    }

    public void selectcountryname() {
        countryname.click();
    }

    public void clicknextbutton() {
        nextbutton.click();
    }

    public void enterdate(String day) {
        selectday.sendKeys(day);
    }

    public void entermonth(String month) {
        selectmonth.sendKeys(month);
    }

    public void enteryear(String year) {
        selectyear.sendKeys(year);
    }

    public void clicknextbutton1() {
        nextbutton1.click();
    }

    public void successmsg() {
        String s = success.getText();
        System.out.println(s);
    }

    public void clickselectyes() {
        selectyes.click();
    }

    public void clickselectno() {
        selectno.click();
    }

    public void clickyesuniversalcredit() {
        yes_universal_credit.click();
    }

    public void clicknouniversalcredit() {
        no_universal_credit.click();
    }

    public void clickdifferentcredit() {
        get_different_benefit.click();
    }

    public void clicktaxcredits() {
        taxcredits.click();
    }

    public void clickIncomeSupport() {
        IncomeSupport.click();
    }

    public void clickESA() {
        ESA.click();
    }

    public void clickJSA() {
        JSA.click();
    }

    public void clickpensioncredit() {
        pensioncredit.click();
    }

    public void geterrormsgforESAandJSA() {
        String S = errormsgforESAandJSA.getText();
        System.out.println(S);
    }

    public void clickworkingandchildtaxcredit() {
        workingandchildtaxcredit.click();
    }

    public void clickincomeesa() {
        incomeesa.click();
    }

    public void clickcontributionesa() {
        contributionesa.click();
    }

    public void clickguranteecreditwithsavingc() {
        guranteecreditwithsaving.click();
    }

    public void geterrormsg() {
        String errmsg = error.getText();
        System.out.println(errmsg);
    }
}
