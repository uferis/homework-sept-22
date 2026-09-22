package org.example;

public class Exercise17 {
    private String[][] customers = new String[7][512];
    int i = 0;

    public int CardiffPopulation() {
        int i = 0;

        while (i < customers[5].length && customers[5][i].equalsIgnoreCase("Cardiff")) {
            i++;
        }

        return i;
    }

    public void MailingLabelForJonesInCardiff(){
        while(i < customers.length){
            if (customers[0][i].equalsIgnoreCase("Jones") && customers[5][i].equalsIgnoreCase("Cardiff")){
                System.out.println(customers[1][i] + " " + customers[0][i]); // First name and Last name
                System.out.println(customers[2][i]); // Address 1
                System.out.println(customers[3][i]); // Address 2
                System.out.println(customers[4][i]); // Address 3
                System.out.println(customers[5][i]); // City
                System.out.println(customers[6][i]); // Postcode
            }
        }
    }


}
