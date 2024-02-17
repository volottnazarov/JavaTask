package PhoneBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Contact {
    private static  Map<String, ArrayList<Integer>> phoneBook = new TreeMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> arr = phoneBook.get(name);
        if (arr == null) {
            arr = new ArrayList<>();
            arr.add(phoneNum);
            phoneBook.put(name, arr);
        } else {
            arr.add(phoneNum);
            phoneBook.put(name, arr);
        }


    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> arr = phoneBook.get(name);
        if (arr == null){
            arr = new ArrayList<>();
        }else {

        }
        return arr;
    }

    public static Map<String, ArrayList<Integer>> showPhoneBook() {
        if (!phoneBook.isEmpty()) {
            return phoneBook;
        }
        return null;
    }
}
