package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.GooglePage;
import static org.junit.Assert.assertEquals;

public class GoogleSteps {
    public void writeOnGoogle(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }
    public void clickElement(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public String getTextElement(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void textValidation(By elemento, String text){
        assertEquals(getTextElement(elemento), text);
    }
    public void searchKeyOnGoogle(String key){
        writeOnGoogle(GooglePage.getTxtGoogleSearch(),key);
        clickElement(GooglePage.getBtnGoogleSearch());
        textValidation(GooglePage.getResultTeam(), "Manchester City");
    }

}
