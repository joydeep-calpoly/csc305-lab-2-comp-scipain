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
        System.out.println("test");

        Person person1 = new Person("John", "Existing");
        Person person2 = new Person("Jane", "Hating");
        Person person3 = new Person("My money", "Not Existing");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
    }
}
