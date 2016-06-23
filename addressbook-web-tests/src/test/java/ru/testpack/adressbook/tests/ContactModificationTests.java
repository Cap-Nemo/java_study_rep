package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;
import ru.testpack.adressbook.model.ContactData;

/**
 * Created by Nemo on 07.06.2016.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick", "SomeTitle", "Company_Name",
                    "Some Address", "Home_Phone", "Mobile_Phone", "Work_Phone", "Fax_Number", "my_own_mail@mycompany.com",
                    "my_second_mail@mycompany.com", "my_third_mail@home.com", "http://mysite.com", "Secondary_Address",
                    "Secondary_Home", "Secondary_Notes"));
        }
        app.getContactHelper().initFirstRowContactModification();
        app.getContactHelper().fillContactForm(new ContactData("First_Name_mod", "Middle_Name_mod", "Last_Name_mod",
                "Nick_mod", "SomeTitle_mod", "Company_Name_mod", "Some Address_mod", "Home_Phone_mod",
                "Mobile_Phone_mod", "Work_Phone_mod", "Fax_Number_mod", "my_own_mail_mod@mycompany.com",
                "my_second_mail_mod@mycompany.com", "my_third_mail_mod@home.com", "http://mysite_mod.com",
                "Secondary_Address_mod", "Secondary_Home_mod", "Secondary_Notes_mod"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }

}
