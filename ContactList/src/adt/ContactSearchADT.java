package adt;

import java.util.ArrayList;

public interface ContactSearchADT<E> {
    void searchContact(String Name);

    void printSearchedContact(ArrayList contact);
}