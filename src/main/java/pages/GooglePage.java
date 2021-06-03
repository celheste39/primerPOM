package pages;

import org.openqa.selenium.By;

public class GooglePage {
    static By txtGoogleSearch = By.xpath("//input[@jsaction='paste:puy29d;']");
    static By btnGoogleSearch = By.xpath("//input[@value='Buscar con Google']");
    static By resultTeam = By.xpath("//span[contains(text(),'Manchester')]");

    public static By getTxtGoogleSearch() {
        return txtGoogleSearch;
    }

    public static By getBtnGoogleSearch() {
        return btnGoogleSearch;
    }

    public static By getResultTeam() {
        return resultTeam;
    }
}
