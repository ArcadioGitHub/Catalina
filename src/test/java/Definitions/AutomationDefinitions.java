package Definitions;

import Tests.AutomationTests;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class AutomationDefinitions {

    AutomationTests automationTests;

    @Given("^el usuario ingresa a la pagina de YourLogo$")
    public void elUsuarioIngresaALaPaginaDeYourLogo()  {
        automationTests.abrirNavegador();

    }


    @When("^el usuario  hace clic en sign in$")
    public void elUsuarioHaceClicEnSignIn() {
automationTests.elUsuarioHaceClicEnSignIn();

    }

    @When("^el usuario ingresa el correo (.*)$")
    public void elUsuarioIngresaElCorreoCataGmailCom(String correo)   {
automationTests.escribirCorreo(correo);

    }

    @When("^el usuario hace clic en el boton  create account$")
    public void elUsuarioHaceClicEnElBotonCreateAccount()  {
automationTests.clicBotonCreateAcount();
    }

    @When("^el usuario diligencia el formulario de registro (.*)$")
    public void elUsuarioDiligenciaElFormularioDeRegistroJuanaRuizTestRedvalleyCllACalleBMedellinEstoEsUnaPruebaJuanis(List<String>data) {
automationTests.llenarFormulario(data);

    }

    @Then("^el usuario debe  ver el mensaje de bienvenida (.*)$")
    public void elUsuarioDebeVerElMensajeDeBienvenida(String mensaje) {
    automationTests.validarMensaje(mensaje);

    }


}
