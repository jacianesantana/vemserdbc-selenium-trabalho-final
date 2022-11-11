package br.com.buscape.steps;

import br.com.buscape.util.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps extends Browser {

    @Before
    public void abrirNavegador() {
        browserUp("https://www.buscape.com.br/");
    }

    @After
    public void fecharNavegador() {
        browserDown();
    }

}
