package PageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class GooglePageObjects {

    @FindBy(xpath = "//input[@title='Buscar']")
    public WebElementFacade casillaDeBusqueda;

    @FindBy(xpath = "(//input[@class='gNO89b'])[1]")
    public WebElementFacade botonBuscar;

    @FindBy(xpath = "//h3[text()='Motos | MercadoLibre.com.co']")
    public WebElementFacade resultadoMercadoLibre;

}
