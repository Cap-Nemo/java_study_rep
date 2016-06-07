package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Nemo on 07.06.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().selectFirstRowContact();
        app.getContactHelper().submitContactDeletion();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().goToHomePage();
    }

}
