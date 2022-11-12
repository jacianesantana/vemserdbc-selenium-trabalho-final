package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class InformeSeuCepPage extends BasePage {

    private static final By campoCEP =
            By.cssSelector("[id=\"zipcode\"]");
    private static final By btnConfirmar =
            By.cssSelector("body > div.ReactModalPortal > div > div > section > div > div > form > button");
    private static final By textValidateMensagemDeErroCepInvalido =
            By.cssSelector("body > div.ReactModalPortal > div > div > section > div > div > form > div > p");

    @Step("Preencher campo com CEP válido")
    public void preencherCampoCepValido() {
        sendKeys(campoCEP, "49063106");
    }

    @Step("Preencher campo com CEP inválido")
    public void preencherCampoCepInvalido() {
        sendKeys(campoCEP, "99999999");
    }

    @Step("Preencher campo CEP com caracteres inválidos")
    public void preencherCampoCepComCaracteresInvalidos() {
        sendKeys(campoCEP, "-123abc!");
    }

    @Step("Não preencher campo CEP")
    public void naoPreencherCampoCep() {
        sendKeys(campoCEP, "");
    }

    @Step("Validar texto mensagem de erro cep")
    public String validarTextoMensagemDeErroCepInvalido() {
        return getText(textValidateMensagemDeErroCepInvalido);
    }

    @Step("Clicar no botão Confirmar")
    public void clicarNoBotaoConfirmar() {
        click(btnConfirmar);
    }

}
