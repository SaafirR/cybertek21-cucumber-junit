package com.cybertek.step_definitions;

import com.cybertek.pages.DropDownsPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    DropDownsPage dropDownsPage = new DropDownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");




    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {


        Select monthDropdown = new Select(dropDownsPage.monthDropdown);

        List<WebElement> monthAsWebElements = monthDropdown.getOptions();

        List<String> monthAsString = new ArrayList<>();

        for (WebElement each : monthAsWebElements) {
            monthAsString.add(each.getText());
        }

        //Assertion will compare the size of the lists first.
        //If sizes are equal it will compare the sizes of the list

        Assert.assertTrue(expectedList.equals(monthAsString));


    }
}