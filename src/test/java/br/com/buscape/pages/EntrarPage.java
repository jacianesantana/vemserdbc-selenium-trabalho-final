package br.com.buscape.pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class EntrarPage extends BasePage{
    Faker faker = new Faker();

    private static final By textValidateEnter =
            By.cssSelector("#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > p");

    private static final By campoEmail =
            By.cssSelector("[id=\"email\"]");

    private static final By bntAvancar =
            By.cssSelector("#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > div.tags__FormGroup-sc-160wlc5-0.iAIdTC.focused.valid.form-group > button");

    private static final By textValidateEmail =
            By.cssSelector("#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > div > h1");

    private static final By textValidateCodeEmail =
            By.cssSelector("#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > div > p:nth-child(1)");

    private static final By textValidateEmailEnter =
            By.cssSelector("#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > div > p.tags__P-sc-havy7z-1.tags__Email-sc-havy7z-2.caCuex.hVLFZP");
    @Step("Validar texto Entre e aproveite informado na tela")
    public String validarTextoEntreNaTela() {
        return getText(textValidateEnter);
    }

    @Step("Preencher campo com email válido")
    public void preencherCampoEmailValido() {
        sendKeys(campoEmail, faker.internet().emailAddress());
    }

    @Step("Preencher campo com email inválido")
    public void preencherCampoEmailInvalido() {
        sendKeys(campoEmail, "hahaha@haha");
    }

    @Step("Preencher campo com email cadastrado")
    public void preencherCampoEmailCadastrado() {
        sendKeys(campoEmail, "teste@teste.com");
    }

    @Step("Clicar no botão avançar")
    public void clicarNoBotaoAvancar() {
        click(bntAvancar);
    }

    @Step("Validar texto Email valido na tela")
    public String validarTextoEmailNaTela() {
        return getText(textValidateEmail);
    }

    @Step("Validar texto codigo do email na tela")
    public String validarTextoCodigoNaTela() {
        return getText(textValidateCodeEmail);
    }

    @Step("Validar texto do email do usuario na tela")
    public String validarTextoEmailUsuarioNaTela() {
        return getText(textValidateEmailEnter);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }
}
