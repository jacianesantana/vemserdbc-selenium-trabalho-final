package br.com.buscape.steps;

import br.com.buscape.pages.EntrarPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;

public class EntrarSteps {
    EntrarPage entrarPage = new EntrarPage();

    @Entao("devo ser redirecionado para a página de login")
    public void visualizarEntreEAproveiteNaTela() {
        Assert.assertEquals("Entre e aproveite\n" +
                "benefícios exclusivos!", entrarPage.validarTextoEntreNaTela());
        Assert.assertEquals("https://login.buscape.com.br/login?redirect=https%3A%2F%2Fwww.buscape.com.br%2F",
                entrarPage.validarUrlAtual());
    }

    @E("preencho email valido")
    public void preencherCampoEmailValido() {
        entrarPage.preencherCampoEmailValido();
    }

    @E("preencho email invalido")
    public void preencherCampoEmailInvalido() {
        entrarPage.preencherCampoEmailInvalido();
    }

    @Quando("clico no botão de avançar")
    public void clicarEmAvancar() {
        entrarPage.clicarNoBotaoAvancar();
    }

    @Entao("devo avançar no cadastro do sistema")
    public void visualizarMensagemDeComoDevemosTeChamar() {
        Assert.assertEquals("Como devemos te\n" +
                "chamar?", entrarPage.validarTextoEmailNaTela());
    }

    @E("preencho email cadastrado")
    public void preencherCampoEmailCadastrado() {
        entrarPage.preencherCampoEmailCadastrado();
    }

    @Entao("devo ser redirecionado para a página para entrar com o codigo de acesso enviado para o email")
    public void visualizarMensagemDeCodigoDoEmail() {
        Assert.assertEquals("Por favor, digite o código que\n" +
                "enviamos agora para:", entrarPage.validarTextoCodigoNaTela());
        Assert.assertEquals("teste@teste.com", entrarPage.validarTextoEmailUsuarioNaTela());
    }

    @Entao("não devo avançar no cadastro do sistema")
    public void naoVisualizarBotaoAvancar() {
        Assert.assertFalse(entrarPage.isElementPresent(By.cssSelector("" +
                "#__next > div > main > div > div.MainWrapper__ContainerBuscape-sc-1v1m6ca-2.cmnkOI > form > " +
                "div.tags__FormGroup-sc-160wlc5-0.iAIdTC.focused.valid.form-group > button"
        )));
    }

    @E("não preencho o campo email")
    public void preencherCampoEmailBranco() {
        entrarPage.preencherCampoEmailBranco();
    }

    @Quando("clico no botão Termos de Uso")
    public void clicarEmTermos() {
        entrarPage.clicarNoBotaoTermosDeUso();
    }

    @Quando("clico no botão Política de Privacidade")
    public void clicarEmPolitica() {
        entrarPage.clicarNoBotaoPoliticaDePrivacidade();
    }

    @Entao("devo ser redirecionado para a tela de termos de uso")
    public void visualizarTelaDeTermosDeUso() {
        Assert.assertEquals("https://www.buscape.com.br/conta/termos-de-uso", entrarPage.validarUrlAtual());
    }

    @Entao("devo ser redirecionado para a tela de política de privacidade")
    public void visualizarTelaDePoliticas() {
        Assert.assertEquals("https://www.buscape.com.br/conta/politica-de-privacidade",
                entrarPage.validarUrlAtual());
    }

    @Quando("clico no boão Continuar com Facebook")
    public void clicarEmFacebook() {
        entrarPage.clicarNoBotaoFacebook();
    }

    @Entao("devo ser redirecionado para a página do acesso Facebook")
    public void visualizarTelaDeAcessoFacebook() {
        Assert.assertTrue(entrarPage.validarUrlAtual().contains("login.buscape.com.br"));
    }

    @Quando("clico no boão Continuar com Google")
    public void clicarEmGoogle() {
        entrarPage.clicarNoBotaoGoogle();
    }

    @Entao("devo ser redirecionado para a página do acesso Google")
    public void visualizarTelaDeAcessoGoogle() {
        Assert.assertTrue(entrarPage.validarUrlAtual().contains("login.buscape.com.br"));
    }

}
