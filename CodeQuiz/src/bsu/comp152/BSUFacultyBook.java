package bsu.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BSUFacultyBook extends RecordBook{


    public BSUFacultyBook(String bookName) {
        super(bookName);
    }

    public void loadData() throws IOException {
        var bsuFB = new BSUFacultyBook();
        bsuFB = data.get();
        var fileName = "Contacts.txt";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines) {
            var splitLine = line.split(",");
            //.add(splitLine[0]);
            //.add((splitLine[1]));
            //.add((splitLine[2]));
            //Contact contactLine = new Contact(RecordBook);



        }
        try {
            Files.readAllLines(filePath);
        } catch(IOException e)   {
            System.out.println("There was an error with your input, please try again.");
        } catch(InputMismatchException e)   {
            System.out.println("There was an error with your input values, please try again.");
        } finally  {
            System.out.println("Error reading this file, exiting program...");
            System.exit(-1);
        }

    }

    public void findContact(String name)  {
        var reader = new Scanner(System.in);
        var userResponse = reader.nextLine();
        for (int i = 0; i < name.length(); i++)    {
            System.out.println("Name: " +.get(i) + "\nContact ID: " + .get(i) + "\nPhone Number: " + .get(i) + "\nNotes: " + .get(i));
        }
        while (!userResponse.equals("done"))    {
            System.out.println("Type in the contact you want to look for. Type 'done' when you are done searching for a contact.");
            userResponse = reader.nextLine();
            userResponse = userResponse.toLowerCase();
            for (int i = 0; i < name.length(); i++) {
                if (userResponse.equals(.get(i))) {
                    System.out.println();
                }
            }
        }
    }
}
