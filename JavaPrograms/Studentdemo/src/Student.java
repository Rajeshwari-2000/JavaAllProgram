import java.util.Scanner;

public class Student {
    static int min_passing_marks;
    static String degree;
    private static int cnt = 1; // Counter for generating unique student IDs

    static {
        min_passing_marks = 40;
        degree = "DAC";
    }

    private String sid; // Student ID
    private String sname; // Student Name
    private String address; // Student Address
    private int m1, m2, m3; // Marks

    private static String generateCode(String nm, String addr) {
        String code = "";
        if (nm != null && addr != null)
            code = nm.substring(0, 2) + addr.substring(0, 2) + cnt;
        else
            code = "xx" + "yy" + cnt;
        cnt++;
        return code;
    }

    public Student() {
        super();
    }

    public Student(String sname, String address, int m1, int m2, int m3) {
        this.sid = "S" + String.format("%03d", cnt); // Auto-generate ID
        this.sname = sname;
        this.address = address;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        cnt++; // Increment counter for the next ID
    }

    // Getters and setters...

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", m1=" + m1 + ", m2=" + m2
                + ", m3=" + m3 + "]";
    }
    
}