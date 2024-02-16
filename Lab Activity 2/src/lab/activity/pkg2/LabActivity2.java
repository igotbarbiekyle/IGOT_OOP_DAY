
package lab.activity.pkg2;

import java.util.Scanner;

public class LabActivity2 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
     System.out.print("Enter the message: ");
     String userMessage = input.nextLine();
     
     detectMisplacedCapitalLetters(userMessage);
     
     input.close();
    }
    
    public static void detectMisplacedCapitalLetters(String userMessage){
        int found = 0;
        for (int i = 1; i < userMessage.length(); i++){
           if(Character.isUpperCase(userMessage.charAt(i)) && Character.isLowerCase(userMessage.charAt(i-1))){
            found = 1;
            break;
        }
        }
        
        if (found == 1){
            System.out.println("JEJE!");
        }
        else {
            System.out.println("uWu");
        }
    }
    
}
