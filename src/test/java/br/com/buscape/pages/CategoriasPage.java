package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CategoriasPage extends BasePage {

    private static final By btnCategoria =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_" +
                    "VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > div.DoubleHeader_" +
                    "second-column__OFGbE.col > nav > ul > li:nth-child(1) > div > nav > ul > li:nth-child(3) > a");
    private static final By btnSubcategoria =
            By.cssSelector("#new-header > div.new-zheader.DoubleHeader_new-zheader__AmjXA.DoubleHeader_" +
                    "VariantBlackFriday__PcBIq.DoubleHeader_second-line__qIShd > div > div > div.DoubleHeader_" +
                    "second-column__OFGbE.col > nav > ul > li:nth-child(1) > div > nav > ul > li.MenuRegion_" +
                    "zmenu__item__EXrTW.MenuRegion_zmenu__item--opened__GaXOa > div > div > a:nth-child(1)");
    private static final By textValidateProdutosPorCategoria =
            By.cssSelector("#__next > div.Content_Container__heIrp.container-lg > div > " +
                    "div.col-lg-9 > div.SearchHeader_headerWidget__7L4Rc > div > h1");
    private static final By checkboxLinha =
            By.cssSelector("#__next > div.Content_Container__heIrp.container-lg > div > div.Content_FilterWrapper__" +
                    "96aeF.col-lg-3 > div > aside > div:nth-child(12) > ul > li:nth-child(1) > a > div > div");

    @Step("Clicar no botão Categoria")
    public void clicarNoBotaoCategoria() {
        click(btnCategoria);
    }

    @Step("Clicar no botão Subcategoria")
    public void clicarNoBotaoSubCategoria() {
        click(btnSubcategoria);
    }

    @Step("Validar texto dategoria escolhida na tela")
    public String validarTextoCategoriaEscolhidaNaTela() {
        return getText(textValidateProdutosPorCategoria);
    }

    @Step("Validar checkbox linha selecionado")
    public Boolean checkboxLinhaSelecionado() {
        return isSelected(checkboxLinha);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}
