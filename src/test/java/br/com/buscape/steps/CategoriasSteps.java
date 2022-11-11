package br.com.buscape.steps;

import br.com.buscape.pages.CategoriasPage;
import br.com.buscape.pages.HomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class CategoriasSteps extends BaseSteps {

    // Instanciar
    HomePage homePage = new HomePage();
    CategoriasPage categoriasPage = new CategoriasPage();

    @Test
    @Epic("Categorias")
    @DisplayName("Validar busca produtos por Categoria")
    public void deveBuscarProdutosPorCategoria() {
        homePage.clicarNoBotaoCategorias();

        categoriasPage.clicarNoBotaoCategoria();
        categoriasPage.clicarNoBotaoSubCategoria();

        Assert.assertEquals("Notebook Macbook Air", categoriasPage.validarTextoCategoriaEscolhidaNaTela());
        //Assert.assertTrue(categoriasPage.checkboxLinhaSelecionado());
        Assert.assertEquals("https://www.buscape.com.br/notebook/macbook-air",
                categoriasPage.validarUrlAtual());
    }

}
