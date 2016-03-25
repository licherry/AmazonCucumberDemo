package com.thoughtworks.lichen;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by chenli on 3/25/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber")
public class CucumberIT {
}
