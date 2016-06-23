package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;
import ru.testpack.adressbook.model.ContactData;

/**
 * Created by Nemo on 07.06.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick", "SomeTitle", "Company_Name",
                    "Some Address", "Home_Phone", "Mobile_Phone", "Work_Phone", "Fax_Number", "my_own_mail@mycompany.com",
                    "my_second_mail@mycompany.com", "my_third_mail@home.com", "http://mysite.com", "Secondary_Address",
                    "Secondary_Home", "Secondary_Notes"));
        }
        app.getContactHelper().selectFirstRowContact();
        app.getContactHelper().submitContactDeletion();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().goToHomePage();
    }

}
