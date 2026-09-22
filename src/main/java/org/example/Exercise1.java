package org.example;

import java.util.LinkedList;

public class Exercise1 {
    private LinkedList<Owner> contacts = new LinkedList<>();
    public Owner binSearch(String name, int low, int high){
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (contacts.get(mid).toString().equalsIgnoreCase(name))
                    return contacts.get(mid);

                if (contacts.get(mid).toString().compareToIgnoreCase(name) < 0)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

        return null;
    }
}


