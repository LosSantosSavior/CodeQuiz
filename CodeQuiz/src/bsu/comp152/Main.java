package bsu.comp152;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        BSUFacultyBook bsuFB = new BSUFacultyBook(RecordBook);
        var reader = new Scanner(System.in);
        var userResponse = reader.nextLine();
        System.out.println("Which contact would you like to find?");
        bsuFB.findContact(userResponse);



    }
}
