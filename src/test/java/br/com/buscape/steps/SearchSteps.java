package br.com.buscape.steps;

import br.com.buscape.pages.SearchPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    @E("preencho campo search com nome de categoria válido")
    public void preencherCampoPesquisaComCategoriaValida() {
        searchPage.preencherCampoPesquisaComCategoriaValida();
    }

    @Quando("clico no botão pesquisar")
    public void clicarEmPesquisar() {
        searchPage.clicarNoBotaoPesquisa();
    }

    @Entao("devo visualizar uma lista de produtos desta categoria")
    public void visualizarPesquisaDeCategoriaNaTela() {
        Assert.assertEquals("Celular", searchPage.validarTextoPesquisaNaTela());
        Assert.assertEquals("Categoria : Celular e Smartphone",
                searchPage.validarFiltroSelecionadoDaCategoriaNaTela());
        Assert.assertEquals("https://www.buscape.com.br/search?q=Celular", searchPage.validarUrlAtual());
    }

    @E("preencho campo search com nome de marca válido")
    public void preencherCampoPesquisaComMarcaValida() {
        searchPage.preencherCampoPesquisaComMarcaValida();
    }

    @Entao("devo visualizar uma lista de produtos desta marca")
    public void visualizarPesquisaDeMarcaNaTela() {
        Assert.assertEquals("Samsung", searchPage.validarTextoPesquisaNaTela());
        Assert.assertEquals("Categoria : Celular e Smartphone",
                searchPage.validarFiltroSelecionadoDaCategoriaNaTela());
        Assert.assertEquals("Marca : Samsung", searchPage.validarFiltroSelecionadoDaMarcaNaTela());
        Assert.assertEquals("https://www.buscape.com.br/search?q=samsung", searchPage.validarUrlAtual());
    }

    @E("preencho campo search com nome de loja válido")
    public void preencherCampoPesquisaComLojaValida() {
        searchPage.preencherCampoPesquisaComLojaValida();
    }

    @Entao("devo visualizar uma lista de produtos desta loja")
    public void visualizarPesquisaDeLojaNaTela() {
        Assert.assertEquals("Americanas", searchPage.validarTextoPesquisaNaTela());
        Assert.assertFalse(searchPage.checkboxFiltroLojaSelecionado());
        Assert.assertEquals("https://www.buscape.com.br/search?q=americanas", searchPage.validarUrlAtual());
    }

    @E("preencho campo search com caracteres inválidos")
    public void preencherCampoPesquisaComNomeInvalido() {
        searchPage.preencherCampoPesquisaInvalido();
    }

    @Entao("devo visualizar uma mensagem de erro padrão: 'Não encontramos resultados'")
    public void visualizarMensagemDeErroNaTela() {
        Assert.assertTrue("Não encontramos resultados", searchPage.validarMensagemDeErroNaTela());
        Assert.assertEquals("https://www.buscape.com.br/search?q=%21%40%23123157871231%40%23ewfasf",
                searchPage.validarUrlAtual());
    }

    @E("preencho campo search com caractere '-'")
    public void preencherCampoPesquisaComHifen() {
        searchPage.preencherCampoPesquisaComCaractereHifen();
    }

    @Entao("devo visualizar resultado com espaço substituindo o '-'")
    public void visualizarPesquisaComNomeValido() {
        Assert.assertEquals("Guarda-roupas", searchPage.validarTextoPesquisaNaTela());
        Assert.assertEquals("https://www.buscape.com.br/search?q=guarda-roupas", searchPage.validarUrlAtual());
    }

    @E("não preencho campo search")
    public void naoPreencherCampoPesquisa() {
        searchPage.naoPreencherCampoPesquisa();
    }

    @Entao("devo visualizar lista de todos os produtos")
    public void visualizarTextoCampoPesquisaVazio() {
        Assert.assertTrue("Digite sua busca...", searchPage.validarTextoCampoPesquisaVazio());
        Assert.assertEquals("https://www.buscape.com.br/", searchPage.validarUrlAtual());
    }

}
