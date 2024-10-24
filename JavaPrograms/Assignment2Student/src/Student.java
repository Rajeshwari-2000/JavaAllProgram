public class Student {
    private int SId;
    private String SName;
    private String MobNo;
    private float m1, m2, m3;

    public Student() {
        this.SId = 0;
        this.SName = null;
        this.MobNo = null;
        this.m1 = 0.0f;
        this.m2 = 0.0f;
        this.m3 = 0.0f;
    }

    public Student(int sId, String sName, String mobNo, float m1, float m2, float m3) {
        this.SId = sId;
        this.SName = sName;
        this.MobNo = mobNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getSId() {
        return SId;
    }

    public void setSId(int sId) {
        this.SId = sId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String sName) {
        this.SName = sName;
    }

    public String getMobNo() {
        return MobNo;
    }

    public void setMobNo(String mobNo) {
        
        this.MobNo = mobNo;
    }

    public float getM1() {
        return m1;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }

    public float calculateAverage() {
        return (m1 + m2 + m3) / 3;
    }

    
    public String toString() {
        return "Id: " + SId + "\nName: " + SName + "\nMobNo: " + MobNo + "\nM1: " + m1 + "\nM2: " + m2 + "\nM3: " + m3 + "\nAverage: " + calculateAverage();
    }

    
   

    
    
}
