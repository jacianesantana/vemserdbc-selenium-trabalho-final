package br.com.buscape.steps;

import br.com.buscape.pages.InformeSeuCepPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class InformeSeuCepSteps {

    InformeSeuCepPage informeSeuCepPage = new InformeSeuCepPage();

    @E("preencho o campo com CEP válido")
    public void preencherCampoCepValido() {
        informeSeuCepPage.preencherCampoCepValido();
    }

    @E("preencho o campo com CEP inválido")
    public void preencherCampoCepInvalido() {
        informeSeuCepPage.preencherCampoCepInvalido();
    }

    @E("preencho o campo CEP com caracteres inválidos")
    public void preencherCampoCepComCaracteresInvalidos() {
        informeSeuCepPage.preencherCampoCepComCaracteresInvalidos();
    }

    @E("não preencho o campo CEP")
    public void naoPreencherCampoCep() {
        informeSeuCepPage.naoPreencherCampoCep();
    }

    @Quando("clico no botão Confirmar")
    public void clicarNoBotaoConfirmar() {
        informeSeuCepPage.clicarNoBotaoConfirmar();
    }

    @Entao("devo receber mensagem de erro padrão 'CEP inválido'")
    public void visualizarMensagemDeErroCepInvalido() {
        Assert.assertEquals("CEP inválido", informeSeuCepPage.validarTextoMensagemDeErroCepInvalido());
    }

}
