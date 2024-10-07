public class GiangVien extends Person {
    protected String maGV;
    public GiangVien() {}
    public GiangVien(String name, String dateOfBirth, String maGV) {
        super(name, dateOfBirth);
        this.maGV = maGV;
    }
    public String getMaGV() {
        return maGV;
    }
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }
    public String getInfo() {
        return super.getInfo() + " " + maGV;
    }

}