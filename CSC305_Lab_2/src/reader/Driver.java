package reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.*;


public class Driver {
    public static void main(String[] args) {
        
        try {
            File input_1 = new File("input1.json");
            File input_2 = new File("input2.json");
            File input_3 = new File("input3.json");  
            Scanner reader = new Scanner(input_1);
            while (reader.hasNextLine()) {
                
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Person person1 = new Person("John", "Existing");
        Person person2 = new Person("Jane", "Hating");
        Person person3 = new Person("My money", "Not Existing");

        ArrayList<Person> people = new ArrayList<Person>();

        Award award1 = new Award("worst programmer", 2024);
        Award award2 = new Award("skill issue", 2001);
        Award award3 = new Award("broke mf", 2020);

        ArrayList<Award> awards = new ArrayList<Award>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        awards.add(award1);
        awards.add(award2);
        awards.add(award3);

        System.out.println();
        System.out.println();
    }
}
