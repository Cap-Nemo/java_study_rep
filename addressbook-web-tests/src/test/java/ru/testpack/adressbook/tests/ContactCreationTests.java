package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;
import ru.testpack.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().createContact(new ContactData("First_Name", "Middle_Name", "Last_Name", "Nick", "SomeTitle", "Company_Name",
                "Some Address", "Home_Phone", "Mobile_Phone", "Work_Phone", "Fax_Number", "my_own_mail@mycompany.com",
                "my_second_mail@mycompany.com", "my_third_mail@home.com", "http://mysite.com", "Secondary_Address",
                "Secondary_Home", "Secondary_Notes"));
    }

}
