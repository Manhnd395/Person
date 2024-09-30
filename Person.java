public class Person extends GiangVien {
    public String name;
    public String dateOfbirth;
    public Person(){}
    public Person(String name, String dateOfbirth){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfbirth() {
        return dateOfbirth;
    }
    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
    public String getInfor() {
        return this.name + " " + this.dateOfbirth;
    }
}