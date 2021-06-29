package Teste;

import Base.BaseProject;
import Help.ElementMethods;
import Help.PageMethods;
import Pages.CarzzPage;
import Pages.RegisterSDPage;
import PropertiesUtility.PropertyFile;
import org.junit.Test;

public class Carzz extends BaseProject {

    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public PropertyFile propertyFile;
    public CarzzPage carzzPage;


    @Test
    public void Carzz(){
        elementMethods=new ElementMethods(driver);
        pageMethods=new PageMethods(driver);
        propertyFile=new PropertyFile("RegisterData");
        carzzPage=new CarzzPage(driver);


        pageMethods.ValidateTitlePage("CarZZ.ro • Vanzari auto \uD83D\uDE99 Piese auto \uD83D\uDD27 Masini noi si second hand");


        String EmailValue=propertyFile.GetPropertyValue("Email");
        String PasswordValue=propertyFile.GetPropertyValue("Password");
        String MarcaValue=propertyFile.GetPropertyValue("Marca");
        String ModelValue=propertyFile.GetPropertyValue("Model");
        String MesageValue=propertyFile.GetPropertyValue("Mesage");


        carzzPage.AutentificareProcess(EmailValue,PasswordValue,MarcaValue,ModelValue,MesageValue);

        pageMethods.ValidateTitlePage("Skoda octavia 2007, 3.600 eur - CarZZ.ro");
        driver.quit();











    }
}
