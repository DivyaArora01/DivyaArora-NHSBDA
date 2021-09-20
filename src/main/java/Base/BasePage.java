package Base;

import PageObject.Check_for_help_paying_NHS_cost;
import Utils.DriverFactory;
import Utils.DriverUtils;

public class BasePage {

    public static DriverUtils driverUtils;
    public static Check_for_help_paying_NHS_cost check_for_help_paying_nhs_cost;

public static void initpage(){
driverUtils =new DriverUtils();
check_for_help_paying_nhs_cost =new Check_for_help_paying_NHS_cost(DriverFactory.driver);

}
}
