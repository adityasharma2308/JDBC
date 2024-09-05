import com.mysql.cj.util.DnsSrv;

public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String getStudentCity;

    public Student(int studentId, String studentName, String studentPhone, String getStudentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.getStudentCity = getStudentCity;
    }

    public Student(String studentName, String studentPhone, String getStudentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.getStudentCity = getStudentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getGetStudentCity() {
        return getStudentCity;
    }

    public void setGetStudentCity(String getStudentCity) {
        this.getStudentCity = getStudentCity;
    }
}
