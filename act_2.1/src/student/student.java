
package student;

import hidden.hidden;
import java.util.Scanner;

public class student {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter test case number: ");
        int choice = scanner.nextInt();
        hidden.runhidden(choice);
        
        scanner.close();
                
    }

}
