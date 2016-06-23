package ru.testpack.adressbook.tests;

import org.testng.annotations.Test;
import ru.testpack.adressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }

}
