package bsu.comp152;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        BSUFacultyBook bsuFB = new BSUFacultyBook(RecordBook);
        bsuFB.loadData();
        var reader = new Scanner(System.in);
        var userResponse = reader.nextLine();
        System.out.println("Which contact would you like to find?");
        bsuFB.findContact(userResponse);

    }
}
