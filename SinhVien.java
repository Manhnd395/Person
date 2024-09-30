public class SinhVien {
    private String name;
    private short born_year;
    private String studentID;
    public SinhVien() {}
    public SinhVien(String name, short born_year, String studentID) {
        this.name = name;
        this.born_year = born_year;
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    public void setBorn_year(short born_year) {
        this.born_year = born_year;
    }
    public short getBorn_year() {return born_year;}
    public void setstudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getstudentID() {return studentID;}
}
