package br.com.buscape.steps;

import br.com.buscape.pages.CupomPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CupomSteps {
    CupomPage cupomPage = new CupomPage();

    @Entao("devo ser redirecionado para a tela de cupons")
    public void visualizarTextoDeCuponsNaTela() {
        Assert.assertEquals("Cupons de desconto,\n" +
                "ofertas e cashback", cupomPage.validarTextoCuponsNaTela());
        Assert.assertEquals("https://www.buscape.com.br/cupom-de-desconto", cupomPage.validarUrlAtual());
    }

    @Quando("clico no botão Pegar Cupom")
    public void clicarEmPegarCupons() throws InterruptedException {
        cupomPage.clicarNoBotaoPegarCupom();
        Thread.sleep(2000);
    }

    @Entao("devo visualizar o cupom na tela")
    public void visualizarTextoDoCupomSelecionadoNaTela() {
        Assert.assertTrue(cupomPage.validarUrlAtual().contains("?promotion="));
    }

    @Quando("clico no botão Ir para a loja")
    public void clicarEmIrParaLoja() throws InterruptedException {
        Thread.sleep(2000);
        cupomPage.clicarNoBotaoIrParaLoja();
    }

    @Entao("devo ser redirecionado para o site da loja do cupom")
    public void visualizarUrlDoCupomSelecionadoNaTela() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertNotEquals("https://www.buscape.com.br/cupom-de-desconto", cupomPage.validarUrlAtual());
    }

    @E("preencho o search com um nome de loja válido")
    public void preencherCampoPesquisaValido() {
        cupomPage.preencherCampoPesquisaValido();
    }

    @Quando("clico no botão da loja")
    public void clicarEmLoja() throws InterruptedException {
        cupomPage.clicarNoBotaoLoja();
    }

    @Entao("devo visualizar os cupons desta loja")
    public void visualizarCuponsDaLojaNaTela() {
        Assert.assertEquals("Cupons de desconto e cashback na Amazon",
                cupomPage.validarTextoCuponsLojaNaTela());
    }

    @Quando("preencho o search com caracteres inválidos")
    public void preencherCampoPesquisaInvalido() {
        cupomPage.preencherCampoPesquisaInvalido();
    }

    @Entao("devo visualizar mensagem de erro 'Ops, não encontramos resultados para a sua pesquisa.'")
    public void visualizarErroLojaNaTela() {
        Assert.assertEquals("Ops, não encontramos resultados para a sua pesquisa.",
                cupomPage.validarTextoErroLojaNaTela());
    }

}
