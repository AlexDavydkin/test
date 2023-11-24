package bigbang.qa.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;
import ru.testit.services.Adapter;

public class ExampleSteps {
//    @Step
//    @Title("1")
    @Given("I have a specific condition")
    public void specificCondition() {
        System.out.println(1);
        Adapter.addMessage("1 STEP");
    }

//    @Step
//    @Title("2")
    @When("I perform a specific action")
    public void specificAction() {
        System.out.println(2);
        Adapter.addMessage("2 STEP");
    }

//    @Step
//    @Title("3")
    @Then("I should see a specific result")
    public void specificResult() {
        System.out.println(3);
        Adapter.addMessage("3 STEP");
    }
}