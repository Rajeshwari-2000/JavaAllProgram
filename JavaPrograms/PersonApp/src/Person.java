import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private int perid;
    private String pname;
    private String MobNo;
    private Date bdate;

    public Person() {
        this(0, null, null, null);
    }

    public Person(int perid, String pname, String mobNo, Date bdate) {
        super();
        this.perid = perid;
        this.pname = pname;
        this.MobNo = mobNo;
        this.bdate = bdate;
    }

    public Person(int perid) {
        this.perid = perid;
        this.pname = null;
        this.MobNo = null;
        this.bdate = null;
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMobNo() {
        return MobNo;
    }

    public void setMobNo(String mobNo) {
        this.MobNo = mobNo;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dt = (bdate != null) ? sdf.format(bdate) : "N/A";
        return "Id: " + this.perid + "\nName: " + pname + "\nMobile: " + MobNo + "\nBDate: " + dt;
    }

    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dt = (bdate != null) ? sdf.format(bdate) : "N/A";
        
        System.out.println("ID: " + perid);
        System.out.println("Name: " + pname);
        System.out.println("Mobile No: " + MobNo);
        System.out.println("Bdate: " + dt);
    }
}
