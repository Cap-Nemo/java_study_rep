package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;
import ru.testpack.adressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test1", "Test1_Header", "Test1_Footer"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
