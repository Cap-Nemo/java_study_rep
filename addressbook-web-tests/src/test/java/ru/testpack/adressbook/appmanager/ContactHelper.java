package ru.testpack.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.testpack.adressbook.model.ContactData;

/**
 * Created by Nemo on 6/7/16.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
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

    public void initFirstRowContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void selectFirstRowContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]//input"));
    }

    public void submitContactDeletion() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void acceptContactDeletion() {
        alertAccept();
    }

    public void initContactCreation() {
        if (isElementPresent(By.xpath("//div[@id=\"content\"]//h1"))
                && wd.findElement(By.xpath("//div[@id=\"content\"]//h1")).getText().equals("Edit / add address book entry")) {
            return;
        }
        click(By.linkText("add new"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }
}
