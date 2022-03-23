package Tests;

import PageObjects.GooglePageObjects;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

//extends es la palabra reservada de la herencia para heredar de una Clase Padre
public class GoogleTests extends PageObject {

    //Esta es la manera de crear un objeto de clase, para heredar los atributos.
    GooglePageObjects googlePageObjects;

    public void abrirNevegador(){

        getDriver().get("https://www.google.com/");
    }

    public void buscarEnGoogle(){
        googlePageObjects.casillaDeBusqueda.type("Motos");
    }

    public void clickEnBotonBuscar(){
        googlePageObjects.botonBuscar.click();
    }

    public void verificarResultado(){
        Assert.assertTrue(googlePageObjects.resultadoMercadoLibre.isVisible());
    }
}
