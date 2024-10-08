package reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.*;


public class Driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            // System.out.println("Enter a json file to be read");
            // String filename = keyboard.nextLine();

            File input_1 = new File("/home/alex/Cal-poly-stuff/CSC-305/csc305-lab-2-comp-scipain/CSC305_Lab_2/input1.json");
            Scanner reader = new Scanner(input_1);
            String check = "";
            while (reader.hasNextLine()) {
                check += reader.nextLine();
            }
            System.out.println(check);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Person person1 = new Person("John", "Existing");
        Person person2 = new Person("Jane", "Hating");
        Person person3 = new Person("My money", "Not Existing");

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(person1);
        people.add(person2);
        people.add(person3);


        Award award1 = new Award("worst programmer", 2024);
        Award award2 = new Award("skill issue", 2001);
        Award award3 = new Award("broke mf", 2020);

        ArrayList<Award> awards = new ArrayList<Award>();

        awards.add(award1);
        awards.add(award2);
        awards.add(award3);

        System.out.println();
        System.out.println();
    }
}
