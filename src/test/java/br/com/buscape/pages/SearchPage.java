package br.com.buscape.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    private static final By campoPesquisa =
            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_newSearchItem__" +
                    "tZRA_.col-xl-7.col-lg-6.col-sm-12 > div > div > div.AutoCompleteStyle_AutoSuggestWrapper__" +
                    "ssh4E > div > div.AutoCompleteStyle_autocomplete__qMJ_3 > input");
    private static final By bntPesquisa =
            By.cssSelector("#new-header > div:nth-child(1) > div > div > div.DoubleHeaderOrdering_newSearchItem__" +
                    "tZRA_.col-xl-7.col-lg-6.col-sm-12 > div > div > div.AutoCompleteStyle_AutoSuggestWrapper__" +
                    "ssh4E > div > div.AutoCompleteStyle_autocomplete__qMJ_3 > button > span > svg");
    private static final By textValidatePesquisa =
            By.cssSelector("#__next > div.Content_Container__heIrp.container-lg > div > div.col-lg-9 > " +
                    "div.SearchHeader_headerWidget__7L4Rc > div");
    private static final By textValidateFiltroCategoria =
            By.cssSelector("#applied-filters > div.AppliedFilters_AppliedFiltersItems__yoK3h > " +
                    "button.Chip_Chip___r5Jn.Chip_Clicable__gw0H5.AppliedFilters_AppliedFilter__7__CA > " +
                    "span.Text_Text__bOTfK.Text_DesktopLabelS__irDld.Chip_Text__soEYn");
    private static final By textValidateFiltroMarca =
            By.cssSelector("#applied-filters > div.AppliedFilters_AppliedFiltersItems__yoK3h > " +
                    "button:nth-child(4) > span.Text_Text__bOTfK.Text_DesktopLabelS__irDld.Chip_Text__soEYn");
    private static final By checkboxFiltroLoja =
            By.cssSelector("#__next > div.Content_Container__heIrp.Content_WhenNoBreadcrumbs__o1Gb0.container-lg > " +
                    "div > div.Content_FilterWrapper__96aeF.col-lg-3 > div > aside > div:nth-child(6) > ul > " +
                    "li:nth-child(1) > a > div > div > span");
    private static final By textMensagemDeErro =
            By.cssSelector("#__next > div.Content_Container__heIrp.Content_WhenNoBreadcrumbs__o1Gb0.container-lg > " +
                    "div > div.col-lg-9");

    @Step("Preencher campo pesquisa com categoria válida")
    public void preencherCampoPesquisaComCategoriaValida() {
        sendKeys(campoPesquisa, "celular");
    }

    @Step("Preencher campo pesquisa com marca válida")
    public void preencherCampoPesquisaComMarcaValida() {
        sendKeys(campoPesquisa, "samsung");
    }

    @Step("Preencher campo pesquisa com loja válida")
    public void preencherCampoPesquisaComLojaValida() {
        sendKeys(campoPesquisa, "americanas");
    }

    @Step("Preencher campo pesquisa com nome inválido")
    public void preencherCampoPesquisaInvalido() {
        sendKeys(campoPesquisa, "!@#123157871231@#ewfasf");
    }

    @Step("Preencher campo com pesquisa valido com caractere hífen")
    public void preencherCampoPesquisaComCaractereHifen() {
        sendKeys(campoPesquisa, "guarda-roupas");
    }

    @Step("Não preencher campo pesquisa")
    public void naoPreencherCampoPesquisa() {
        sendKeys(campoPesquisa, "");
    }

    @Step
    public void clicarNoBotaoPesquisa() {
        click(bntPesquisa);
    }

    @Step("Validar texto da Pesquisa na tela")
    public String validarTextoPesquisaNaTela() {
        return getText(textValidatePesquisa);
    }

    @Step("Validar filtro selecionado da categoria na tela")
    public String validarFiltroSelecionadoDaCategoriaNaTela() {
        return getText(textValidateFiltroCategoria);
    }

    @Step("Validar filtro selecionado da marca na tela")
    public String validarFiltroSelecionadoDaMarcaNaTela() {
        return getText(textValidateFiltroMarca);
    }

    @Step("Validar checkbox filtro loja selecionado")
    public Boolean checkboxFiltroLojaSelecionado() {
        return isSelected(checkboxFiltroLoja);
    }

    @Step("Validar mensagem de erro na tela")
    public Boolean validarMensagemDeErroNaTela() {
        return isElementPresent(textMensagemDeErro);
    }

    @Step("Validar texto do campo pesquisa vazio")
    public Boolean validarTextoCampoPesquisaVazio() {
        return isElementPresent(campoPesquisa);
    }

    @Step("Validar url atual")
    public String validarUrlAtual() {
        return getCurrentUrl();
    }

}
