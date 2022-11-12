package br.com.buscape.steps;

import br.com.buscape.pages.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Dado("que estou na página Home")
    public void telaHome() {
    }

    @E("acesso Categorias")
    public void acessarPaginaCategorias() {
        homePage.clicarNoBotaoCategorias();
    }

    @Quando("acesso Cashback")
    public void acessarPaginaCashback() {
        homePage.clicarNoBotaoCashback();
    }

    @E("clico no botão Informe seu CEP")
    public void clicarEmInformeSeuCep() {
        homePage.clicarNoBotaoInformeSeuCep();
    }

    @Entao("devo visualizar o CEP informado na tela home")
    public void visualizarCepInformadoNaTela() {
        Assert.assertEquals("49063-106", homePage.validarTextoCepInformadoNaTela());
        Assert.assertEquals("https://www.buscape.com.br/", homePage.validarUrlAtual());
    }

    @Entao("devo continuar visualizando Informe seu CEP na tela home")
    public void visualizarTextoInformeSeuCepNaTela() {
        Assert.assertEquals("Informe seu CEP", homePage.validarTextoInformeSeuCepNaTela());
    }

}
