package Homework5;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Users\\Dell\\Homework5\\src\\test\\resources\\feature"},
        glue = {"C:\\Users\\Dell\\Homework5\\src\\test\\java\\Homework5\\steps"},
        tags = "@forumcinemas"

)
public class TestRunner {

}
