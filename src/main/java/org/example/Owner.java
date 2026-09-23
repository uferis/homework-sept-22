package org.example;

public class Owner {
    private String data;
    private Owner pointer;

    public Owner(){}
    public Owner(String d){
        this.data = d;
        this.pointer = null;
    }

    private Owner head;
    private Owner tail;

    private static int counter;

    public void addNode(String data){
        Owner newNode = new Owner(data);
        
        if(this.head == null){
            counter = 1;
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.pointer = newNode; // HERE we reference the OLD TAIL and give a pointer
            // to the new/upcoming tail

            this.tail = newNode;
            counter++;
        }
    }

    public Owner get(int index){
        Owner current = head;
        int currentIndex = 0;

        while (current != null || currentIndex < index){
            current = current.pointer;
            currentIndex++;
        }

        return current;
    }

    @Override
    public String toString(){
        return data;
    }


}
