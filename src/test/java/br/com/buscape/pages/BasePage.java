package br.com.buscape.pages;

import br.com.buscape.util.Elements;
import org.openqa.selenium.By;

public class BasePage extends Elements {

    // Clicar
    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    // Escrever
    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }

    // Ler texto
    public static String getText(By by) {
        waitElement(by);
        return element(by).getText();
    }

    // Recuperar url atual
/*    public static String getCurrentUrl(By by) {
        waitElement(by);
        //return element(by).getCurrentUrl();
        return driver.getCurrentUrl();
    }*/

}
