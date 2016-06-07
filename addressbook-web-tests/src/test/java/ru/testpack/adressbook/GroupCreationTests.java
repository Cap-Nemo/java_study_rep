package ru.testpack.adressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Test1", "Test1_Header", "Test1_Footer"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
