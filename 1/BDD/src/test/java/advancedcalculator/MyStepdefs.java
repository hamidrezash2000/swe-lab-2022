package advancedcalculator;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepdefs {
    private AdvancedCalculator advancedCalculator;
    private int value1;
    private int value2;
    private char opt;
    private int result;
    @Before
    public void before() {
        advancedCalculator = new AdvancedCalculator();
    }
    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I do the opt (\\*|\\/|\\^) between them$")
    public void iAddTheTwoValues(char arg0) {
        opt = arg0;
        try {
            result = advancedCalculator.calculate(value1, value2, opt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(result);
    }
    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
