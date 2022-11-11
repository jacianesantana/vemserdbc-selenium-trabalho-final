package br.com.buscape.steps;

import br.com.buscape.pages.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Dado("que estou na página Home")
    public void telaHome() {
    }

    @E("que acesso Categorias")
    public void acessarPaginaCategorias() {
        homePage.clicarNoBotaoCategorias();
    }

    @Quando("acesso Cashback")
    public void acessarPaginaCashback() {
        homePage.clicarNoBotaoCashback();
    }

}

