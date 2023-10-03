/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Contact {
    private int contactID;
    private String fullName;
    private String group;
    private String address;
    private String phonne;
    private String firstName;
    private String lastName;

    public Contact() {
    }

    public Contact(int contactID, String fullName, String group, String address, String phonne, String firstName, String lastName) {
        this.contactID = contactID;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phonne = phonne;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonne() {
        return phonne;
    }

    public void setPhonne(String phonne) {
        this.phonne = phonne;
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
    
    
}
