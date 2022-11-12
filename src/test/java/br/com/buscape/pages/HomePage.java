package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By btnCategorias =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_" +
                    "VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > " +
                    "div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(1) > div");
    private static final By btnCashback =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_" +
                    "VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > " +
                    "div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(6) > a");

    private static final By btnInformeSeuCep =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_VariantBlack" +
                    "Friday__PcBIq.DoubleHeader_second-line__qIShd > div > div > div.col-lg-2 > div > button");

    private static final By textValidateCepInformado =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_" +
                    "VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > div.col-lg-2 > " +
                    "div > button > span.Text_Text__VJDNU.Text_LabelSmRegular__qvxsr.ButtonWithIcon_" +
                    "Label__H5xe9.AddressRegion_ButtonLabel__e4sf4 > span:nth-child(3)");

    private static final By btnEntrar =
            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_newUserItem__h56oR.col-xl-3.col-lg-4 > div > div");

//    private static final By bntPesquisa =
//            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_newSearchItem__tZRA_.col-xl-7.col-lg-6.col-sm-12 > div > div > div.AutoCompleteStyle_AutoSuggestWrapper__ssh4E > div > div.AutoCompleteStyle_autocomplete__qMJ_3 > button > span > svg");
//
//    private static final By campoPesquisa =
//            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_newSearchItem__tZRA_.col-xl-7.col-lg-6.col-sm-12 > div > div > div.AutoCompleteStyle_AutoSuggestWrapper__ssh4E > div > div.AutoCompleteStyle_autocomplete__qMJ_3 > input");
//
//    private static final By textValidatePesquisa =
//            By.cssSelector("#__next > div.Content_Container__heIrp.container-lg > div > div.col-lg-9 > div.SearchHeader_headerWidget__7L4Rc > div > h1");

    private static final By bntCupons =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > div.DoubleHeader_second-column__OFGbE.col > nav > ul > li:nth-child(3) > a > span.Text_Text__VJDNU.Text_LabelSmRegular__qvxsr.ButtonWithIcon_Label__H5xe9");

    @Step("Clicar em Categorias")
    public void clicarNoBotaoCategorias() {
        click(btnCategorias);
    }

    @Step("Clicar em Cashback")
    public void clicarNoBotaoCashback() {
        click(btnCashback);
    }

    @Step("Clicar em Informe seu CEP")
    public void clicarNoBotaoInformeSeuCep() {
        click(btnInformeSeuCep);
    }

    @Step("Validar texto CEP informado na tela")
    public String validarTextoCepInformadoNaTela() {
        return getText(textValidateCepInformado);
    }

    @Step("Validar texto Informe seu CEP na tela")
    public String validarTextoInformeSeuCepNaTela() {
        return getText(btnInformeSeuCep);
    }
    @Step
    public void clicarNoBotaoEntrar() {
        click(btnEntrar);
    }

//    @Step
//    public void clicarNoBotaoPesquisa() {
//        click(bntPesquisa);
//    }
//
//    @Step("Preencher campo com pesquisa valido")
//    public void preencherCampoPesquisaValido() {
//        sendKeys(campoPesquisa, "Celular");
//    }
//
//    @Step("Preencher campo com pesquisa valido com bug de espaço")
//    public void preencherCampoPesquisaBug() {
//        sendKeys(campoPesquisa, "macbook-pro");
//    }
//
//    @Step("Preencher campo com pesquisa invalido")
//    public void preencherCampoPesquisaInvalido() {
//        sendKeys(campoPesquisa, "!@#123157871231@#ewfasf");
//    }
//
//    @Step("Validar texto da Pesquisa na tela")
//    public String validarTextoPesquisaNaTela() {
//        return getText(textValidatePesquisa);
//    }

    @Step
    public void clicarNoBotaoCupons() {
        click(bntCupons);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}
