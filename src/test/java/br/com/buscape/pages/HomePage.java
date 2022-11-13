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
            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_" +
                    "newUserItem__h56oR.col-xl-3.col-lg-4 > div > div");

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

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}
