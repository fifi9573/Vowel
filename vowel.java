//Name: Fiona Tong
//Date: 10/23/18
//Period: 6

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = scan.nextLine(); //declares the string entered as s1
        
        int len = s1.length(); //finds the length of s1
        
        final char a='a'; //sets a char as that variable
        final char e='e';
        final char i='i';
        final char o='o';
        final char u='u';
        
        final char A='A';
        final char E='E';
        final char I='I';
        final char O='O';
        final char U='U';
        
        int total = 0; //sets int total equal to zero
        
        for(int x=0; x<len; x++){ 
            
            char vowel = s1.charAt(x); //starting from the first letter with an index of zero, it will coninue seeing if that letter is equal to a vowel below until it reaches the last letter in the string
            
            switch(vowel){
                case a:
                case e:
                case i:
                case o:
                case u:
                case A:
                case E:
                case I:
                case O:
                case U:
                    total++;//each time the letter is equal to a vowel, the number "total" will increase by one because it is counting the total number of vowels in the string
            }
            
        }
        
        System.out.println("There is a total of "+total+" vowels in your string: "+s1+".");//prints out the statement telling you how many vowels there are in the string inputted
        
    }
}
