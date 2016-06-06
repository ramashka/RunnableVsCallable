package edu.rdragunov.executor.data;

/**
 * Created by Rrr on 04.06.2016.
 */
public class NpcName {
    String firstName;
    String lastName;

    public NpcName() {
    }

    public NpcName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
