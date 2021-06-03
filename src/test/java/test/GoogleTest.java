package test;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import steps.GoogleSteps;

public class GoogleTest {
    @Steps
    GoogleSteps pasos = new GoogleSteps();

    @Before
    public void before(){
        SeleniumWebDriver.firefoxDriver("https://www.google.com/");
    }
    @Test
    public void test(){
        pasos.searchKeyOnGoogle("Champions League final");
    }
    @After
    public void after(){

    }
}
