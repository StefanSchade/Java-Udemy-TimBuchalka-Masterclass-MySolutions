package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex30_Person {

    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age < 20 && age > 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {

        StringBuffer sb = new StringBuffer();
        sb.append(this.firstName);
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            sb.append(" ");
        }
        sb.append(this.lastName);

        return sb.toString();
    }

}
