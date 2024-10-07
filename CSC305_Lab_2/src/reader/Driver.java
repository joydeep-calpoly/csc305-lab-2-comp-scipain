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
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("test");

        Person person1 = new Person("John", "Existing");

        ArrayList<Person> people = new ArrayList<Person>();
    }
}
