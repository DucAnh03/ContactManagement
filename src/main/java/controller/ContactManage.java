
package controller;

import comnon.Algorithm;

import java.util.ArrayList;
import model.Contact;
import view.Menu;
public class ContactManage {
      private final String[] MAIN_MENU_ITEMS = {
        "Add a contact",
        "Display all contact",
        "Delete a contact",
        "Exit",};

    Algorithm algorithm = new Algorithm();
    ArrayList<Contact> contact = new ArrayList<>();

    Menu mainMenu = new Menu("Main menu", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.createContact(contact);
                    break;
                case 2:
                    algorithm.printAllContact(contact);
                    break;
                case 3:
                    algorithm.deleteContact(contact);
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    };

    public void run() {
        mainMenu.run();
    }
}
