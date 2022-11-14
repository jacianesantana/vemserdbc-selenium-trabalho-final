package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class CashbackPage extends BasePage {

    // Mapeamento
    private static final By textValidatePaginaCashback =
            By.cssSelector("#__next > main > div:nth-child(1) > div > div > h1");
    private static final By btnEntenderRegras =
            By.xpath("//*[@id=\"__next\"]/main/div[11]/div/section/div[1]");
    private static final By textValidatePaginaRegrasCashback =
            By.cssSelector("#content > div.post_post_info_wrapper__3xaCC > div > h1");
    private static final By btnVerDuvidasFrequentesDeResgate =
            By.xpath("//*[@id=\"__next\"]/main/div[11]/div/section/div[2]");
    private static final By textValidatePaginaDuvidasFrequentesDeResgate =
            By.cssSelector("body > main > div > div > div > section > header > h1");
    private static final By btnVerDuvidasFrequentesDeSaldoEExtrato =
            By.xpath("//*[@id=\"__next\"]/main/div[11]/div/section/div[3]");
    private static final By textValidatePaginaDuvidasFrequentesDeSaldoEExtrato =
            By.cssSelector("body > main > div > div > div > section > header > h1");

    @Step("Validar texto página Cashback na tela")
    public String validarTextoPaginaCashbackNaTela() {
        return getText(textValidatePaginaCashback);
    }

    @Step("Clicar no botão 'Entender regras'")
    public void clicarNoBotaoEntenderRegras() throws InterruptedException {
        Actions action = new Actions(driver);

        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        j.executeScript("window.scrollBy(0,3700)");
        Thread.sleep(5000);
        action.click(element(btnEntenderRegras)).click().perform();
    }

    @Step("Validar texto página Regras Cashback na tela")
    public String validarTextoPaginaRegrasCashbackNaTela() {
        return getText(textValidatePaginaRegrasCashback);
    }

    @Step("Clicar no botão 'Ver dúvidas frequentes' de resgate")
    public void clicarNoBotaoVerDuvidasFrequentesDeResgate() throws InterruptedException {
        Actions action = new Actions(driver);

        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        j.executeScript("window.scrollBy(0,3700)");
        Thread.sleep(5000);
        action.click(element(btnVerDuvidasFrequentesDeResgate)).click().perform();
    }

    @Step("Validar texto página Duvidas Frequentes de Resgate na tela")
    public String validarTextoPaginaDuvidasFrequentesDeResgateNaTela() {
        return getText(textValidatePaginaDuvidasFrequentesDeResgate);
    }

    @Step("Clicar no botão 'Ver dúvidas frequentes' de saldo e extrato")
    public void clicarNoBotaoVerDuvidasFrequentesDeSaldoEExtrato() throws InterruptedException {
        Actions action = new Actions(driver);

        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        j.executeScript("window.scrollBy(0,3700)");
        Thread.sleep(5000);
        action.click(element(btnVerDuvidasFrequentesDeSaldoEExtrato)).click().perform();
    }
    @Step("Validar texto página Duvidas Frequentes de Saldo Extrato na tela")
    public String validarTextoPaginaDuvidasFrequentesDeSaldoEExtratoNaTela() {
        return getText(textValidatePaginaDuvidasFrequentesDeSaldoEExtrato);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}
