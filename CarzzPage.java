package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarzzPage {

    public WebDriver driver;
    public ElementMethods elementMethods;


    public CarzzPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement AcceptWeb;

    @FindBy(id = "login_action")
    public WebElement LoginActionWeb;

    @FindBy(id = "email")
    public WebElement EmailAdressWeb;

    @FindBy(id = "password")
    public WebElement PasswordWeb;

    @FindBy(xpath = "//input[@value='Autentificare']")
    public WebElement AutentificareWeb;

    @FindBy(id = "auto-brand")
    public WebElement MarcaWeb;

    @FindBy(id = "auto-model")
    public WebElement ModelWeb;

    @FindBy(id = "price_from_fake_gr")
    public WebElement PriceWeb;

    @FindBy(id = "2500_5000_euro_price_to_range_text")
    public WebElement ClickPriceWeb;

    @FindBy(xpath = "//input[@value='Aplică']")
    public WebElement AplicaWeb;

    @FindBy(xpath = "//img[@alt='Skoda octavia 2007']")
    public WebElement CarWeb;

    @FindBy(id = "send_msg")
    public WebElement SendMesageWeb;

    @FindBy(xpath = "//textarea[@placeholder='Scrie mesajul tău...']")
    public WebElement MesageWeb;


    public void AutentificareProcess(String Email, String Password, String Marca, String Model,String Mesage) {

        ClickAccept();
        ClickLogin();
        FillEmail(Email);
        FillPassword(Password);
        ClickAutentificare();
        ClickMarca();
        SelectMarca(Marca);
        ClickModel();
        SelectModel(Model);
        ClickPrice();
        SelectPrice();
        ClickAplica();
        SelectCar();
        SendMesage();
        FillMesage(Mesage);


    }


    public void ClickAccept() {
        elementMethods.ClickElement(AcceptWeb);
    }

    public void ClickLogin() {
        elementMethods.ClickElement(LoginActionWeb);
    }

    public void FillEmail(String value) {
        elementMethods.FillElement(EmailAdressWeb, value);
    }

    public void FillPassword(String value) {
        elementMethods.FillElement(PasswordWeb, value);
    }

    public void ClickAutentificare() {
        elementMethods.ClickElement(AutentificareWeb);
    }

    public void ClickMarca() {
        elementMethods.HoverElement(MarcaWeb);
        elementMethods.ClickElement(MarcaWeb);
    }

    public void SelectMarca(String value) {
        elementMethods.SelectElementByText(MarcaWeb, value);
    }

    public void ClickModel() {
        elementMethods.HoverElement(ModelWeb);
        elementMethods.ClickElement(ModelWeb);

    }

    public void SelectModel(String value) {
        elementMethods.SelectElementByText(ModelWeb, value);
    }

    public void ClickPrice() {
        elementMethods.HoverElement(PriceWeb);
        elementMethods.ClickElement(PriceWeb);
    }

    public void SelectPrice() {
        elementMethods.ClickElement(ClickPriceWeb);
    }

    public void ClickAplica() {
        elementMethods.ClickElement(AplicaWeb);
    }

    public void SelectCar() {
        elementMethods.HoverElement(CarWeb);
        elementMethods.ClickElement(CarWeb);
    }
    public void SendMesage(){
        elementMethods.ClickElement(SendMesageWeb);
    }
    public void FillMesage(String value){
        elementMethods.FillElement(MesageWeb,value);

    }

}












