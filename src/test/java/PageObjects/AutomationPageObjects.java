package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AutomationPageObjects extends PageObject {


    @FindBy(css=".login")
    public WebElementFacade botonSignIn;

    @FindBy(css="#email_create")
    public WebElementFacade email;

    @FindBy(css="#SubmitCreate")
 public WebElementFacade botonCreateAcount;

   @FindBy(css="#id_gender1")
    public WebElementFacade sexMr;

    @FindBy(css="#id_gender2")
    public WebElementFacade sexMrs;

    @FindBy(css="#customer_firstname")
    public WebElementFacade firsName;

    @FindBy(css="#customer_lastname")
    public WebElementFacade lastName;

    @FindBy(css="#passwd")
    public WebElementFacade PassWd;

    //@FindBy(css="#uniform-days")
    //public WebElementFacade cbxDias;

    //@FindBy(css="#days")
    @FindBy(xpath = "//*[@id='days']//option[@value='3']")
    public WebElementFacade dias;

    //-----
@FindBy(xpath = "//*[@id='months']//option[contains(text(),'May')]")
public WebElementFacade marzo;
  //-----
    @FindBy(xpath = "//*[@id='years']//option[contains(text(),'1995')]")
    public WebElementFacade year;

    @FindBy(xpath="//h3[text()='Your address']//following::input[@id='firstname']")
    public WebElementFacade addressFirsName;

    @FindBy(xpath="//h3[text()='Your address']//following::input[@id='lastname']")
    public WebElementFacade addressLastName;

    @FindBy(css="#company")
    public WebElementFacade company;

    @FindBy(css="#address1")
    public WebElementFacade address1;

    @FindBy(css="#city")
    public WebElementFacade city;

    @FindBy(xpath="//*[@id='id_state']//option[contains(text(),'Alabama')]")
    public WebElementFacade state;

    @FindBy(css="#postcode")
    public WebElementFacade code;

    @FindBy(xpath="//*[@id='id_country']//option[contains(text(),'United States')]")
    public WebElementFacade country;

    @FindBy(css="#phone")
    public WebElementFacade phone;

    @FindBy(css="#phone_mobile")
    public WebElementFacade mobilPhone;

    @FindBy(css="#alias")
    public WebElementFacade alias;

    @FindBy(css="#submitAccount")
    public WebElementFacade registrar;

    @FindBy(css=".info-account")
    public WebElementFacade mensajeBienvenida;

}
