
import java.util.*;
import java.io.*;
import java.io.File; 
import java.util.Scanner; 

public class Bookstore {
    
    public String BookStore = "NewLeaf";
    public String Address = "8905 Daventry place";
    public int SquareFeet = 2000;
    public boolean UsedBooks = true;
    public boolean OpenClosed= true;
    public boolean Weekend = true;
    public boolean Sunday = true;
    public String OpenTime = "9am";
    public String ClosingTime ="9pm";
    

    public static final void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        File myFile = new File("Bookfile.txt");
         

         System.out.println("Enter the filename: ");
         String filename = keyboard.nextLine();

         File file = new File("Bookfile.txt");
         Scanner inputFile = new Scanner(file);

         while (inputFile.hasNext()) {
            String friendName =inputFile.nextLine();
            System.out.println(friendName);
         }
         inputFile.close();

        




        String BookStore = "NewLeaf";
         String Address = "8905 Daventry place";
         int SquareFeet = 2000;
         boolean UsedBooks = true;
         boolean OpenClosed= true;
         boolean Weekend = true;
         boolean Sunday = true;
         String OpenTime = "9am";
         String ClosingTime ="9pm";
        
         System.out.println("Welcome to " + BookStore + " we are located at " + Address + ". We have a total of  " + SquareFeet + " Squarefeet for you to browse! We are open at " + OpenTime + " and close at " + ClosingTime + ".");
         
         if( UsedBooks= true)
         System.out.println("we have used books");

         if(OpenClosed= true)
         System.out.println("We are open! Come on in!!");

         if(Sunday= true)
         System.out.println("We are Open on Sundays");


    }

    

    
}
