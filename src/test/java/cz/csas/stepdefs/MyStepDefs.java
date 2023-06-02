package cz.csas.stepdefs;

import cz.csas.App;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepDefs {

    private String message;

    @Given("I have a Java project")
    public void iHaveAJavaProject() {
        // Code for setting up the project, if needed
    }

    @When("I run the application")
    public void iRunTheApplication() {
        message = App.getHelloMessage();
    }

    @Then("I should see {string} on the console")
    public void iShouldSeeMessageOnConsole(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }
}


