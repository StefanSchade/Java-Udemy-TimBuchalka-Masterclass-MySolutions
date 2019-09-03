package de.stefanschade.learning.timbuch.masterclass.ch08;

public class Challenge_Contacts {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Challenge_Contacts(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Last Name: " + lastName + " First Name: "
                + firstName + " Phone Number: " + phoneNumber;
    }
}
