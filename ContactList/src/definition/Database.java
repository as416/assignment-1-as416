package definition;

import java.util.ArrayList;

public class Database<E> {
    private static ArrayList conBook = new ArrayList<>();

    public static ArrayList getConBook() {
        return conBook;
    }

    public static void setConBook(ArrayList conBook) {
        Database.conBook.add(conBook);
    }

    public static void removecontact(int index) {
        Database.conBook.remove(index);
    }
}