package dataStructures;

public class algorithms {


    public String reverseString(String word){

        String rword = "";
        char ch;

        System.out.println("Original Word: " + "\n" + word);

        //get each letter
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rword = ch + rword;
        }

        return rword;
    }

}
