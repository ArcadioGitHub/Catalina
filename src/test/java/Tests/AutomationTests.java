package Tests;

import PageObjects.AutomationPageObjects;


import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

import java.util.List;
import java.util.UUID;

public class AutomationTests extends PageObject {

    AutomationPageObjects automationPageObjects;

    public void abrirNavegador() {
        getDriver().get("http://automationpractice.com/index.php");
    }

    public void elUsuarioHaceClicEnSignIn() {
        automationPageObjects.botonSignIn.click();
    }

    public void escribirCorreo(String correo) {

        UUID uuid = UUID.randomUUID();
        automationPageObjects.email.type(String.valueOf(uuid).concat(correo));
    }

    public void clicBotonCreateAcount() {
        automationPageObjects.botonCreateAcount.click();
    }


    public void llenarFormulario(List<String>data){
        automationPageObjects.sexMr.click();
        automationPageObjects.firsName.type(data.get(0));
        automationPageObjects.lastName.type(data.get(1));
        automationPageObjects.PassWd.sendKeys(data.get(2));
        automationPageObjects.dias.click();
        automationPageObjects.marzo.click();
        automationPageObjects.year.click();
        automationPageObjects.addressFirsName.type(data.get(3));
        automationPageObjects.addressLastName.type(data.get(4));
        automationPageObjects.company.type(data.get(5));
        automationPageObjects.address1.type(data.get(6));
        automationPageObjects.city.type(data.get(7));
        automationPageObjects.state.click();
        automationPageObjects.code.type(data.get(8));
        automationPageObjects.country.click();
        automationPageObjects.phone.type(data.get(9));
        automationPageObjects.mobilPhone.type(data.get(10));
        automationPageObjects.alias.type(data.get(11));
        automationPageObjects.registrar.click();

    }
     public void validarMensaje(String mensajevalidar){
         Assert.assertEquals(automationPageObjects.mensajeBienvenida.getText(), mensajevalidar);


     }
}