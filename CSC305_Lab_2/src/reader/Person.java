package reader;


class Person {
    private String name;
    private String knownFor;

    protected Person(String name, String knownFor){
        this.name = name;
        this.knownFor = knownFor;
    }

    public String getName() {
        return name;
    }

    public String getKnownFor(){
        return knownFor;
    }
}