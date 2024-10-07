public class Person {
    protected String name;
    protected String dateOfBirth;
    public Person(){}
    public Person(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getdateOfBirth() {
        return dateOfBirth;
    }
    public void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getInfo() {
        return this.name + " " + this.dateOfBirth;
    }
}