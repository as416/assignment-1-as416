package definition;

import adt.ContactAddADT;

import java.util.ArrayList;

public class ContactAdd<E> implements ContactAddADT<E> {
    @Override
    public boolean addContact(String fname, String lname, ArrayList MobNo, String Email) {
        ArrayList contact;
        contact = new ArrayList();
        contact.add(fname);
        contact.add(lname);
        for (int i = 0; i < MobNo.size(); i++) {

            contact.add(MobNo.get(i));
        }
        contact.add(Email);
        Database.setConBook(contact);

        return true;
    }
}