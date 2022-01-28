package Definitions;

import Tests.GoogleTests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleDefinitions {

    //Esta es la manera de crear un objeto de clase, para heredar los atributos.
    GoogleTests googleTests;

    @Given("^el usuatio ingresa a la pagina de google$")
    public void elUsuatioIngresaALaPaginaDeGoogle() {
        googleTests.abrirNevegador();
    }

    @When("^el usuario busca Motos$")
    public void elUsuarioBuscaMotos() {
        googleTests.buscarEnGoogle();
        googleTests.clickEnBotonBuscar();
    }

    @Then("^el primer resultado debe ser la pagina de mercado libre$")
    public void elPrimerResultadoDebeSerLaPaginaDeMercadoLibre()  {
        googleTests.verificarResultado();
    }
}
