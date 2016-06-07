package ru.testpack.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.testpack.adressbook.model.ContactData;

/**
 * Created by Nemo on 6/7/16.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {

        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompanyName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFaxNumber());
        type(By.name("email"), contactData.getFirstMail());
        type(By.name("email2"), contactData.getSecondMail());
        type(By.name("email3"), contactData.getThirdMail());
        type(By.name("homepage"), contactData.getSiteURL());
        type(By.name("address2"), contactData.getSecondaryAddress());
        type(By.name("phone2"), contactData.getSecondaryHome());
        type(By.name("notes"), contactData.getSecondaryNotes());

    }
}
