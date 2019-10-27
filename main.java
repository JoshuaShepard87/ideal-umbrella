import java.util.Scanner;

import org.w3c.dom.Text;

public class main{
    public static void main(String[] args){
        System.out.println("Hello Please!");
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text");
        text = sc.nextLine();
        
        System.out.println("Your string of text is: " + text);
        int a = 5;
        int b = 3;

        System.out.println("the number of int a is: " +a + "\n the number of b is " + b+ "\n the number timed each other is " + (a*b));
    }
}
