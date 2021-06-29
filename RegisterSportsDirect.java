package Teste;

import Base.BaseProject1;
import Help.ElementMethods;
import Help.PageMethods;
import Pages.RegisterPage;
import Pages.RegisterSDPage;
import PropertiesUtility.PropertyFile;
import org.junit.Test;

public class RegisterSportsDirect extends BaseProject1 {


    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public PropertyFile propertyFile;
    public RegisterSDPage registerSDPage;



    @Test
    public void Register(){
        elementMethods=new ElementMethods(driver);
        pageMethods=new PageMethods(driver);
        propertyFile=new PropertyFile("RegisterData");
        registerSDPage=new RegisterSDPage(driver);


        pageMethods.ValidateTitlePage("Registration");

        String TitleValue=propertyFile.GetPropertyValue("Title");
        String FirstNameValue=propertyFile.GetPropertyValue("FirstName");
        String LastNameValue=propertyFile.GetPropertyValue("LastName");
        String EmailValue=propertyFile.GetPropertyValue("Email");
        String DayValue=propertyFile.GetPropertyValue("Day");
        String MonthValue=propertyFile.GetPropertyValue("Month");
        String YearValue=propertyFile.GetPropertyValue("Year");
        String PasswordValue=propertyFile.GetPropertyValue("Password");
        String ConfirmPasswordValue=propertyFile.GetPropertyValue("ConfirmPassword");


        registerSDPage.RegisterProcess1(TitleValue,FirstNameValue,LastNameValue,EmailValue,DayValue,MonthValue,YearValue,
                PasswordValue,ConfirmPasswordValue);


        pageMethods.ValidateTitlePage("Diem Carp Rod | SportsDirect.com Romania");
        driver.quit();


    }


}
