package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSDPage {

    public WebDriver driver;
    public ElementMethods elementMethods;


    public RegisterSDPage(WebDriver driver){
        this.driver=driver;
        elementMethods=new ElementMethods(driver);
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="Registration_Title")
    public WebElement TitleWeb;

    @FindBy(id="Registration_FirstName")
    public WebElement FirstNameWeb;

    @FindBy(id="Registration_LastName")
    public WebElement LastNameWeb;

    @FindBy(id="Registration_EmailAddress")
    public WebElement EmailAdressWeb;

    @FindBy(id="Registration_DateOfBirthDay")
    public WebElement DayWeb;

    @FindBy(id="Registration_DateOfBirthMonth")
    public WebElement MounthWeb;

    @FindBy(id="Registration_DateOfBirthYear")
    public WebElement YearWeb;

    @FindBy(id="txtPassword")
    public WebElement PasswordWeb;

    @FindBy(id="Registration_ConfirmPassword")
    public WebElement ConfirmPasswordWeb;

    @FindBy(id="Registration_ConfirmPassword")
    public WebElement FootballWeb;

    @FindBy(xpath = "//span[normalize-space()='Sign In']")
    public WebElement LogInWeb;

    @FindBy(id = "Login_EmailAddress")
    public WebElement EmailLogInWeb;

    @FindBy(id = "Login_Password")
    public WebElement PasswordLogInWeb;

    @FindBy(id = "LoginButton")
    public WebElement ClickLoginWeb;


    @FindBy(id = "lnkTopLevelMenu_1981572")
    public WebElement GoFotballWeb;

    @FindBy(xpath = "//a[normalize-space()='Liverpool']")
    public WebElement LiverpoolWeb;

    @FindBy(xpath = "//img[@title='Nike - Liverpool Match Home Shirt 2021 2022']")
    public WebElement ShirtWeb;

    @FindBy(id="liItem")
    public WebElement SizeWeb;

    @FindBy(id="aPrePersAddToBag")
    public WebElement BagWeb;

    @FindBy(id="lnkTopLevelMenu_1981478")
    public WebElement SportsWeb;

    @FindBy(xpath = "//a[normalize-space()='Fishing']")
    public WebElement FishingWeb;

    @FindBy(xpath = "//img[@title='Diem - Carp Rod']")
    public WebElement CarpWeb;

    @FindBy(id = "ancLink")
    public WebElement SizeCarpWeb;

    @FindBy(id = "aAddToBag")
    public WebElement ADDtoBagWeb;



    public void RegisterProcess1(String Title,String FirstName,String LastName,String Email,String Day,
                                 String Mounth,String Year,String Password,String ConfirmPassword){
        SelectTitle(Title);
        FillFirstName(FirstName);
        FillLastName(LastName);
        FillEmail(Email);
        SelectDay(Day);
        SelectMonth(Mounth);
        SelectYear(Year);
        FillPassword(Password);
        FillConfirmPassword(ConfirmPassword);
        LogIn();
        FillLogIn(Email);
        FillPasswordLogIn(Password);
        ClickLogIn();
        ClickFootball();
        ClickLiverpool();
        ClickShirt();
        ClickSize();
        ClickBag();
        ClickSport();
        ClickFishing();
        ClickCarpRod();
        ClickSizeCarp();
        ClickADDToBag();



    }

    public void SelectTitle(String value){
        elementMethods.SelectElementByText(TitleWeb,value);

    }
    public void FillFirstName(String value){
        elementMethods.FillElement(FirstNameWeb,value);
    }
    public void FillLastName(String value){
        elementMethods.FillElement(LastNameWeb,value);
    }
    public void FillEmail(String value){
        elementMethods.FillElement(EmailAdressWeb,value);
    }
    public void SelectDay(String value){
        elementMethods.SelectElementByValue(DayWeb,value);
    }
    public void SelectMonth(String value){
        elementMethods.SelectElementByText(MounthWeb,value);
    }
    public void SelectYear(String value){
        elementMethods.SelectElementByValue(YearWeb,value);
    }
    public void FillPassword(String value){
        elementMethods.FillElement(PasswordWeb,value);
    }
    public void FillConfirmPassword(String value){
        elementMethods.FillElement(ConfirmPasswordWeb,value);
    }
    public void LogIn(){
        elementMethods.ClickElement(LogInWeb);

    }
    public void FillLogIn(String value){
        elementMethods.FillElement(EmailLogInWeb,value);
    }

    public void FillPasswordLogIn(String value){
        elementMethods.FillElement(PasswordLogInWeb,value);
    }
    public void ClickLogIn(){
        elementMethods.ClickElement(ClickLoginWeb);
    }

    public void ClickFootball(){
        elementMethods.HoverElement(GoFotballWeb);
    }

    public void ClickLiverpool(){
        elementMethods.ClickElement(LiverpoolWeb);
    }

    public void ClickShirt(){
        elementMethods.ClickElement(ShirtWeb);

    }
    public void ClickSize(){
        elementMethods.ClickElement(SizeWeb);
    }

    public void ClickBag(){
        elementMethods.ClickElement(BagWeb);
    }

    public void ClickSport() {
        elementMethods.HoverElement(SportsWeb);
    }

    public void ClickFishing(){
        elementMethods.ClickElement(FishingWeb);
    }

    public void ClickCarpRod(){
        elementMethods.ClickElement(CarpWeb);
    }
    public void ClickSizeCarp(){
        elementMethods.ClickElement(SizeCarpWeb);
    }

    public void ClickADDToBag(){
        elementMethods.ClickElement(ADDtoBagWeb);
    }



}

