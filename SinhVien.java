public class SinhVien extends Person{
    protected String msv;
    public SinhVien() {}
    public SinhVien(String name, String dateOfBirth, String msv) {
        super(name,dateOfBirth);
        this.msv = msv;
    }
    public String getMsv() {
        return msv;
    }
    public void setMsv(String msv) {
        this.msv = msv;
    }
    public String getInfo() {
        return super.getInfo() + " " +msv;
    }
}
