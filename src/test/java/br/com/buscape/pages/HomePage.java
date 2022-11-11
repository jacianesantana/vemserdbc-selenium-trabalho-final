package br.com.buscape.pages;

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

    public void clicarNoBotaoCategorias() {
        click(btnCategorias);
    }
    public void clicarNoBotaoCashback() {
        click(btnCashback);
    }

}
