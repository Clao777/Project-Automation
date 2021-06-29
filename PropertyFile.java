package PropertiesUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {


    //identificam fisierul si specificam extensia lui

    public FileInputStream File;
    public Properties Property;

    public PropertyFile(String Nume){
        LoadFile(Nume);

    }


    //incarcam un anumit fisier KEY=VALUE
    public void  LoadFile(String Nume) {
        Property=new Properties();
        try {
            File=new FileInputStream("src/test/resources/InputData/"+Nume+".properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } try {
            Property.load(File);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    //facem o metoda care returneaza o valoare pe vaza unei chei specifice


    public String GetPropertyValue(String Key){
        return Property.getProperty(Key);


    }


}
