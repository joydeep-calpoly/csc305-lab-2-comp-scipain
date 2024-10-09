package reader;
import org.json.JSONArray;
import org.json.JSONException;

class Person {
    private String name;
    private JSONArray knownFor;

    protected Person(String name, JSONArray knownFor){
        this.name = name;
        this.knownFor = knownFor;
    }

    public String getName() {
        return name;
    }

    public String getKnownFor() {
        String acheivements = "Known For:\n";
        for (int i = 0; i < knownFor.length(); i++) {
            try {
                acheivements = acheivements + "\t" + knownFor.get(i) + "\n";

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return acheivements;
    }
}