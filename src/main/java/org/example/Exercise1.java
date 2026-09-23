package org.example;


public class Exercise1 {
    public static void main(String[] args) {
        Owner LinkedList = new Owner();

        Owner contacts = new Owner();

        contacts.addNode("Bob");
        contacts.addNode("Beatrice");
        contacts.addNode("Emka");
        contacts.addNode("Omar");

        System.out.println(binSearch("Emka", 0, 3));
    }

    static Owner contacts = new Owner();
    public static Owner binSearch(String name, int low, int high){
                int mid = (low + high) / 2;

                if (contacts.get(mid).toString().equalsIgnoreCase(name))
                    return contacts.get(mid);

                if (contacts.get(mid).toString().compareToIgnoreCase(name) < 0)
                    return binSearch(name, mid + 1, high);

                else
                    return binSearch(name, low, mid - 1);
    }
}


