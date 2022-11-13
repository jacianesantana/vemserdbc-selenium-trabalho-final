package br.com.buscape.pages;

import br.com.buscape.util.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class BasePage extends Elements {

    // Clicar
    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    // Está Selecionado
    public static Boolean isSelected(By by) {
        waitElement(by);
        return element(by).isSelected();
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
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // Elemento está presente
    public boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }

}
