package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CupomPage extends BasePage{

    private static final By textValidateCupons =
            By.cssSelector("#__next > div > div:nth-child(2) > div.css-dvxtzn > div.css-sey1ez > h1");

    private static final By bntPegarCupon =
            By.cssSelector("#__next > div > div:nth-child(2) > div.css-dvxtzn > div.css-11hxyna > div > div.css-ycvhkc > a:nth-child(1) > div > div.highlight-card__cupom-cta.css-1tslja8");

    private static final By bntIrParaLoja =
            By.cssSelector("[class=\"chakra-button redirect-offer-button css-1w6zppw\"]");

    private static final By campoPesquisa =
            By.cssSelector("#__next > div > header > div > div > div > div.search-region.col-xl-7.col-lg-6.col-sm-12 > div > input");

    private static final By bntLoja =
            By.cssSelector("#__next > div > div:nth-child(2) > div.css-dvxtzn > div > div > div.css-1mgz10 > div > a > div");

    private static final By textValidateLoja =
            By.cssSelector("#__next > div > div:nth-child(2) > div > div > div > main > div > div > div.partner-promotions-list > div.promotions-list-header.css-1czkgpg > h1");

    private static final By textValidateErroLoja =
            By.cssSelector("#__next > div > div:nth-child(2) > div.css-dvxtzn > div > div > div.search-no-results > h1");

    @Step("Validar texto de Cupons na tela")
    public String validarTextoCuponsNaTela() {
        return getText(textValidateCupons);
    }

    @Step("Clicar em Pegar Cupom")
    public void clicarNoBotaoPegarCupom() {
        click(bntPegarCupon);
    }

    @Step("Clicar em ir para loja")
    public void clicarNoBotaoIrParaLoja() {
        click(bntIrParaLoja);
    }

    @Step("Preencher campo com pesquisa valido")
    public void preencherCampoPesquisaValido() {
        sendKeys(campoPesquisa, "Amazon");
    }

    @Step("Clicar loja")
    public void clicarNoBotaoLoja() {
        click(bntLoja);
    }

    @Step("Validar texto de Cupons da loja na tela")
    public String validarTextoCuponsLojaNaTela() {
        return getText(textValidateLoja);
    }

    @Step("Preencher campo com pesquisa invalido")
    public void preencherCampoPesquisaInvalido() {
        sendKeys(campoPesquisa, "!skhdaoksj");
    }

    @Step("Validar texto de erro de loja na tela")
    public String validarTextoErroLojaNaTela() {
        return getText(textValidateErroLoja);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }
}
