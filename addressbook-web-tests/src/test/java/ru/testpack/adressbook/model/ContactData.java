package ru.testpack.adressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickname;
    private final String title;
    private final String companyName;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String faxNumber;
    private final String firstMail;
    private final String secondMail;
    private final String thirdMail;
    private final String siteURL;
    private final String secondaryAddress;
    private final String secondaryHome;
    private final String secondaryNotes;

    public ContactData(String firstName, String middleName, String lastName, String nickname, String title,
                       String companyName, String address, String homePhone, String mobilePhone, String workPhone,
                       String faxNumber, String firstMail, String secondMail, String thirdMail, String siteURL,
                       String secondaryAddress, String secondaryHome, String secondaryNotes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.title = title;
        this.companyName = companyName;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.faxNumber = faxNumber;
        this.firstMail = firstMail;
        this.secondMail = secondMail;
        this.thirdMail = thirdMail;
        this.siteURL = siteURL;
        this.secondaryAddress = secondaryAddress;
        this.secondaryHome = secondaryHome;
        this.secondaryNotes = secondaryNotes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getFirstMail() {
        return firstMail;
    }

    public String getSecondMail() {
        return secondMail;
    }

    public String getThirdMail() {
        return thirdMail;
    }

    public String getSiteURL() {
        return siteURL;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public String getSecondaryHome() {
        return secondaryHome;
    }

    public String getSecondaryNotes() {
        return secondaryNotes;
    }
}
