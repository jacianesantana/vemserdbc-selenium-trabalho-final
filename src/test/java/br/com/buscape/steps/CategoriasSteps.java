package br.com.buscape.steps;

import br.com.buscape.pages.CategoriasPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CategoriasSteps {

    CategoriasPage categoriasPage = new CategoriasPage();

    @E("clico no botão categoria")
    public void clicarEmUmaCategoria() {
        categoriasPage.clicarNoBotaoCategoria();
    }

    @Quando("clico no botão subcategoria")
    public void clicarEmUmaSubcategoria() {
        categoriasPage.clicarNoBotaoSubCategoria();
    }

    @Entao("devo ser redirecionado para a tela da subcategoria escolhida")
    public void visualizarTelaDeProdutosPorSubcategoria() {
        Assert.assertEquals("Notebook Macbook Air", categoriasPage.validarTextoCategoriaEscolhidaNaTela());
        //Assert.assertTrue(categoriasPage.checkboxLinhaSelecionado());
        Assert.assertEquals("https://www.buscape.com.br/notebook/macbook-air",
                categoriasPage.validarUrlAtual());
    }

}
