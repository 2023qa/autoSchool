package practice1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        printHelloName();
    }
    public static void printHelloName(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Hello " + name + ".");
        userInput.close();
    }
}
                          