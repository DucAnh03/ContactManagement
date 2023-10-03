
package comnon;

import model.Contact;
import java.util.ArrayList;
public class Algorithm {
    Validation validation = new Validation();
    
    public void createContact(ArrayList<Contact> contacts){
        System.out.print("Enter ID contact");
        int contacID = validation.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = validation.checkInputString();
        System.out.print("Enter group: ");
        String group = validation.checkInputString();
        System.out.print("Enter address: ");
        String address = validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = validation.checkInputPhone();
        contacts.add(new Contact(contacID, firstName + lastName,group,address,
            phone,firstName,lastName));
        System.err.println("Add suscessfull.");
    }
    public void printAllContact(ArrayList<Contact> contact) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Full Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contacts : contact) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contacts.getContactID(), contacts.getFullName(),
                    contacts.getFirstName(), contacts.getLastName(),
                    contacts.getGroup(), contacts.getAddress(), contacts.getPhonne());
        }
    }
    public void deleteContact(ArrayList<Contact> contact){
        System.out.print("ENter ID");
        int idDelete = validation.checkInputInt();
        Contact contactDelete = getContactByID(contact,idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
    }else{
            contact.remove(contactDelete);
        }
        System.err.println("Delete successfull.");
    }
    
    public Contact getContactByID(ArrayList<Contact> contact,int idDelete){
        for(Contact contacts : contact){
            if(contacts.getContactID() == idDelete){
                return contacts;
            }
        }
        return null;
    }
    
}
