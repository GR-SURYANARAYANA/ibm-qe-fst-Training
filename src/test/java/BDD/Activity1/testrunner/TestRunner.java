package BDD.Activity1.testrunner;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.*;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = Constants.GLUE_PROPERTY_NAME,
        value = "BDD/Activity1/stepDefinitions")
@IncludeTags("activity1")

public class TestRunner {

}