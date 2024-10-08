package reader;

public class Award {
    private int year;
    private String awardName;

    public Award(String awardName, int year){
        this.awardName = awardName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAwardName(){
        return awardName;
    }
    
}
