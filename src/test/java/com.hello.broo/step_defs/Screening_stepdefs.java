package com.hello.broo.step_defs;

import io.cucumber.java.en.Given;

import com.hello.broo.Driver_utilities;





public class Screening_stepdefs {


    @Given("^Launch cross browser screening url \"([^\"]*)\"$")
    public void Screening_browser_url(String browserName) {

        Driver_utilities.chromeBrowser(browserName);


    }



}
