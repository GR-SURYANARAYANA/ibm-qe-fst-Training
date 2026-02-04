package BDD.Activity2.testRunner;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = Constants.GLUE_PROPERTY_NAME,
        value = "BDD/Activity2/stepDefination")
@IncludeTags("activity2")

public class TestRunner {

}