package br.com.buscape.steps;

import br.com.buscape.pages.CashbackPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class CashbackSteps {

    CashbackPage cashbackPage = new CashbackPage();

    @Entao("devo ser redirecionado para a tela de cashback")
    public void exibirPaginaCashback() {
        Assert.assertEquals("O que é o Cashback Buscapé?", cashbackPage.validarTextoPaginaCashbackNaTela());
        Assert.assertEquals("https://www.buscape.com.br/landing-page/tire-suas-duvidas-sobre-o-cashback-buscape",
                cashbackPage.validarUrlAtual());
    }

    @E("clico no botão Entender Regras")
    public void clicarBotaoEntenderRegras() throws InterruptedException {
        cashbackPage.clicarNoBotaoEntenderRegras();
    }

    @Entao("devo ser redirecionado para a tela de entender regras")
    public void exibirPaginaRegrasDeCashback() {
        Assert.assertEquals("Cashback Buscapé: como funciona e como acumular",
                cashbackPage.validarTextoPaginaRegrasCashbackNaTela());
        Assert.assertEquals("https://www.buscape.com.br/all/conteudo/cashback-buscape-como-funciona",
                cashbackPage.validarUrlAtual());
    }

    @E("clico no botão Ver Dúvidas Frequentes de resgate")
    public void clicarBotaoVerDuvidasFrequentesDeResgate() throws InterruptedException {
        cashbackPage.clicarNoBotaoVerDuvidasFrequentesDeResgate();
    }

    @Entao("devo ser redirecionado para a tela de Ver Dúvidas Frequentes de Resgate")
    public void exibirPaginaDuvidasFrenquentesDeResgate() {
        Assert.assertEquals("Resgate de Cashback",
                cashbackPage.validarTextoPaginaDuvidasFrequentesDeResgateNaTela());
        Assert.assertEquals("https://tiresuaduvida.buscape.com.br/hc/pt-br/sections/4405403253524-Resgate",
                cashbackPage.validarUrlAtual());
    }

    @E("clico no botão Ver Dúvidas Frequentes de saldo e extrato")
    public void clicarBotaoVerDuvidasFrequentesDeSaldoEExtrato() throws InterruptedException {
        cashbackPage.clicarNoBotaoVerDuvidasFrequentesDeSaldoEExtrato();
    }

    @Entao("devo ser redirecionado para a tela de Ver Dúvidas Frequentes de Saldo e Extrato")
    public void exibirPaginaDuvidasFrenquentesDeSaldoEExtrato() {
        Assert.assertEquals("Saldo e extrato da carteira",
                cashbackPage.validarTextoPaginaDuvidasFrequentesDeSaldoEExtratoNaTela());
        Assert.assertEquals("https://tiresuaduvida.buscape.com.br/hc/pt-br/sections/4405408995988-Saldo-e-extrato",
                cashbackPage.validarUrlAtual());
    }

}
