package Model;

import java.util.Date;

public class Internship extends Candidate {
    
    private String major;
    private String Semester;
    private String university;

    public Internship(String major, String Semester, String university, String firstname, String lastname, Date dob, String address, long phone,String email, String type, String candidateID) {
        super(candidateID, firstname, lastname, dob, address, phone, email, type);
        this.major = major;
        this.Semester = Semester;
        this.university = university;
    }

    
    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    
}
