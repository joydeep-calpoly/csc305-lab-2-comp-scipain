package reader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.*;


public class Driver {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        ArrayList<Award> awardList = new ArrayList<Award>();
        try {
            String contents = new String(Files.readAllBytes((Paths.get("CSC305_Lab_2/input1.json"))));
            JSONObject input = new JSONObject(contents);
            String name = input.getString("name");
            JSONArray knownfor = input.getJSONArray("knownFor");
            JSONArray awards = input.getJSONArray("awards");

            Person person1 = new Person(name, knownfor);
            people.add(person1);
            

            for (Person person : people) {
                System.out.println(person.getName());
                System.out.println(person.getKnownFor());
            }  
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
            
        
    }
}
