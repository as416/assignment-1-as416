package main;

import definition.ContactAdd;
import definition.ContactDelete;
import definition.ContactSearch;
import definition.ContactView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactAdd contactAdd = new ContactAdd();
        ContactView contactView = new ContactView();
        ContactDelete contactDelete = new ContactDelete();
        ContactSearch contactSearch = new ContactSearch();
        System.out.println("---------------------------------------------------");
        System.out.println("Welcome to ASHUTOSH's Contact List");
        String fname, lname, EmailID;
        ArrayList mobno = new ArrayList();
        while (true) {
            System.out.println("---------------------------------------------------");
            Scanner in = new Scanner(System.in);
            System.out.println("1.ADD NEW CONTACT\n2.CONTACT VIEW\n3.CONTACT DELETE\n4.CONTACT SEARCH\n5.TO EXIT :)");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the firstName:");
                    fname = in.next();
                    System.out.println("Enter the lastName:");
                    lname = in.next();
                    System.out.println("Enter the Mobile NO:");
                    String MobNo = in.next();
                    mobno.add(MobNo);
                    if (MobNo.length() != 10 || MobNo.matches("a-zA-Z")) {
                        System.out.println("mobile no error PLEASE try again");
                        continue;
                    }
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("want to add another no?(y/n):");
                        String responce = in.next();
                        if (responce.equals("Y") || responce.equals("y")) {
                            System.out.println("Enter the Mob2:");
                            String Mob2 = in.next();
                            mobno.add(Mob2);
                        } else if (responce.equals("n") || responce.equals("N")) {
                            break;
                        }
                    }
                    System.out.println("Enter the EMail ID:");
                    EmailID = in.next();
                    contactAdd.addContact(fname, lname, mobno, EmailID);
                    break;
                case 2:
                    contactView.printAllContactactSort();

//                    System.out.println(  Database.getConBook());
                    break;
                case 3:
                    System.out.println("enter the full name of the person");
                    in.nextLine();
                    String delName = in.nextLine();
                    contactDelete.deleteContact(delName);
                    break;
                case 4:
                    System.out.println("enter the full name of the person");
                    in.nextLine();
                    String name = in.nextLine();
                    contactSearch.searchContact(name);
                    break;
                default:
                    System.out.println("invalid input " + "PLEASE TRY AGAIN!!!!!");
                    break;

            }

        }


    }
}