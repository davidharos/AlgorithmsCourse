package dhs.haro;
import dataStructures.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //Given a string, return a new string with the reversed order
        // of characters
        // --- Examples
        // reverse('apple') === 'leppa'
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        algorithms reverse = new algorithms();
        String word1, choice = null;
        int x = 0;

        System.out.println
                ("+++++++++++++++====================\n" +
                        "       What would you like to do?\n" +
                        "\n" +
                        "1. Reverse the inputed string");

        try {
            choice = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        x = Integer.parseInt(choice);

        switch (x){

            //Reverse String
            case (1) :
            {

                System.out.println("Write the word you would like to reverse...");
                try {
                    word1 = reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                word1 = reverse.reverseString(word1);
                System.out.println("You word reversed is: " +  word1);

            }

        }

        //Given a string, return a new string with the reversed order
        // of characters
        // --- Examples
        // reverse('apple') === 'leppa'



    }




}